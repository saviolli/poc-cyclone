package com.poc.cyclone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val sharedFlow = MutableSharedFlow<MainEvent>()

    fun getAppName() = "Cyclone"

    fun goToLogin() = viewModelScope.launch {
        sharedFlow.emit(MainEvent.Login)
    }

    sealed class MainEvent {
        object Login: MainEvent()
    }
}