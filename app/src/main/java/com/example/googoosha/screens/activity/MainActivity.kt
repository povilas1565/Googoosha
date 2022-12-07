package com.example.googoosha.screens.activity

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.googoosha.R
import com.example.googoosha.databinding.ActivityMainBinding
import com.example.googoosha.screens.fragment.*
import com.example.googoosha.utils.APP
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment
import com.example.googoosha.utils.setFullWindow

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
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
        setFullWindow(this)
        mainReplaceFragment(MainFragment(), false)
    }

    private fun fillItem(view: ImageView) {
        binding.home.setColorFilter(resources.getColor(R.color.gray_color))
        binding.profile.setColorFilter(resources.getColor(R.color.gray_color))
        binding.chats.setColorFilter(resources.getColor(R.color.gray_color))
        binding.favourites.setColorFilter(resources.getColor(R.color.gray_color))
        view.setColorFilter(resources.getColor(R.color.pink_color))
    }
}