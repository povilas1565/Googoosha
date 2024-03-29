package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.databinding.FragmentChatBinding
import com.example.googoosha.utils.mainReplaceFragment

class ChatFragment : Fragment() {
   private lateinit var binding: FragmentChatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatBinding.inflate(inflater, container ,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.callBtn.setOnClickListener {
            mainReplaceFragment(CallPhoneFragment())
        }

        binding.videoBtn.setOnClickListener() {
            mainReplaceFragment(CallVideoFragment())
        }
    }

}