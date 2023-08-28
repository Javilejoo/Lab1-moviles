package com.example.lab4javierpradoo.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens(route = "MainScreen")

    object SecondScreen: AppScreens(route = "CampusCentral")
    object Profile: AppScreens(route = "Profile")
    object Emergency: AppScreens(route = "Emergency")
    object Settings: AppScreens(route = "Settings")
}
