package com.example.todoappkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var editText: EditText

    var items = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText=findViewById(R.id.edittxt1)

        list_of_items.adapter =
            ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, items)

        add_btn.setOnClickListener {
            if (editText.length() == 0){
                Toast.makeText(this, "It's Empty", Toast.LENGTH_SHORT).show()
            }else {
                items.add(editText.text.toString())
                list_of_items.adapter =
                    ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, items)
                editText.getText().clear()
                Toast.makeText(this, "Added to List", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
