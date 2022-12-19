package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentChangePhoneBinding
import com.example.googoosha.utils.authReplaceFragment

class ChangePhoneFragment : Fragment() {
    private lateinit var binding : FragmentChangePhoneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangePhoneBinding.inflate(inflater, container, false)
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
