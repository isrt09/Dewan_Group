package com.dewan.simplecalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dewan.simplecalculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnDel.setOnClickListener {
            binding.tvInput.text = ""
            binding.tvResult.text = ""
        }

    }
}