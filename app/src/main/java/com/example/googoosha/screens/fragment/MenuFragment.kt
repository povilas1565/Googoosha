package com.example.googoosha.screens.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentMenuBinding
import com.example.googoosha.screens.activity.AuthActivity
import com.example.googoosha.utils.APP
import com.example.googoosha.utils.hideBottomNav
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment
import java.util.Locale

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
            replaceFragment(VipFragment())
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

        binding.friends.setOnClickListener {
            replaceFragment(FriendsFragment())
        }

        binding.guests.setOnClickListener {
            replaceFragment(GuestsFragment())
        }

        binding.shop.setOnClickListener {
            replaceFragment(GiftsFragment())
        }

        binding.settings.setOnClickListener {
            replaceFragment(SettingsFragment())
        }

        binding.help.setOnClickListener {
            replaceFragment(HelpFragment())
        }

        binding.nightBtn.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            binding.nightBtn.visibility = View.GONE
            binding.lightBtn.visibility = View.VISIBLE
        }

        binding.lightBtn.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            binding.nightBtn.visibility = View.VISIBLE
            binding.lightBtn.visibility = View.GONE

        }

        binding.exit.setOnClickListener {
            startActivity(Intent(APP, AuthActivity::class.java))
            APP.finish()
        }

        binding.englishBtn.setOnClickListener {
            setLocale("en")
        }

        binding.russianBtn.setOnClickListener {
            setLocale("ru")
        }

        binding.uzbekBtn.setOnClickListener {
            setLocale("uz")
        }

        binding.turkishBtn.setOnClickListener {
            setLocale("tr")
        }
    }

    private fun setLocale(language: String) {
        val locale = Locale(language)
        var res = resources
        var dm = res.displayMetrics
        var conf = res.configuration
        conf.locale = locale
        res.updateConfiguration(conf, dm)
        val intent = APP.intent
        APP.finish()
        startActivity(intent)
    }

}