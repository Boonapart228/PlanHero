package com.example.planhero.presentation.sign_in_screen.component

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.planhero.presentation.navigation.model.Screens
import com.example.planhero.presentation.sign_in_screen.model.SignInNavigationEvent
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class SignInViewModel : ViewModel() {
    private val _state = MutableStateFlow(SignInState())
    val state = _state.asStateFlow()

    private val _emit = MutableSharedFlow<SignInNavigationEvent>()
    val emit = _emit.asSharedFlow()

    fun setLogin(login: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    login = login
                )
            }
        }
    }

    fun setPassword(password: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    password = password
                )
            }
        }
    }

    fun navigation(screens: Screens) {
        viewModelScope.launch {
            when (screens) {
                Screens.SIGN_IN_SCREEN -> {}
                Screens.SIGN_UP_SCREEN -> _emit.emit(SignInNavigationEvent.NavigateToSignUpScreen)
            }
        }
    }
}