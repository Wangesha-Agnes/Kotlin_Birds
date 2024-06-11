package com.akirachix.birds

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.birds.databinding.ActivitySecondbirdactivityBinding
import com.squareup.picasso.Picasso

class secondbirdactivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondbirdactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondbirdactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prev2.setOnClickListener {
            finish()
        }
        binding.next2.setOnClickListener {
            val intent=Intent(this,thirdbirdactivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1458515349/photo/chaffinch-on-branch-the-netherlands.webp?b=1&s=170667a&w=0&k=20&c=N67Dz9Ee0GHzYYMyUP31s4_zBDD_TGa0izZvqBElC60=")
            .into(binding.imagebird2)


    }
}