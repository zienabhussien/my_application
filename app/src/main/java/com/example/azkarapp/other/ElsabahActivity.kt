package com.example.azkarapp.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.azkarapp.R
import com.example.azkarapp.adapter.ZekrAdapter
import com.example.azkarapp.data.Datasource

class ElsabahActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elsabah)

        val mylist = Datasource().loadAzkarElsabah()
        val recyclerView = findViewById<RecyclerView>(R.id.sabah_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ZekrAdapter(this,mylist)
    }
}
