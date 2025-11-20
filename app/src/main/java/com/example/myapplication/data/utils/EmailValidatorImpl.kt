package com.example.myapplication.data.utils

import android.util.Patterns
import com.example.myapplication.domain.utils.EmailValidator

class EmailValidatorImpl: EmailValidator {


    override fun validateEmail(email: String): Boolean {
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true
        }
        else return false
    }
}