package com.example.planhero.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.planhero.presentation.navigation.model.Screens
import com.example.planhero.presentation.sign_in_screen.component.SignInScreen
import com.example.planhero.presentation.sign_in_screen.component.SignInViewModel
import com.example.planhero.presentation.sign_up_screen.components.SignUpScreen
import com.example.planhero.presentation.sign_up_screen.components.SignUpViewModel

@Composable
fun Navigation(modifier: Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SIGN_IN_SCREEN.route,
        modifier = modifier
    ) {
        composable(route = Screens.SIGN_IN_SCREEN.route) {
            val viewModel: SignInViewModel = viewModel()
            SignInScreen(
                viewModel = viewModel,
                navigateToSignUpScreen = { navController.navigate(Screens.SIGN_UP_SCREEN.route) }
            )
        }
        composable(route = Screens.SIGN_UP_SCREEN.route) {
            val viewModel: SignUpViewModel = viewModel()
            SignUpScreen(
                viewModel = viewModel,
                navigateToSignIn = { navController.navigate(Screens.SIGN_IN_SCREEN.route) }
            )
        }
    }
}