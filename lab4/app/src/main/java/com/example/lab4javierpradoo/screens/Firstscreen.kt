package com.example.lab4javierpradoo.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.navigation.NavController

import com.example.lab4javierpradoo.navigation.AppScreens


@Composable
fun bodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("First Screen")
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
          Text("Campus Central")
        }
        Button(onClick = { navController.navigate(route = AppScreens.Profile.route) }) {
            Text("Profile")
        }
        Button(onClick = { navController.navigate(route = AppScreens.Emergency.route) }) {
            Text("Emergency")
        }
        Button(onClick = { navController.navigate(route = AppScreens.Settings.route) }) {
            Text("Settings")
        }
    }
}
