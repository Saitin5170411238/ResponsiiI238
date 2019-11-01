package com.saitin.responsi238

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.saitin.responsi238.Adapter.ListIconAdapter

class ActivityHome : AppCompatActivity() {

    private lateinit var rv_icon: RecyclerView
    private var list: ArrayList<Iconer> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rv_icon = findViewById(R.id.rv_icon)
        rv_icon.setHasFixedSize(true)
        list.addAll(DataIcon.getListIcon)
        showIconList()
    }

    private fun showIconList() {
        rv_icon.layoutManager = LinearLayoutManager(this)
        val listIconAdapter = ListIconAdapter(list)
       rv_icon.adapter = listIconAdapter
    }
}
