package com.sandhyagill.sharedpreferenceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter ( var count: List<Item>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(var view: View): RecyclerView.ViewHolder(view){
          var tvRecyclerView = view.findViewById<TextView>(R.id.tvRecyclerView)

        fun bind(item: Item){
            tvRecyclerView.text = item.count.toString()
            tvRecyclerView.setBackgroundColor(item.color)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
       holder.bind(count[position])
//        holder.tvRecyclerView.setText("this is text $position")
    }

    override fun getItemCount(): Int {
         return count.size
    }
}