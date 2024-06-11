package com.akirachix.birds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.birds.databinding.ActivityThirdbirdactivityBinding
import com.squareup.picasso.Picasso

class thirdbirdactivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdbirdactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdbirdactivity)
        binding = ActivityThirdbirdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prev3.setOnClickListener {
            finish()
        }
        binding.next3.setOnClickListener {
            val intent = Intent(this, fourthbirdactivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1609017910188-993211b015d6?q=80&w=1888&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView11)

    }
}