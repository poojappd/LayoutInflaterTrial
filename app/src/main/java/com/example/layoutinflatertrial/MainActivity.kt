package com.example.layoutinflatertrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val textView = TextView(this)
        textView.text = "Text VIew created!!"
        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val layput = layoutInflater.inflate(R.layout.mylayout, null)
        setContentView(layput)
        layoutInflater.inflate()
    }
}