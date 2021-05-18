package com.smis935820.numero_random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ganador.*

class Ganador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganador)

        btnregresar.setOnClickListener {
            val i = Intent(this, Random::class.java)
            startActivity(i)
            finish()
        }
    }
}