package com.petproject.market.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.petproject.market.*

import com.petproject.market.ui.theme.TestBackground
import com.petproject.market.ui.theme.TestBlue
import com.petproject.market.ui.theme.TestOrange

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            BoxWithConstraints(modifier = Modifier
                .fillMaxSize()
                .background(TestBackground),
                contentAlignment = Alignment.BottomCenter
            ){
                Column(modifier = Modifier
                    .fillMaxSize()
                ) {
                    Head()
                    HotSales()
                    BestSeller()
                }
                Explorer()
            }
        }
    }
}