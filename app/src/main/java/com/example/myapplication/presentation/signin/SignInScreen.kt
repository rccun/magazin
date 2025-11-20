package com.example.myapplication.presentation.signin

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.Route

@Composable
fun SignInScreen(navController: NavController) {
    val useCase = remember { EmailUseCase }
    val viewModel = viewModel { SignInViewModel() }
    val state = viewModel.state.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(stringResource(R.string.welcome), modifier = Modifier.padding(top = 59.dp))
        Text(stringResource(R.string.description), modifier = Modifier.padding(top = 23.dp))
        Text(stringResource(R.string.email), modifier = Modifier.padding(top = 64.dp))
        TextField(
            value = state.email,
            onValueChange = { viewModel.onEvent(SignInEvents.OnEmailChange(it)) },
            modifier = Modifier
                .padding(top = 4.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(16.dp)),
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFFF5F5F9),

            )
        )

        Text(stringResource(R.string.password), modifier = Modifier.padding(top = 14.dp))
        TextField(
            value = state.password, onValueChange = { viewModel.onEvent(SignInEvents.OnPasswordChange(it)) }, modifier = Modifier
                .padding(top = 4.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(16.dp)),
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFFF5F5F9))
        )

        Button(
            onClick = {
                viewModel.onEvent(SignInEvents.OnNextClick)
                navController.navigate(Route.Main.route)
            },
            modifier = Modifier.fillMaxWidth().padding(top = 14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1A6FEE)
            )
        ) {
            Text(stringResource(R.string.next))
        }
        Text(
            stringResource(R.string.sign_up),
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 15.dp),
            color = Color(0xFF2074F2)
        )
        Text(
            stringResource(R.string.or_menu),
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 59.dp)
        )
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            colors = ButtonDefaults.buttonColors(
                //containerColor = Color(0xFFFFFFFF),

            )) {
            Text(stringResource(R.string.vk))
        }
        Button(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 16.dp),
            colors = ButtonDefaults.buttonColors(
                //containerColor = Color(0xFFFFFFFF),

                )) {
            Text(stringResource(R.string.yandex))
        }
    }
}