package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentProfileSettingsBinding
import com.example.googoosha.utils.mainReplaceFragment

class ProfileSettingsFragment : Fragment() {
    private lateinit var binding: FragmentProfileSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.nameEdit.setOnClickListener() {
            mainReplaceFragment(NameEditFragment())
        }

        binding.cityEdit.setOnClickListener() {
            mainReplaceFragment(CityEditFragment())
        }

        binding.passwordEdit.setOnClickListener() {
            mainReplaceFragment(PasswordEditFragment())
        }

        binding.emailConnections.setOnClickListener() {
            mainReplaceFragment(EmailConnectionsFragment())
        }

        binding.notificationsSettings.setOnClickListener() {
            mainReplaceFragment(NotifySettingsFragment())
        }

        binding.notificationsToEmail.setOnClickListener() {
            mainReplaceFragment(NotificationsToEmailFragment())
        }

        binding.deleteQuestionnaire.setOnClickListener() {
            mainReplaceFragment(DeleteQuestionnaireFragment())
        }
    }
}