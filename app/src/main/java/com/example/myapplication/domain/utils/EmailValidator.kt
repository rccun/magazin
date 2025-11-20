package com.example.myapplication.domain.utils

interface EmailValidator {
    fun validateEmail(email: String) : Boolean
}