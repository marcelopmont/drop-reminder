package com.dropreminder.repositories.login

class LoginRepository {


    fun fetchLogin(email: String, password: String, onSuccess: (userName: String) -> Unit) {
        onSuccess(email)
    }

}