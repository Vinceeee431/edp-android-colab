package com.example.myapplication // <-- change this to YOUR package name

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                BusinessCard()
            }
        }
    }
}

// ---- Step 1 & 2: root composable + outer layout ----
@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5)), // light background
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // ---- Step 3: circular avatar ----
        // Modifier order matters: size -> clip -> border
        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            contentDescription = "Profile photo",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(3.dp, Color(0xFF800000), CircleShape)
        )

        // If you don't have a drawable yet, comment the Image above out and use this instead:
        // Box(
        //     modifier = Modifier
        //         .size(120.dp)
        //         .clip(CircleShape)
        //         .background(Color(0xFF800000)),
        //     contentAlignment = Alignment.Center
        // ) {
        //     Text(text = "JD", fontSize = 32.sp, color = Color.White, fontWeight = FontWeight.Bold)
        // }

        // ---- Step 4: name and title ----
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Vince Joshua Tan", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text(text = "Android Developer", fontSize = 16.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(24.dp))

        // ---- Step 5: reusable contact rows ----
        ContactRow(icon = Icons.Filled.Phone, text = "+09213085706")
        ContactRow(icon = Icons.Filled.Email, text = "vjtan45319@liceo.edu.ph")
        ContactRow(icon = Icons.Filled.LocationOn, text = "Cagayan de Oro City, PH")
    }
}

// ---- Step 5: reusable ContactRow composable ----
@Composable
fun ContactRow(icon: ImageVector, text: String, onClick: () -> Unit = {}) {
    Row(
        modifier = Modifier
            .padding(vertical = 6.dp)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = text, tint = Color(0xFF800000))
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 14.sp)
    }
}

// ---- Step 6: preview ----
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    MaterialTheme {
        BusinessCard()
    }
}

// test
// test