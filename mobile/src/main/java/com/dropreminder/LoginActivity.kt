package com.dropreminder

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dropreminder.ui.login.LoginViewModel
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)


        viewModel.userName.observe(this, Observer {
            loginWelcome.text = "Olá, $it"
        })


        setupButtons()
    }

    private fun setupButtons() {
        loginButton.setOnClickListener {
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()

            viewModel.login(email, password)
        }
    }

}
