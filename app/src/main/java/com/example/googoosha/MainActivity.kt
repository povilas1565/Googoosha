package com.example.googoosha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.googoosha.databinding.ActivityMainBinding
import com.example.googoosha.screens.AuthFragment
import com.example.googoosha.utils.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFields()
        initFuns()
    }

    private fun initFuns() {

    }

    private fun initFields() {
        replaceFragment(AuthFragment())
    }
}