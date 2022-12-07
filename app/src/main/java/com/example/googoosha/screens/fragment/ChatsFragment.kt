package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.databinding.FragmentChatsBinding
import com.example.googoosha.screens.fragment.ChatFragment
import com.example.googoosha.utils.mainReplaceFragment

class ChatsFragment : Fragment() {
   private lateinit var binding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(inflater, container ,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.chatExample.setOnClickListener {
            mainReplaceFragment(ChatFragment())
        }
    }

}