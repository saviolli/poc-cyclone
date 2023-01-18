package com.poc.cyclone.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.poc.cyclone.login.LoginActivity
import com.poc.cyclone.ui.theme.CycloneTheme
import com.poc.cyclone.viewmodel.MainViewModel
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class MainActivity : ComponentActivity() {

    private val mainViewModel: MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CycloneTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MainScreen(mainViewModel = mainViewModel)
                }
            }
        }
        observe()
    }

    private fun observe() {
        lifecycleScope.launch {
            mainViewModel.sharedFlow.collect {
                when (it) {
                    is MainViewModel.MainEvent.Login -> {
                        goToLogin()
                    }
                }
            }
        }
    }

    private fun goToLogin() {
        startActivity(Intent(this@MainActivity, LoginActivity::class.java))
    }
}