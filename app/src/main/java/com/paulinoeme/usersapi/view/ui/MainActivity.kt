package com.paulinoeme.usersapi.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.paulinoeme.usersapi.R
import com.paulinoeme.usersapi.data.model.UserModel
import com.paulinoeme.usersapi.databinding.ActivityMainBinding
import com.paulinoeme.usersapi.databinding.ItemUserBinding
import com.paulinoeme.usersapi.view.recyclerview.RecyclerViewAdapter
import com.paulinoeme.usersapi.viewmodel.UsersViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: RecyclerViewAdapter
    private val userViewModel: UsersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userViewModel.onCreate()

        userViewModel.userModel.observe(this, Observer {
            adapter = RecyclerViewAdapter(it)
            binding.rvUsers.layoutManager = LinearLayoutManager(this)
            binding.rvUsers.adapter = adapter
        })
    }
}