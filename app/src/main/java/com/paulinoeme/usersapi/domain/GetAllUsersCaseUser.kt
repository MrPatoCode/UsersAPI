package com.paulinoeme.usersapi.domain

import com.paulinoeme.usersapi.data.UsersRepository

class GetAllUsersCaseUser {
    private val repository = UsersRepository()

    suspend operator fun invoke() = repository.getAllUsers()
}