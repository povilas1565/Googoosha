package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.databinding.FragmentHomeBinding
import com.example.googoosha.utils.authReplaceFragment
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container ,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.notifyBtn.setOnClickListener {
            replaceFragment(NotificationsFragment())
        }

        binding.filterBtn.setOnClickListener {
            binding.alphaBg.visibility = View.VISIBLE
            binding.filterView.visibility = View.VISIBLE
        }

        binding.signupBtn.setOnClickListener {
            authReplaceFragment(SignupFragment(), false)
        }
    }

}