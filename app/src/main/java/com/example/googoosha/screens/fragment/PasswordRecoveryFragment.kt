package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentPasswordRecoveryBinding
import com.example.googoosha.utils.authReplaceFragment

class PasswordRecoveryFragment : Fragment() {
    private lateinit var binding : FragmentPasswordRecoveryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPasswordRecoveryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
            binding.authBtn.setOnClickListener {
                authReplaceFragment(AuthFragment(), false)
            }

            binding.signupBtn.setOnClickListener {
                authReplaceFragment(SignupFragment(), false)
            }
    }
}