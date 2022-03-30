package co.kingsleyetoka.common.utils

import android.util.Patterns
import java.util.regex.Pattern

enum class EmailErrorState{
    EMPTY_EMAIL,
    INVALID_EMAIL,
    NONE
}

enum class PasswordErrorsState{
    EMPTY_PASSWORD,
    INVALID_PASSWORD,
    NONE
}

fun String.validateEmail(): EmailErrorState{
    if(this.isEmpty()) return EmailErrorState.EMPTY_EMAIL
    return if(Patterns.EMAIL_ADDRESS.matcher(this).matches()){
        EmailErrorState.NONE
    }else{
        EmailErrorState.INVALID_EMAIL
    }
}

fun String.validatePassword(): PasswordErrorsState{
    val passwordREGEX = Pattern.compile("^" +
            "(?=.*[0-9])" +         //at least 1 digit
            "(?=.*[a-z])" +         //at least 1 lower case letter
            "(?=.*[A-Z])" +         //at least 1 upper case letter
            "(?=.*[a-zA-Z])" +      //any letter
            "(?=.*[@#$%^&+=])" +    //at least 1 special character
            "(?=\\S+$)" +           //no white spaces
            ".{8,}" +               //at least 8 characters
            "$");

    if(this.isEmpty()) return PasswordErrorsState.EMPTY_PASSWORD
    return if (passwordREGEX.matcher(this).matches()){
        PasswordErrorsState.NONE
    }else PasswordErrorsState.INVALID_PASSWORD
}