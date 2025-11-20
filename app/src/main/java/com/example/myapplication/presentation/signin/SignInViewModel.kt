package com.example.myapplication.presentation.signin

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SignInViewModel constructor(
   // private val emailUseCase : EmailUseCase
) : ViewModel() {
    private val _state = mutableStateOf(SignInState())
    val state: State<SignInState> = _state
    fun onEvent(event: SignInEvents) {
        when (event) {
            is SignInEvents.OnEmailChange -> {
                _state.value = _state.value.copy(
                    email = event.value
                )
            }
            is SignInEvents.OnPasswordChange -> {
                _state.value = _state.value.copy(
                    password = event.value
                )
            }
            SignInEvents.OnNextClick -> {
//                val res = emailUseCase.execute(_state.value.email) я не подключала хилт потому что он бы не успел скачаться просто, поэтому юзкейсы итп работать не будут

//                if (res) {
//
//                }
            }
        }
    }
}