package com.example.wwwaction_to_action

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)


        val em = findViewById<TextView>(R.id.b_exit_main)
        em.setOnClickListener {
            val perehod = Intent(this, MainMenu::class.java)
            startActivity(perehod)
        }
    }
}