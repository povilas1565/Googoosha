package com.example.googoosha.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.googoosha.databinding.ActivityAuthBinding
import com.example.googoosha.utils.AUTH
import com.example.googoosha.utils.authReplaceFragment

class AuthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFields()
    }

    private fun initFields() {
        AUTH = this
        authReplaceFragment(SplashFragment(), false)
    }
}