package com.poc.cyclone.view

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.poc.cyclone.viewmodel.MainViewModel

@Composable
fun MainScreen(mainViewModel: MainViewModel) {
    ConstraintLayout {
        val (button, text) = createRefs()

        Button(
            onClick = {
                mainViewModel.goToLogin()
            },
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text("LOGIN")
        }


        Text("Hello {${mainViewModel.getAppName()}}", Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 16.dp)
        })
    }
}