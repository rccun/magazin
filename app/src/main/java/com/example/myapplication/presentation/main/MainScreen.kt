package com.example.myapplication.presentation.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R

@Composable
fun MainScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 24.dp)) {
            Text("Искать описания")
        }
        Text(stringResource(R.string.actions), modifier = Modifier.padding(top = 32.dp))
//        LazyRow {
//            repeat(3) {
//                Text("placehold")
//                //Image(painter = painterResource(R.drawable.banner))
//            }
//        }
    }

}