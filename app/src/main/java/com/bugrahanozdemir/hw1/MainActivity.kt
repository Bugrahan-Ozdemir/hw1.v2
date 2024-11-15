package com.bugrahanozdemir.hw1

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bugrahanozdemir.hw1.databinding.ActivityMainBinding
import com.bugrahanozdemir.hw1.DisplayList



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //navigate to create list activity
        binding.btnCreateList.setOnClickListener {
            val intent = Intent(this, CreateList::class.java)
            startActivity(intent)
        }
        binding.btnDisplayList.setOnClickListener {
            val intent = Intent(this, DisplayList::class.java)
            startActivity(intent)
        }

    }

}