package com.route.assignmentroutetracks.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.assignmentroutetracks.R
import com.route.assignmentroutetracks.androidcontent.AndroidActivity
import com.route.assignmentroutetracks.databinding.ActivityHomeScreenBinding
import com.route.assignmentroutetracks.fullstackcontent.FullStackActivity
import com.route.assignmentroutetracks.ioscontent.IosActivity

class HomeScreen : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        showContent()
    }

    private fun showContent(){
        binding.btnAndroid.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)

        }
        binding.btnIos.setOnClickListener {
            val intent = Intent(this,IosActivity::class.java)
            startActivity(intent)

        }
        binding.btnFull.setOnClickListener {
            val intent = Intent(this,FullStackActivity::class.java)
            startActivity(intent)

        }
    }
}