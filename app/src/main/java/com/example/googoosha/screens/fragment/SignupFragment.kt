package com.example.googoosha.screens.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.screens.activity.MainActivity
import com.example.googoosha.databinding.FragmentSignupBinding
import com.example.googoosha.utils.APP
import com.example.googoosha.utils.AUTH
import java.util.*

class SignupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        initFuns()
    }

    private fun initFuns() {
        binding.signupBtn.setOnClickListener {
            startActivity(Intent(AUTH, MainActivity::class.java))
            AUTH.finish()
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
