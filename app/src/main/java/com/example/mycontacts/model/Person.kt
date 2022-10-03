package com.example.mycontacts.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val lastName: String,
    val name: String,
    val secondName: String,
    val phone: String
    ): Parcelable
