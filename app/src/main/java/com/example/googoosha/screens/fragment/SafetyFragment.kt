package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.databinding.FragmentSafetyBinding
import com.example.googoosha.utils.mainReplaceFragment

class SafetyFragment : Fragment() {
   private lateinit var binding: FragmentSafetyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSafetyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.aboutPasswords.setOnClickListener {
            mainReplaceFragment(AboutPasswordsFragment())
        }

        binding.bindingPhone.setOnClickListener() {
            mainReplaceFragment(LinkFragment())
        }

        binding.aboutHacking.setOnClickListener() {
            mainReplaceFragment(AboutHackingFragment())
        }

        binding.hackingPincodes.setOnClickListener() {
            mainReplaceFragment(HackingPincodesFragment())
        }

        binding.sendingSms.setOnClickListener() {
            mainReplaceFragment(SendingSMSFragment())
        }

        binding.aboutPhones.setOnClickListener() {
            mainReplaceFragment(AboutPhonesFragment())
        }

        binding.recommendations.setOnClickListener() {
            mainReplaceFragment(GeneralRecommendationsFragment())
        }
    }
}