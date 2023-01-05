package com.example.to_do_list

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    private val todos: MutableList<Todo>
){
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}