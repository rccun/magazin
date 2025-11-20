package com.example.myapplication.presentation.signin

interface SignInEvents {
    data class OnEmailChange(val value: String): SignInEvents
    data class OnPasswordChange(val value: String): SignInEvents
    data object OnNextClick: SignInEvents
    data object OnSignUpClick: SignInEvents
    data object OnVkClick: SignInEvents
    data object OnYandexClick: SignInEvents
}