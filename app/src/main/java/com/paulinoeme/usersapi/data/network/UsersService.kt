package com.paulinoeme.usersapi.data.network

import com.paulinoeme.usersapi.core.RetrofitHelper
import com.paulinoeme.usersapi.data.model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UsersService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getAllUsers(): List<UserModel> {
        return withContext(Dispatchers.IO) {
            val response: Response<List<UserModel>> = retrofit
                .create(UsersClient::class.java).getAllUsers()
            response.body() ?: emptyList()
        }
    }
}