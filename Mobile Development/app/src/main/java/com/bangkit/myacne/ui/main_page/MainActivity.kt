package com.bangkit.myacne.ui.main_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bangkit.myacne.R
import com.bangkit.myacne.databinding.ActivityMainBinding
import com.bangkit.myacne.ui.profile_page.ProfileFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)

        binding.apply {
            btnHome.setOnClickListener {
                switchFragment(it)
            }
            btnProfile.setOnClickListener {
                switchFragment(it)
            }
        }
    }

    private fun switchFragment(view: View) {
        var fragment: Fragment? = null
        binding.apply {
            when (view) {
                btnHome -> {
                    fragment = MenuFragment()
                }

                btnProfile -> {
                    fragment = ProfileFragment()
                }
            }
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.nav_host_fragment,
                    fragment!!
                )
                .commit()
        }
    }
}