package com.sandhyagill.sharedpreferenceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (var activity: MainActivity ): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var count = 0
    var color = 0
    inner class ViewHolder(var view: View): RecyclerView.ViewHolder(view){
          var clMain = view.findViewById<ConstraintLayout>(R.id.clMain)


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        when(color){
            0 -> holder.clMain.setBackgroundColor(ContextCompat.getColor(activity, R.color.red))
            1 -> holder.clMain.setBackgroundColor(ContextCompat.getColor(activity, R.color.blue))
            2 -> holder.clMain.setBackgroundColor(ContextCompat.getColor(activity, R.color.green))
        }

    }

    override fun getItemCount(): Int {
         return count
    }

    fun updateCount(count : Int){
         this.count = count
        notifyDataSetChanged()
    }

    fun updateColor(color : Int){
        this.color = color
        notifyDataSetChanged()
    }
}