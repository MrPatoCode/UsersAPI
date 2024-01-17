package com.paulinoeme.usersapi.data.network

import com.paulinoeme.usersapi.data.model.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface UsersClient {
    @GET("users")
    suspend fun getAllUsers(): Response<List<UserModel>>
}