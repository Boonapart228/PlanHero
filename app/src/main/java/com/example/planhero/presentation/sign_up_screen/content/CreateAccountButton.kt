package com.example.planhero.presentation.sign_up_screen.content

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.planhero.R

@Composable
fun CreateAccountButton(
    modifier: Modifier = Modifier
) {
    Button(
        onClick =
        { /*TODO*/ }, modifier = modifier.fillMaxWidth()
    )
    {
        Text(text = stringResource(id = R.string.sign_up))
    }
}