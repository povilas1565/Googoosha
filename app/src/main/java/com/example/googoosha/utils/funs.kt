package com.example.googoosha.utils

import androidx.fragment.app.Fragment
import com.example.googoosha.R

fun replaceFragment(fragment: Fragment, backStack: Boolean = true) {
    if (backStack) {
        APP.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_frame, fragment)
            .addToBackStack(null)
            .commit()
    } else {
        APP.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_frame, fragment)
            .commit()
    }
}

fun mainReplaceFragment(fragment: Fragment, backStack: Boolean = true) {
    if (backStack) {
        APP.supportFragmentManager.beginTransaction()
            .replace(R.id.main_frame, fragment)
            .addToBackStack(null)
            .commit()
    } else {
        APP.supportFragmentManager.beginTransaction()
            .replace(R.id.main_frame, fragment)
            .commit()
    }
}

fun authReplaceFragment(fragment: Fragment, backStack: Boolean = true) {
    if (backStack) {
        AUTH.supportFragmentManager.beginTransaction()
            .replace(R.id.auth_frame, fragment)
            .addToBackStack(null)
            .commit()
    } else {
        AUTH.supportFragmentManager.beginTransaction()
            .replace(R.id.auth_frame, fragment)
            .commit()
    }
}