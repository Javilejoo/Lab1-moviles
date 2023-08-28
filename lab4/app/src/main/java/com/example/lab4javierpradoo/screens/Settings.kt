package com.example.lab4javierpradoo.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lab4javierpradoo.IconWithText
import com.example.lab4javierpradoo.R

@Composable
fun AppSettings(navController: NavController,modifier: Modifier){
    val icono1 = painterResource(id = R.drawable.usuario)
    val icono2 = painterResource(id = R.drawable.envelope)
    val icono3 = painterResource(id = R.drawable.bell)
    val icono4 = painterResource(id = R.drawable.eye_crossed)
    val icono5 = painterResource(id = R.drawable.interrogation)
    val icono6 = painterResource(id = R.drawable.info)
    Surface(
        Modifier.fillMaxSize(),
        color = Color.White) {
        Column {
            Text(text = "SETTINGS",modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .wrapContentSize(Alignment.TopCenter),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black)
            IconWithText(icono1, "Edit Profile",modifier)
            IconWithText(icono2, "Email Addresses", modifier)
            IconWithText(icono3, "Notification", modifier)
            IconWithText(icono4, "Privacy", modifier)
            IconWithText(icono5, "Help & Feedbak\nTroubleshooting and guide", modifier)
            IconWithText(icono6, "About\nApp information and documents", modifier)
            Text(text = "Logout", modifier = modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .wrapContentSize(Alignment.TopCenter), color = Color.Red)

        }

    }
}