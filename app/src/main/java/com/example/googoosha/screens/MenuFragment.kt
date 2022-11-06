package com.example.googoosha.screens

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentMenuBinding
import com.example.googoosha.utils.APP
import com.example.googoosha.utils.hideBottomNav
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment

class MenuFragment : Fragment() {
    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFields()
        initFuns()
    }

    private fun initFields() {
        hideBottomNav()
    }

    private fun initFuns() {
        binding.vipStatus.setOnClickListener {
            mainReplaceFragment(VipFragment())
        }
        binding.profile.setOnClickListener {
            replaceFragment(ProfileFragment())
        }
        binding.message.setOnClickListener {
            replaceFragment(ChatsFragment())
        }
        binding.notifications.setOnClickListener {
            replaceFragment(NotificationsFragment())
        }
        binding.favourites.setOnClickListener {
            replaceFragment(FavouritesFragment())
        }
        binding.settings.setOnClickListener {
            mainReplaceFragment(SettingsFragment())
        }
        binding.exit.setOnClickListener {
            startActivity(Intent(APP, AuthActivity::class.java))
            APP.finish()
        }
    }

}