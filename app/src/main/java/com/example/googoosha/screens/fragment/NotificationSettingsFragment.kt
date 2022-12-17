package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentNotificationSettingsBinding
import com.example.googoosha.utils.authReplaceFragment
import com.example.googoosha.utils.mainReplaceFragment


class NotificationSettingsFragment : Fragment() {
    private lateinit var binding: FragmentNotificationSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }
}





