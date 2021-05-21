package com.smis935820.numero_random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_random.*
class Random : AppCompatActivity() {
    var a = 0
    val cm = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        btngenerar.setOnClickListener {

            if(a==3){
                val i = Intent(this, Perdedor::class.java)
                startActivity(i)
                finish()
            } else{generar()}
        }
    }

    private fun generar(){
        val rnds = (0..10).random()
        resultado.text= rnds.toString()

        a++
        Toast.makeText(this, "Lleva: " + a + " intentos", Toast.LENGTH_LONG).show()
        if (rnds == cm){
            val i = Intent(this, Ganador::class.java)
            startActivity(i)
            finish()
        }
    }
}