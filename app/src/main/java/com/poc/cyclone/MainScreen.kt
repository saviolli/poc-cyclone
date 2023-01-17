package com.poc.cyclone

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(mainViewModel: MainViewModel) {
    Text(text = "Hello ${mainViewModel.getAppName()}")
}