package com.bangkit.myacne.ui.profile_page

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bangkit.myacne.R
import com.bangkit.myacne.databinding.FragmentProfileBinding
import com.bangkit.myacne.ui.auth_page.LoginActivity


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedPref =
            requireContext().getSharedPreferences("my_prefs", AppCompatActivity.MODE_PRIVATE)
        val name = sharedPref.getString("name", "")
        val email = sharedPref.getString("email", "")
        val password = sharedPref.getString("password", "")
        binding.apply {
            //turn fullname to username
            Log.d("name", name.toString())
            tvUsername.text = name!!.split(" ")[0]
            inputUsername.setText(name)
            inputEmail.setText(email)

            btnSave.setOnClickListener {
                if (inputOldPassword.text.toString() != password) {
                    Toast.makeText(requireContext(), "Old Password is wrong", Toast.LENGTH_SHORT)
                        .show()
                } else if (inputPassword.text.toString() != inputRepassword.text.toString()) {
                    Toast.makeText(
                        requireContext(),
                        "Password and Re-Password must be same",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(requireContext(), "Save Success", Toast.LENGTH_SHORT).show()
                    tvUsername.text = inputUsername.text.toString().split(" ")[0]
                    sharedPref.edit()
                        .putString("name", inputUsername.text.toString())
                        .putString("email", inputEmail.text.toString())
                        .putString("password", inputPassword.text.toString())
                        .apply()
                }
            }

            btnLogout.setOnClickListener {
                sharedPref.edit()
                    .putBoolean("isLogin", false)
                    .apply()
                val intent = Intent(requireContext(), LoginActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
            }
        }
    }
}