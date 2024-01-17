package com.paulinoeme.usersapi.data

import com.paulinoeme.usersapi.data.model.UserModel
import com.paulinoeme.usersapi.data.model.UserProvider
import com.paulinoeme.usersapi.data.network.UsersService

class UsersRepository {
    private val api = UsersService()

    suspend fun getAllUsers(): List<UserModel> {
        val users: List<UserModel> = api.getAllUsers()
        UserProvider.users = users
        return users
    }
}