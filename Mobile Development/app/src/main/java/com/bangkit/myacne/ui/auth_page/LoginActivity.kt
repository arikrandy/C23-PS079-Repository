package com.bangkit.myacne.ui.auth_page

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.myacne.databinding.ActivityLoginBinding
import com.bangkit.myacne.ui.main_page.MainActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //get data from shared preferences
        val sharedPref = getSharedPreferences("my_prefs", MODE_PRIVATE)
        val email = sharedPref.getString("email", "")
        val password = sharedPref.getString("password", "")
        val isLogin = sharedPref.getBoolean("isLogin", false)
        if (isLogin) {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.apply {
            btnLogin.setOnClickListener {
                if (inputEmail.text.toString() != email || inputPassword.text.toString() != password) {

                    Log.d("LoginActivity", "email: $email, password: $password")
                    Log.d("LoginActivity", "inputEmail: ${inputEmail.text.toString()}, inputPassword: ${inputPassword.text.toString()}")
                    Toast.makeText(this@LoginActivity, "Username or Password is wrong", Toast.LENGTH_SHORT).show()
                } else {
                    //if username and password is correct
                    sharedPref.edit()
                        .putBoolean("isLogin", true)
                        .apply()
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }

            }
            tvRegister.setOnClickListener {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}