package com.example.myapplication.data.repository

import com.example.myapplication.core.AppResult
import com.example.myapplication.data.network.ChatApiService
import com.example.myapplication.data.network.dto.MessageDto
import com.example.myapplication.data.network.dto.NewMessageDto
import com.example.myapplication.data.network.dto.toDomain
import com.example.myapplication.domain.ChatRepository
import com.example.myapplication.domain.Message
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

class ChatRepositoryImpl(
    private val api: ChatApiService,
    private val cacheFile: File
) : ChatRepository {

    private val json = Json { ignoreUnknownKeys = true }

    override suspend fun getMessages(): AppResult<List<Message>> =
        try {
            val dtos = api.getMessages()
            try { cacheFile.writeText(json.encodeToString<List<MessageDto>>(dtos)) } catch (e: Exception) {}
            AppResult.Success(dtos.toDomain())
        } catch (e: Exception) {
            if (cacheFile.exists()) {
                try {
                    val dtos = json.decodeFromString<List<MessageDto>>(cacheFile.readText())
                    AppResult.Success(dtos.toDomain())
                } catch (e2: Exception) {
                    safeCall { throw e }
                }
            } else {
                safeCall { throw e }
            }
        }

    override suspend fun sendMessage(sender: String, text: String): AppResult<Unit> =
        safeCall {
            val dto = NewMessageDto(
                sender = sender,
                text = text,
                createdAt = System.currentTimeMillis()
            )
            api.sendMessage(dto)
            Unit
        }

    private inline fun <T> safeCall(block: () -> T): AppResult<T> =
        try { AppResult.Success(block()) }
        catch (e: UnknownHostException) { AppResult.Failure.NoInternet }
        catch (e: SocketTimeoutException) { AppResult.Failure.Timeout }
        catch (e: IOException) { AppResult.Failure.NoInternet }
        catch (e: Exception) { AppResult.Failure.Unknown(e.message) }
}