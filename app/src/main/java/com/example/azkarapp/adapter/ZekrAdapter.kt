package com.example.azkarapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.azkarapp.R
import kotlinx.android.synthetic.main.list_item.view.*

class ZekrAdapter(private val context : Context, private val itemlist : List<String>)
    : RecyclerView.Adapter<ZekrAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val layoutAdapter = LayoutInflater.from(parent.context).
           inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(layoutAdapter)
    }

    override fun getItemCount(): Int = itemlist.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
      val item = itemlist[position]
       holder.textView.text = itemlist[position]
       // holder.itemView.setOnClickListener { v: View -> }
    }


    class ItemViewHolder(val view : View): RecyclerView.ViewHolder(view) {
    val textView : TextView = view.findViewById(R.id.text)

    }

}