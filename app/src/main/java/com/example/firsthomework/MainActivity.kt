package com.example.firsthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firsthomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        logMessage("call onCreate function")
    }

    private fun logMessage(message: String) {
        print("=================")
        print("Log: $message")
        print("=================")
    }
}