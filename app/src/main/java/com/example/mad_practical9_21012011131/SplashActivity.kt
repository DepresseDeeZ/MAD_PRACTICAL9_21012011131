package com.example.mad_practical9_21012011131

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    //    lateinit var logoanimation: Animation
//     val img: ImageView = findViewById(R.id.img)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        val img: ImageView = findViewById(R.id.img)
//        img.setBackgroundResource(R.drawable.uvpce_animation_list)
//        logoanimation =img.background as Animation
//        logoanimation.start()


    window.setFlags(
    WindowManager.LayoutParams.FLAG_FULLSCREEN,
    WindowManager.LayoutParams.FLAG_FULLSCREEN
    )

    // we used the postDelayed(Runnable, time) method
    // to send a message with a delayed time.
    //Normal Handler is deprecated , so we have to change the code little bit

    // Handler().postDelayed({
    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }, 3000) // 3000 is the delayed time in milliseconds.
}
}