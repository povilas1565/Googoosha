package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.databinding.FragmentHelpBinding
import com.example.googoosha.utils.mainReplaceFragment

class HelpFragment : Fragment() {
   private lateinit var binding: FragmentHelpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHelpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.safety.setOnClickListener {
            mainReplaceFragment(SafetyFragment())
        }

        binding.guide.setOnClickListener() {
            mainReplaceFragment(GuideFragment())
        }

        binding.friendship.setOnClickListener() {
            mainReplaceFragment(FriendshipFragment())
        }

        binding.replenishment.setOnClickListener() {
            mainReplaceFragment(ReplenishmentFragment())
        }
        binding.services.setOnClickListener() {
            mainReplaceFragment(ServicesAndAdditionalServicesFragment())
        }

        binding.settings.setOnClickListener() {
            mainReplaceFragment(ProfileSettingsFragment())
        }

        binding.photos.setOnClickListener() {
            mainReplaceFragment(PhotoFragment())
        }

        binding.rules.setOnClickListener() {
            mainReplaceFragment(SiteRulesFragment())
        }

        binding.userAgreement.setOnClickListener() {
            mainReplaceFragment(TermsOfUseFragment())
        }

        binding.aboutApp.setOnClickListener() {
            mainReplaceFragment(AboutAppFragment())
        }

        binding.support.setOnClickListener() {
            mainReplaceFragment(SupportFragment())
        }

        binding.email.setOnClickListener() {
            mainReplaceFragment(EmailFragment())
        }
    }
}