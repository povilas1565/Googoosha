package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentReplenishmentBinding
import com.example.googoosha.utils.mainReplaceFragment

class ReplenishmentFragment : Fragment() {
    private lateinit var binding: FragmentReplenishmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReplenishmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.balanceQuestionnaire.setOnClickListener() {
            mainReplaceFragment(BalanceQuestionnaireFragment())
        }

        binding.oneCoinCost.setOnClickListener() {
            mainReplaceFragment(OneCoinCostFragment())
        }

        binding.viaSMS.setOnClickListener() {
            mainReplaceFragment(ViaSMSFragment())
        }

        binding.mobilePayment.setOnClickListener() {
            mainReplaceFragment(MobilePaymentFragment())
        }

        binding.paymentProcedure.setOnClickListener() {
            mainReplaceFragment(PasswordRecoveryFragment())
        }
    }
}