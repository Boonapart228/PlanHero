package com.example.planhero.presentation.sign_in_screen.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.planhero.presentation.sign_in_screen.model.SignInNavigationEvent

@Composable
fun SignInScreen(
    viewModel: SignInViewModel,
    navigateToSignUpScreen: () -> Unit
) {
    val state by viewModel.state.collectAsState()
    LaunchedEffect(Unit) {
        viewModel.emit.collect {
            when (it) {
                SignInNavigationEvent.NavigateToSignUpScreen -> navigateToSignUpScreen()
            }
        }
    }
    SignInContent(
        state = state,
        setLogin = viewModel::setLogin,
        setPassword = viewModel::setPassword,
        navigateToSignUpScreen = viewModel::navigation
    )
}