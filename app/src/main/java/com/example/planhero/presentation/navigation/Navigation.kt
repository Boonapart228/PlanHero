package com.example.planhero.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.planhero.presentation.navigation.model.Screens
import com.example.planhero.presentation.sign_up_screen.content.SignUpContent
import com.example.planhero.presentation.sign_in_screen.component.SignInScreen

@Composable
fun Navigation(modifier: Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.SIGN_IN_SCREEN.route, modifier = modifier) {
        composable(route = Screens.SIGN_IN_SCREEN.route) {
            SignInScreen()
        }
        composable(route = Screens.SIGN_UP_SCREEN.route) {
            SignUpContent()
        }
    }
}