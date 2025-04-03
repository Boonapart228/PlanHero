package com.example.planhero.presentation.sign_in_screen.model

sealed class SignInNavigationEvent {
    data object NavigateToSignUpScreen : SignInNavigationEvent()
}