package com.example.planhero.presentation.sign_up_screen.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.example.planhero.presentation.sign_up_screen.model.SignUpNavigationEvent

@Composable
fun SignUpScreen(
    viewModel: SignUpViewModel,
    navigateToSignIn: () -> Unit
) {
    val state by viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.emit.collect {
            when (it) {
                SignUpNavigationEvent.NavigateToSignIn -> navigateToSignIn()
            }
        }
    }

    SignUpContent(
        state = state,
        setEmail = viewModel::setEmail,
        setLogin = viewModel::setLogin,
        setPassword = viewModel::setPassword,
        navigateToSignIn = viewModel::navigation
    )
}