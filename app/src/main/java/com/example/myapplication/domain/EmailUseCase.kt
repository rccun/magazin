package com.example.myapplication.domain

import com.example.myapplication.domain.utils.EmailValidator

class EmailUseCase(private val emailValidator: EmailValidator) {
    fun execute(email: String) : Boolean{
        return emailValidator.validateEmail(email)
    }
}