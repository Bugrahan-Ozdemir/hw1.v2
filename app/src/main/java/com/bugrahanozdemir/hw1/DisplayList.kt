package com.bugrahanozdemir.hw1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bugrahanozdemir.hw1.databinding.ActivityDisplayListBinding

class DisplayList : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        updateDisplay()
    }

    public fun updateDisplay() {
        displayList(CommonSys.selectedItems)
    }
    public fun displayList(list: List<String>) {
        val displayText = list.joinToString("\n") { it.toString() }
        binding.textViewPrint.text = displayText
    }
}