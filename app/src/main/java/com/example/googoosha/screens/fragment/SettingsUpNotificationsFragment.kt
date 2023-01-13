package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentSettingsUpNotificationsBinding
import com.example.googoosha.utils.mainReplaceFragment

class SettingsUpNotificationsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsUpNotificationsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsUpNotificationsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.applicationActive.setOnClickListener {
            mainReplaceFragment(ApplicationActiveFragment())
        }

        binding.applicationInactive.setOnClickListener {
            mainReplaceFragment(ApplicationInactiveFragment())
        }

    }
}
