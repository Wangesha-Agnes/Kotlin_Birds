package com.akirachix.birds

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.birds.databinding.ActivityFifthbirdactivityBinding
import com.squareup.picasso.Picasso

class fifthbirdactivity : AppCompatActivity() {
lateinit var binding: ActivityFifthbirdactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthbirdactivity)

        binding = ActivityFifthbirdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prev5.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1616902509409-a624c4f31a56?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fHw%3D")
            .into(binding.imageView13)
    }
}