package com.example.googoosha.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.googoosha.R
import com.example.googoosha.databinding.FragmentHelpBinding
import com.example.googoosha.databinding.FragmentVipBinding
import com.example.googoosha.utils.mainReplaceFragment
import com.example.googoosha.utils.replaceFragment

class HelpFragment : Fragment() {
   private lateinit var binding: FragmentHelpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHelpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        binding.safety.setOnClickListener {
            mainReplaceFragment(SafetyFragment())
        }
    }
}