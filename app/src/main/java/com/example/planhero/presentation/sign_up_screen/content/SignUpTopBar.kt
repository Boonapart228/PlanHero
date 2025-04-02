package com.example.planhero.presentation.sign_up_screen.content

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.planhero.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpTopBar() {
    CenterAlignedTopAppBar(title = { Text(text = stringResource(id = R.string.registration)) },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
            }
        })
}

@Composable
@Preview
fun SignUpTopBarPreview() {
    SignUpTopBar()
}