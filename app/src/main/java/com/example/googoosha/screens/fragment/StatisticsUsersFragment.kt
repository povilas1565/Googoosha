package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentStatisticsUsersBinding
import com.example.googoosha.utils.mainReplaceFragment

class StatisticsUsersFragment : Fragment() {
    private lateinit var binding: FragmentStatisticsUsersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatisticsUsersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.statisticsTotalEarned.setOnClickListener {
            mainReplaceFragment(StatisticsTotalEarnedFragment())
        }

        binding.statisticsTotalEarnedFromMoney.setOnClickListener {
            mainReplaceFragment(StatisticsTotalEarnedFromMoneyFragment())
        }

        binding.statisticsTotalEarnedFromVip.setOnClickListener {
            mainReplaceFragment(StatisticsTotalEarnedFromVipFragment())
        }

        binding.statisticsTotalEarnedFromReklama.setOnClickListener {
            mainReplaceFragment(StatisticsTotalEarnedFromReklamaFragment())
        }
    }
}