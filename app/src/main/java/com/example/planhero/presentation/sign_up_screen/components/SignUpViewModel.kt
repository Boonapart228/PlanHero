package com.example.planhero.presentation.sign_up_screen.components

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.planhero.presentation.navigation.model.Screens
import com.example.planhero.presentation.sign_up_screen.model.SignUpNavigationEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(SignUpState())
    val state = _state.asStateFlow()

    private val _emit = MutableSharedFlow<SignUpNavigationEvent>()
    val emit = _emit.asSharedFlow()

    fun setLogin(name: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(name = name)
            }
        }
    }

    fun setEmail(email: String) {
        viewModelScope.launch {
            _state.update {
                it.copy(
                    email = email
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
                Screens.SIGN_IN_SCREEN -> _emit.emit(SignUpNavigationEvent.NavigateToSignIn)
                Screens.SIGN_UP_SCREEN -> {}
            }
        }
    }
}