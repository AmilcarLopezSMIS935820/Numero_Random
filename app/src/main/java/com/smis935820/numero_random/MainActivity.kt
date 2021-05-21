package com.smis935820.numero_random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bgimg = imgp
        val sa = AnimationUtils.loadAnimation(this, R.anim.slide)
        bgimg.startAnimation(sa)

        Handler().postDelayed({
            principal()
        }, 3000)

    }

    fun principal() {
        val i = Intent(this, Random::class.java)
        startActivity(i)
        finish()
    }
}