package com.example.googoosha.screens.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.googoosha.databinding.FragmentFavouritesBinding
import com.example.googoosha.utils.replaceFragment

class FavouritesFragment : Fragment() {
    private lateinit var binding: FragmentFavouritesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavouritesBinding.inflate(inflater, container, false)
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

        binding.searchFavourites.setOnClickListener {
            replaceFragment(SearchFavouritesFragment())
        }

        binding.favouritesLikes.setOnClickListener {
            replaceFragment(FavouritesLikesFragment())
        }

        binding.statisticsFavourites.setOnClickListener {
            replaceFragment(StatisticsFavouritesFragment())
        }
        }
    }
