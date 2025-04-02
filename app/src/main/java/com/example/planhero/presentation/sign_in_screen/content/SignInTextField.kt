package com.example.planhero.presentation.sign_in_screen.content

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.planhero.R

@Composable
fun SignInTextField(
    value: String,
    textId: Int,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(stringResource(id = textId)) },
        trailingIcon = {
            IconButton(onClick = { onValueChange("") }) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_clear),
                    contentDescription = null
                )
            }
        },
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
@Preview(showBackground = true)
fun SignInTextFieldPreview() {
    SignInTextField("text", textId = R.string.input_login, onValueChange = {})
}