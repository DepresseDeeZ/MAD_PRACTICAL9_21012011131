package com.example.mad_practical9_21012011131

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    lateinit var logoimage: ImageView
    lateinit var logoanimation: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }
}