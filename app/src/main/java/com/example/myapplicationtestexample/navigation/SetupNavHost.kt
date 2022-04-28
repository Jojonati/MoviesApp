package com.example.myapplicationtestexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplicationtestexample.screens.MainScreen
import com.example.myapplicationtestexample.screens.SplashScreenn
import com.example.myapplicationtestexample.utils.Constants

sealed class NavRoute(val route: String) {
    object Splash: NavRoute(Constants.Screens.SPLASH_SCREEN)
    object Details: NavRoute(Constants.Screens.DETAILS_SCREEN)
    object Main: NavRoute(Constants.Screens.MAIN_SCREEN)
}


@Composable
fun SetupNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavRoute.Splash.route) {
        composable(NavRoute.Main.route) {
            MainScreen()
        }
        composable(NavRoute.Splash.route) {
            SplashScreenn(navController = navController)
        }
        composable(NavRoute.Details.route) {

        }
    }
}