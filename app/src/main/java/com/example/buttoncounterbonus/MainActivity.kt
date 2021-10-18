package com.example.buttoncounterbonus

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    lateinit var textView: TextView
    var input=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        textView=findViewById(R.id.textView)

        button.setOnClickListener {
            incdec(button)
        }

        button2.setOnClickListener {
            incdec(button2)
        }
    }

    fun incdec(b: Button){
        input=textView.text.toString().toInt()
        when(b){
            button->input+=1
            button2->input-=1
        }
        textView.text=input.toString()
    }
}