package com.mohamed.wasselni.ui.splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import com.mohamed.wasselni.MainActivity
import com.mohamed.wasselni.R
import com.mohamed.wasselni.utils.AppConstants.SPLASH_DISPLAY_LENGTH
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)

        Handler().postDelayed({
            val animFadeOut = AnimationUtils
                .loadAnimation(applicationContext, R.anim.fade_in)
            layoutLogo.startAnimation(animFadeOut)
            layoutLogo.visibility = View.VISIBLE
        }, 1000)


    }
}
