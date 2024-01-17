package com.paulinoeme.usersapi.view.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.paulinoeme.usersapi.data.model.UserModel
import com.paulinoeme.usersapi.databinding.ItemUserBinding

class RecyclerViewHolder(view:View):RecyclerView.ViewHolder(view) {
    private val binding = ItemUserBinding.bind(view)

    fun bind(users:UserModel){
        binding.tvUserName.text = users.username
        binding.tvName.text = users.name
        binding.tvPhone.text = users.phone
        binding.tvEmail.text = users.email
        binding.tvWeb.text = users.website
    }
}