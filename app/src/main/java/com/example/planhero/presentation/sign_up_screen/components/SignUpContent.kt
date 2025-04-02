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
import com.example.planhero.presentation.sign_up_screen.content.CreateAccountButton
import com.example.planhero.presentation.sign_up_screen.content.SignUpTextField
import com.example.planhero.presentation.sign_up_screen.content.SignUpTopBar
import com.example.planhero.ui.theme.LocalDimen

@Composable
fun SignUpContent() {
    Scaffold(
        topBar = { SignUpTopBar() }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(
                LocalDimen.current.columnSpaceBy,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SignUpTextField(
                value = "",
                textId = R.string.input_email,
                onValueChange = {},
                modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
            )
            SignUpTextField(
                value = "",
                textId = R.string.input_login,
                onValueChange = {},
                modifier = Modifier.padding(horizontal = LocalDimen.current.horizontalPadding)
            )
            SignUpTextField(
                value = "",
                textId = R.string.input_password,
                onValueChange = {},
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
    SignUpContent()
}