package com.example.googoosha.screens.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
   private lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.colorTheme.setOnClickListener {
            mainReplaceFragment(ColorThemeFragment())
        }

        binding.nameEdit.setOnClickListener() {
            mainReplaceFragment(NameModificationFragment())
        }

        binding.cityEdit.setOnClickListener() {
            mainReplaceFragment(ChangeCityFragment())
        }

        binding.passwordEdit.setOnClickListener() {
            mainReplaceFragment(ChangePasswordFragment())
        }

        binding.phoneEdit.setOnClickListener() {
            mainReplaceFragment(ChangePhoneFragment())
        }
        
        binding.recoveryPassword.setOnClickListener() {
            mainReplaceFragment(PasswordRecoveryFragment())
        }

        binding.emailConnections.setOnClickListener() {
            mainReplaceFragment(ChangeEmailAddressFragment())
        }

        binding.lastsList.setOnClickListener() {
            mainReplaceFragment(ListOfRecentFragment())
        }

        binding.notificationsSettings.setOnClickListener() {
            mainReplaceFragment(SettingsUpNotificationsFragment())
        }

        binding.notificationsToEmail.setOnClickListener() {
            mainReplaceFragment(EmailAlertsFragment())
        }

        binding.filterMessages.setOnClickListener() {
            mainReplaceFragment(FilterMessagesFragment())
        }

        binding.notificationSettings.setOnClickListener() {
            mainReplaceFragment(NotificationSettingsFragment())
        }

        binding.withRecovering.setOnClickListener() {
          mainReplaceFragment(DeleteProfileFragment())
        }
    }
}