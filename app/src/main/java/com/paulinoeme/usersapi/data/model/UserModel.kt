package com.paulinoeme.usersapi.data.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class UserModel(
    val id: Int,
    val username: String,
    val name: String,
    val email: String,
    val phone: String,
    val website: String
)
