package com.example.googoosha.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentAuthBinding
import com.example.googoosha.databinding.FragmentSplashBinding
import com.example.googoosha.utils.replaceFragment

class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.authBtn.setOnClickListener {
            replaceFragment(AuthFragment(), false)
        }
        binding.signupBtn.setOnClickListener {
            replaceFragment(SignupFragment(), false)
        }
    }
}