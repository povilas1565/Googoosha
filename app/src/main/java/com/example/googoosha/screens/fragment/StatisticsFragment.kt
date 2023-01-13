package com.example.googoosha.screens.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentStatisticsBinding
import com.example.googoosha.screens.activity.MainActivity
import com.example.googoosha.utils.AUTH
import com.example.googoosha.utils.mainReplaceFragment

class StatisticsFragment : Fragment() {
    private lateinit var binding: FragmentStatisticsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()

        binding.statisticsUsers.setOnClickListener {
            mainReplaceFragment(StatisticsUsersFragment())
        }

        binding.signupBtn.setOnClickListener {
            startActivity(Intent(AUTH, MainActivity::class.java))
            AUTH.finish()
        }
    }
}