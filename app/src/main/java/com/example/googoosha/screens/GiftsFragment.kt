package com.example.googoosha.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.R
import com.example.googoosha.databinding.FragmentChatsBinding
import com.example.googoosha.databinding.FragmentGiftsBinding
import com.example.googoosha.databinding.FragmentHomeBinding

class GiftsFragment : Fragment() {
    private lateinit var binding: FragmentGiftsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGiftsBinding.inflate(inflater, container ,false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.filterBtn.setOnClickListener {
            binding.alphaBg.visibility = View.VISIBLE
            binding.filterView.visibility = View.VISIBLE
        }
    }

}