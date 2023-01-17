package com.poc.cyclone

import com.poc.cyclone.viewmodel.MainViewModel
import org.koin.dsl.module

val appModule = module {
    factory { MainViewModel() }
}