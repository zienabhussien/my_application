package com.example.azkarapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.azkarapp.R
import com.example.azkarapp.model.ItemType
import com.example.azkarapp.other.ElmassaActivity
import com.example.azkarapp.other.ElsabahActivity

class ItemAdapter(private val context: Context,
    private val dataset: List<ItemType>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.type_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.itemView.setOnClickListener{v:View ->
            //Toast.makeText(context,item.stringResourceId,Toast.LENGTH_LONG).show()
            if(position == 0){
                val i = Intent(context,ElsabahActivity::class.java)
                context.startActivity(i)
            }
            if(position == 1){
                val i = Intent(context,ElmassaActivity::class.java)
                context.startActivity(i)
            }
        }
    }

    override fun getItemCount() = dataset.size
}