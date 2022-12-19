package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentMainBinding
import com.example.googoosha.utils.hideBottomNav
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
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

        binding.user1Example.setOnClickListener {
            mainReplaceFragment(OtherProfileFragment())
        }

        binding.user2Example.setOnClickListener {
            mainReplaceFragment(OtherProfileFragment())
        }

        binding.user3Example.setOnClickListener {
            mainReplaceFragment(OtherProfileFragment())
        }

        binding.menuBtn.setOnClickListener {
            mainReplaceFragment(MenuFragment())
        }
    }

}