package com.bangkit.myacne.ui.auth_page

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.myacne.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPref = getSharedPreferences("my_prefs", Context.MODE_PRIVATE)

        binding.apply {
            btnRegister.setOnClickListener {
                val name = inputUsername.text.toString()
                val password = inputPassword.text.toString()
                val email = inputEmail.text.toString()
                val repassword = inputRepassword.text.toString()

                if (name == "" || password == "" || email == "" || repassword == "") {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Please fill all the fields",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (password != repassword) {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Password and Re-Password must be same",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (!email.contains("@") && !email.
                        contains(".")
                ) {
                    Toast.makeText(this@RegisterActivity, "Email must be valid", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    Toast.makeText(
                        this@RegisterActivity,
                        "Register Success",
                        Toast.LENGTH_SHORT
                    ).show()
                    //save in shared preferences
                    sharedPref.edit()
                        .putString("name", name)
                        .putString("password", password)
                        .putString("email", email)
                        .putBoolean("isLogin", false)
                        .apply()
                    val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                tvLogin.setOnClickListener {
                    finish()
                }
            }
        }
    }
}