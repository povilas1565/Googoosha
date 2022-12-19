package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentPhotoBinding
import com.example.googoosha.utils.mainReplaceFragment

class PhotoFragment : Fragment() {
    private lateinit var binding: FragmentPhotoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhotoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.personalPhotos.setOnClickListener() {
            mainReplaceFragment(PostPersonalPhotoFragment())
        }

        binding.addPhoto.setOnClickListener() {
            mainReplaceFragment(AddPhotoFragment())
        }

        binding.choosePhoto.setOnClickListener() {
            mainReplaceFragment(AddPhotoFragment())
        }

        binding.newlyUploaded.setOnClickListener() {
            mainReplaceFragment(NewlyUploadedPhotoFragment())
        }

        binding.photoModeration.setOnClickListener() {
            mainReplaceFragment(ModerationPhotoFragment())
        }
    }
}