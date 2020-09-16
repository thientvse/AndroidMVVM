package com.example.mvvmapplication.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmapplication.R
import com.example.mvvmapplication.data.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(private val users: ArrayList<User>): RecyclerView.Adapter<MainAdapter.DataViewHolder>() {
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.apply {
                textViewUserName.text = user.name
                textViewUserEmail.text = user.email

                Glide.with(imageViewAvatar.context)
                    .load(user.avatar)
                    .into(imageViewAvatar)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>){
        this.users.apply {
            clear()
            addAll(users)
        }
    }
}