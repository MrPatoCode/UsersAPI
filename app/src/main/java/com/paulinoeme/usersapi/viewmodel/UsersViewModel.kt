package com.paulinoeme.usersapi.viewmodel

import androidx.lifecycle.viewModelScope
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import com.paulinoeme.usersapi.data.model.UserModel
import com.paulinoeme.usersapi.domain.GetAllUsersCaseUser
import kotlinx.coroutines.launch

class UsersViewModel: ViewModel() {
    val userModel = MutableLiveData<List<UserModel>>()

    private val getAllUsers = GetAllUsersCaseUser()

    fun onCreate(){
        viewModelScope.launch {
            val users: List<UserModel> = getAllUsers()

            if (!users.isNullOrEmpty()){
                userModel.postValue(users)
            }
        }
    }
}