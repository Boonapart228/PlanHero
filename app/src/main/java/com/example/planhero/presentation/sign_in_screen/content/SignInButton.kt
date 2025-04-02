package com.example.planhero.presentation.sign_in_screen.content

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.planhero.R

@Composable
fun SignInButton(
    modifier: Modifier = Modifier
) {
    Button(onClick = { /*TODO*/ }, modifier = modifier.fillMaxWidth()) {
        Text(text = stringResource(id = R.string.sign_in))
    }
}

@Composable
@Preview(showSystemUi = true)
fun SignInButtonPreview() {
    SignInButton()
}