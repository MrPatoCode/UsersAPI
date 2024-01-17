package com.paulinoeme.usersapi.view.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paulinoeme.usersapi.R
import com.paulinoeme.usersapi.data.model.UserModel

class RecyclerViewAdapter(val users: List<UserModel>) :
    RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RecyclerViewHolder(layoutInflater
            .inflate(R.layout.item_user, parent, false))
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = users[position]
        holder.bind(item)

    }
}