package com.example.googoosha.screens

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.MainActivity
import com.example.googoosha.databinding.FragmentAuthBinding
import com.example.googoosha.utils.AUTH
import com.example.googoosha.utils.authReplaceFragment

class AuthFragment : Fragment() {
    private lateinit var binding: FragmentAuthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.authBtn.setOnClickListener {
            startActivity(Intent(AUTH, MainActivity::class.java))
            AUTH.finish()
        }
        binding.mailBtn.setOnClickListener {
            authReplaceFragment(SignupFragment())
        }
    }
}