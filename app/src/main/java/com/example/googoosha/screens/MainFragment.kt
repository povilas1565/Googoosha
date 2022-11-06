package com.example.googoosha.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.R
import com.example.googoosha.databinding.*
import com.example.googoosha.utils.hideBottomNav
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container ,false)
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
        binding.notifyBtn.setOnClickListener {
            replaceFragment(NotificationsFragment())
        }
        binding.filterBtn.setOnClickListener {
            binding.alphaBg.visibility = View.VISIBLE
            binding.filterView.visibility = View.VISIBLE
        }
        binding.likeBtn.setOnClickListener {
            replaceFragment(CoincidenceFragment())
        }
        binding.userExample.setOnClickListener {
            mainReplaceFragment(OtherProfileFragment())
        }
        binding.menuBtn.setOnClickListener {
            mainReplaceFragment(MenuFragment())
        }
    }

}