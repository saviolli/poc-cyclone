package com.poc.cyclone

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.poc.cyclone.viewmodel.MainViewModel

@Composable
fun MainScreen(mainViewModel: MainViewModel) {
    Text(text = "Hello ${mainViewModel.getAppName()}")
}