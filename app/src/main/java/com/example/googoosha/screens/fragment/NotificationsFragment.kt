package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.R
import com.example.googoosha.databinding.FragmentNotificationsBinding
import com.example.googoosha.utils.mainReplaceFragment

class NotificationsFragment : Fragment() {
  private lateinit var binding: FragmentNotificationsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.acceptBtn1.setOnClickListener() {
            mainReplaceFragment(NotificationsFragment())
        }

        binding.acceptBtn2.setOnClickListener() {
            mainReplaceFragment(NotificationsFragment())
        }

        binding.acceptBtn3.setOnClickListener() {
            mainReplaceFragment(NotificationsFragment())
        }

        binding.acceptBtn4.setOnClickListener() {
            mainReplaceFragment(NotificationsFragment())
        }

    }

}