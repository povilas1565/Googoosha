package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentServicesAndAdditionalServicesBinding
import com.example.googoosha.utils.mainReplaceFragment

class ServicesAndAdditionalServicesFragment : Fragment() {
    private lateinit var binding: FragmentServicesAndAdditionalServicesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentServicesAndAdditionalServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.raiseProfile.setOnClickListener() {
            mainReplaceFragment(RaiseProfileFragment())
        }

        binding.vipStatus.setOnClickListener() {
            mainReplaceFragment(VipStatusFragment())
        }
    }
}