package com.example.homework10.data

import com.example.homework10.R

fun getList(): List<Item> {
    return listOf(
        Item(
            1,
            startIcon = R.drawable.ic_profile,
            text = "Edit profile",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            2,
            startIcon = R.drawable.ic_location,
            text = "Address",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            3,
            startIcon = R.drawable.ic_bell,
            text = "notification",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            4,
            startIcon = R.drawable.ic_payment,
            text = "Payment",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            5,
            startIcon = R.drawable.ic_security,
            text = "Security",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            6,
            startIcon = R.drawable.ic_language,
            text = "Language                  English (US)",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            7,
            startIcon = R.drawable.ic_eye,
            text = "Dark Mode",
            endIcon = com.google.android.material.R.drawable.navigation_empty_icon,
            true
        ),
        Item(
            8,
            startIcon = R.drawable.ic_lock,
            text = "Privacy Policy",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            9,
            startIcon = R.drawable.ic_help,
            text = "Help Center",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            10,
            startIcon = R.drawable.ic_invite,
            text = "Invite Friends",
            endIcon = R.drawable.ic_arrow,
            false
        ),
        Item(
            11,
            startIcon = R.drawable.ic_log_out,
            text = "Logout",
            endIcon = R.drawable.ic_arrow,
            false
        )
    )
}