package com.example.planhero.presentation.sign_in_screen.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.planhero.R
import com.example.planhero.presentation.sign_in_screen.content.SignInButton
import com.example.planhero.presentation.sign_in_screen.content.SignInTextField
import com.example.planhero.presentation.sign_in_screen.content.SignUpButton
import com.example.planhero.ui.theme.LocalDimen

@Composable
fun SignInContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(
            LocalDimen.current.columnSpaceBy,
            Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        SignInTextField(
            value = "",
            textId = R.string.input_login,
            onValueChange = {},
            modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
        )
        SignInTextField(
            value = "",
            textId = R.string.input_password,
            onValueChange = {},
            modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
        )
        SignInButton(modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding))
        SignUpButton(modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding))
    }
}

@Composable
@Preview(
    showSystemUi = true,
    showBackground = true
)
fun SignInContentPreview() {
    SignInContent()
}