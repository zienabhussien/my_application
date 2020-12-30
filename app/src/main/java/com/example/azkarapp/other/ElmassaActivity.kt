package com.example.azkarapp.other

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.azkarapp.R
import com.example.azkarapp.adapter.ZekrAdapter
import com.example.azkarapp.data.Datasource

class ElmassaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elmassa)

        val mylist = Datasource().loadAzkarElmasaa()
        val recyclerView = findViewById<RecyclerView>(R.id.masaa_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ZekrAdapter(this,mylist)
    }
}
