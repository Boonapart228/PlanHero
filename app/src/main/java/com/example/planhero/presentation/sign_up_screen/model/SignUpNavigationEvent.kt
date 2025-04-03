package com.example.planhero.presentation.sign_up_screen.model

sealed class SignUpNavigationEvent {
    data object NavigateToSignIn : SignUpNavigationEvent()
}