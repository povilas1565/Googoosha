package com.example.googoosha

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.googoosha.databinding.ActivityMainBinding
import com.example.googoosha.screens.ChatsFragment
import com.example.googoosha.screens.FavouritesFragment
import com.example.googoosha.screens.HomeFragment
import com.example.googoosha.screens.ProfileFragment
import com.example.googoosha.utils.APP
import com.example.googoosha.utils.replaceFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initFields()
        initFuns()
    }

    private fun initFuns() {
        binding.home.setOnClickListener {
            replaceFragment(HomeFragment(), false)
            fillItem(binding.home)
        }
        binding.profile.setOnClickListener {
            replaceFragment(ProfileFragment(), false)
            fillItem(binding.profile)
        }
        binding.chats.setOnClickListener {
            replaceFragment(ChatsFragment(), false)
            fillItem(binding.chats)
        }
        binding.favourites.setOnClickListener {
            replaceFragment(FavouritesFragment(), false)
            fillItem(binding.favourites)
        }
    }

    private fun initFields() {
        APP = this
        replaceFragment(ProfileFragment(), false)
        fillItem(binding.profile)
    }

    private fun fillItem(view: ImageView) {
        binding.home.setColorFilter(resources.getColor(R.color.gray_color))
        binding.profile.setColorFilter(resources.getColor(R.color.gray_color))
        binding.chats.setColorFilter(resources.getColor(R.color.gray_color))
        binding.favourites.setColorFilter(resources.getColor(R.color.gray_color))
        view.setColorFilter(resources.getColor(R.color.pink_color))
    }
}