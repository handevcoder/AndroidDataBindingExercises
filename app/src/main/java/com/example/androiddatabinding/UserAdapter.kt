package com.example.androiddatabinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.androiddatabinding.model.User


class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    inner class UserViewHolder(val itemUserBinding: ItemUserBinding) : RecyclerView.ViewHolder(itemUserBinding.root)
    override fun getItemCount() = users.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = UserViewHolder(
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_users, parent, false)
    )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemUserBinding.tvUser.text = users[position].lastName
        holder.itemUserBinding.tvId.text = users[position].id
        holder.itemUserBinding.tvFirstName.text = users[position].firstName
        holder.itemUserBinding.imageUser.text = users[position].avatar
        holder.itemUserBinding.tvEmail.text = users[position].email
    }

}
