package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentStatisticsTotalEarnedFromVipBinding

class StatisticsTotalEarnedFromVipFragment : Fragment() {
    private lateinit var binding: FragmentStatisticsTotalEarnedFromVipBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatisticsTotalEarnedFromVipBinding.inflate(inflater, container, false)
        return binding.root
    }
}