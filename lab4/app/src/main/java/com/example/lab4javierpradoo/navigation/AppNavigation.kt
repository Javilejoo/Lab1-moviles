package com.example.lab4javierpradoo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab4javierpradoo.screens.CampusCentral
import com.example.lab4javierpradoo.screens.bodyContent
import com.example.lab4javierpradoo.screens.AppSettings
import com.example.lab4javierpradoo.screens.MyProfile
import com.example.lab4javierpradoo.screens.Emergency



@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            bodyContent(navController)
        }
        composable(route =AppScreens.SecondScreen.route){
            CampusCentral(navController)
        }
        composable(route = AppScreens.Profile.route){
            MyProfile(navController = navController)
        }
        composable(route = AppScreens.Emergency.route){
            Emergency(navController)
        }
        composable(route = AppScreens.Settings.route){
            AppSettings(navController, modifier = Modifier)
        }
    }
}

