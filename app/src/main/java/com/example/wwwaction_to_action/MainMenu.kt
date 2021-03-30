package com.example.wwwaction_to_action

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cont = findViewById<TextView>(R.id.btn_continue)
        cont.setOnClickListener {
            val perehod = Intent(this, continuee::class.java)
            startActivity(perehod)
        }

        val ng = findViewById<TextView>(R.id.btn_newgame)
        ng.setOnClickListener {
            val perehod = Intent(this, newgame::class.java)
            startActivity(perehod)
        }
        val ex = findViewById<TextView>(R.id.btn_exit)
        ex.setOnClickListener {
            val perehod = Intent(this, exit::class.java)
            startActivity(perehod)
        }
        val lg = findViewById<TextView>(R.id.btn_loadgame)
        lg.setOnClickListener {
            val perehod = Intent(this, loadgame::class.java)
            startActivity(perehod)
        }
        val op = findViewById<TextView>(R.id.btn_options)
        op.setOnClickListener {
            val perehod = Intent(this, options::class.java)
            startActivity(perehod)
        }

    }
}