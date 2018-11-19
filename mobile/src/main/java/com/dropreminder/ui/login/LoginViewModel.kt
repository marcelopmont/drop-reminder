package com.dropreminder.ui.login

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.dropreminder.repositories.login.LoginRepository

class LoginViewModel : ViewModel() {

    private val loginRepo = LoginRepository()

    internal val userName = MutableLiveData<String>()

    internal fun login(email: String, password: String) {

        loginRepo.fetchLogin(email, password) { userName ->
            this.userName.postValue(userName)
        }
    }

}
