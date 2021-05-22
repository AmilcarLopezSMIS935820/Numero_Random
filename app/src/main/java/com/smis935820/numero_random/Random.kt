package com.smis935820.numero_random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_random.*
import java.util.Random
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
        val rt1:Int = Random().nextInt(10)
        val rt2:Int = Random().nextInt(10)
        val rt3:Int = Random().nextInt(10)
        resultado.text = rt1.toString()
        resultado2.text = rt2.toString()
        resultado3.text = rt3.toString()

        a++
        Toast.makeText(this, "Lleva: " + a + " intentos", Toast.LENGTH_LONG).show()
        if (rt1 == cm){
            if(rt2 == cm){
                if(rt3 == cm){
                    val i = Intent(this, Ganador::class.java)
                    startActivity(i)
                    finish()
                }
            }
        }
    }
}