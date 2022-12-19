package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentGuideBinding
import com.example.googoosha.utils.mainReplaceFragment

class GuideFragment : Fragment() {
    private lateinit var binding: FragmentGuideBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGuideBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.firstTimeStart.setOnClickListener() {
            mainReplaceFragment(FirstTimeStartFragment())
        }

        binding.serviceRules.setOnClickListener() {
            mainReplaceFragment(ServiceRulesFragment())
        }
    }
}