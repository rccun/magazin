package com.example.myapplication.presentation.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun MainScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text("Искать описания")
        }
        Text(stringResource(R.string.actions))
        LazyRow {
            repeat(3) {
                Image(painter = painterResource(R.drawable.banner))
            }
        }
    }

}