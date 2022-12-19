package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentFewGuestsBinding
import com.example.googoosha.databinding.FragmentFriendshipBinding
import com.example.googoosha.utils.mainReplaceFragment

class FriendshipFragment : Fragment() {
    private lateinit var binding: FragmentFriendshipBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFriendshipBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.fewGuests.setOnClickListener() {
            mainReplaceFragment(FewGuestsFragment())
        }

        binding.correspondenceAndComments.setOnClickListener() {
            mainReplaceFragment(CorrespondenceAndCommentsFragment())
        }

        binding.notRead.setOnClickListener() {
            mainReplaceFragment(NotReadFragment())
        }

        binding.spam.setOnClickListener() {
            mainReplaceFragment(SpamFragment())
        }
        }
    }
