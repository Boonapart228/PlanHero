package com.example.planhero.presentation.sign_up_screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planhero.R
import com.example.planhero.presentation.navigation.model.Screens
import com.example.planhero.presentation.sign_up_screen.content.CreateAccountButton
import com.example.planhero.presentation.sign_up_screen.content.SignUpTextField
import com.example.planhero.presentation.sign_up_screen.content.SignUpTopBar
import com.example.planhero.ui.theme.LocalDimen

@Composable
fun SignUpContent(
    state: SignUpState,
    setEmail: (String) -> Unit,
    setLogin: (String) -> Unit,
    setPassword: (String) -> Unit,
    navigateToSignIn: (Screens) -> Unit
) {
    Scaffold(
        topBar = { SignUpTopBar(navigateToSignIn = { navigateToSignIn(Screens.SIGN_IN_SCREEN) }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(
                LocalDimen.current.columnSpaceBy,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SignUpTextField(
                value = state.email,
                textId = R.string.input_email,
                onValueChange = setEmail,
                modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
            )
            SignUpTextField(
                value = state.name,
                textId = R.string.input_login,
                onValueChange = setLogin,
                modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
            )
            SignUpTextField(
                value = state.password,
                textId = R.string.input_password,
                onValueChange = setPassword,
                modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
            )
            CreateAccountButton(modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding))
        }
    }
}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true
)
fun SignUpContentPreview() {
    SignUpContent(state = SignUpState(),
        setPassword = {},
        setLogin = {},
        setEmail = {},
        navigateToSignIn = {})
}