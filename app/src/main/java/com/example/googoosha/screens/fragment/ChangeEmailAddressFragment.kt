package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentChangeEmailAddressBinding
import com.example.googoosha.utils.authReplaceFragment

class ChangeEmailAddressFragment : Fragment() {
    private lateinit var binding: FragmentChangeEmailAddressBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangeEmailAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
            binding.signupBtn.setOnClickListener() {
                authReplaceFragment(SignupFragment(), false)
            }
    }
}