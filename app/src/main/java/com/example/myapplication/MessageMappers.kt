package com.example.myapplication.data.network.dto

import com.example.myapplication.domain.Message
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.longOrNull
import java.time.Instant
import java.time.format.DateTimeParseException

private fun JsonPrimitive?.toEpochMillis(): Long {
    if (this == null) return 0L
    this.longOrNull?.let { return it }
    return try {
        Instant.parse(this.content).toEpochMilli()
    } catch (e: DateTimeParseException) {
        0L
    }
}

fun MessageDto.toDomain(): Message = Message(
    id = id ?: "",
    sender = sender ?: "Unknown",
    text = text ?: "",
    createdAt = createdAt?.jsonPrimitive.toEpochMillis()
)

fun List<MessageDto>.toDomain(): List<Message> = map { it.toDomain() }