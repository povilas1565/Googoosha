package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentAboutAppBinding
import com.example.googoosha.utils.mainReplaceFragment

class AboutAppFragment : Fragment() {
    private lateinit var binding: FragmentAboutAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAboutAppBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.rateApp.setOnClickListener() {
            mainReplaceFragment(RateAppFragment())
    }

        binding.errorReport.setOnClickListener() {
            mainReplaceFragment(ErrorReportFragment())
        }

        binding.tellFriends.setOnClickListener() {
            mainReplaceFragment(TellFriendsFragment())
        }


    }
}