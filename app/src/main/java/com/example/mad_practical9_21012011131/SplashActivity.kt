package com.example.mad_practical9_21012011131

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        val img: ImageView = findViewById(R.id.img)
        val anim = img.drawable as AnimationDrawable
        anim.start()

    }


}