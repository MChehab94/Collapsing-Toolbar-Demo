package com.collapsingtoolbardemo.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        var list = arrayListOf<String>()
        for (i in 0..100)
            list.add("Item $i")
        val adapter = Adapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL,
                false)
        recyclerView.adapter = adapter
    }
}
