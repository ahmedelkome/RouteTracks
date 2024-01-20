package com.route.assignmentroutetracks.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.assignmentroutetracks.databinding.ActivitySplashScreenBinding
import com.route.assignmentroutetracks.home.HomeScreen

class SplashScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        startHomeScreen()
    }

    private fun startHomeScreen() {
        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(this@SplashScreenActivity, HomeScreen::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}