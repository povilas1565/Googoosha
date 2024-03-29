package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.R
import com.example.googoosha.databinding.FragmentVipBinding
import com.example.googoosha.utils.authReplaceFragment

class VipFragment : Fragment() {
   private lateinit var binding: FragmentVipBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVipBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.signupBtn.setOnClickListener {
            authReplaceFragment(SignupFragment(), false)
        }
    }
}