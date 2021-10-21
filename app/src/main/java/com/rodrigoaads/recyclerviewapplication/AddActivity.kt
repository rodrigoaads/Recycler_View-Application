package com.rodrigoaads.recyclerviewapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        val repository = Repository()

        btn_add_item.setOnClickListener {
            if (editText_Name.text.isBlank() || editText_Name.text.isEmpty()){
                Toast.makeText(this, "O campo nome deve ser preenchido!", Toast.LENGTH_SHORT).show()
            }else{
                val item = ItemModel(editText_Name.text.toString(), editText_Description.text.toString())
                repository.createItem(item)

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}