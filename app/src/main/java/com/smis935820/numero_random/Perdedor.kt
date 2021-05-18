package com.smis935820.numero_random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_perdedor.*

class Perdedor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perdedor)

        btnregresar.setOnClickListener {
            val i = Intent(this, Random::class.java)
            startActivity(i)
            finish()
        }
    }
}