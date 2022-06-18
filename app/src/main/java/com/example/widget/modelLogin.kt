package com.example.widget

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class modelLogin(
    var username : String,
    var password : String
) : Parcelable


