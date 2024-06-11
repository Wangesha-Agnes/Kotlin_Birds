package com.akirachix.birds

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.birds.databinding.ActivityFourthbirdactivityBinding
import com.squareup.picasso.Picasso

class fourthbirdactivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthbirdactivityBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthbirdactivity)

      binding = ActivityFourthbirdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prev4.setOnClickListener{
            finish()
        }

        binding.next4.setOnClickListener{
            val intent = Intent(this, fifthbirdactivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1616902509409-a624c4f31a56?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fHw%3D")
            .into(binding.imageView12)
    }
}