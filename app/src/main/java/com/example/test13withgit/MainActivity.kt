package com.example.test13withgit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView=findViewById<TextView>(R.id.textView)
        val button=findViewById<Button>(R.id.button)
        val editTextText=findViewById<EditText>(R.id.editTextText)
    }
}