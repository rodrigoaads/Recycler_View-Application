package com.rodrigoaads.recyclerviewapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadRecyclerView()

        btn_add.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }
    }

    private fun loadRecyclerView() {
        this.itemAdapter = ItemAdapter()
        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = itemAdapter
        }
    }
}