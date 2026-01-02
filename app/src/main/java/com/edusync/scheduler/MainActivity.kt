package com.edusync.scheduler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.edusync.scheduler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        setupUI()
    }
    
    private fun setupUI() {
        // Welcome message for now
        binding.welcomeText.text = "Welcome to EduSync+\nYour Smart Class Scheduler"
        
        // Setup FAB for adding new class
        binding.fabAddClass.setOnClickListener {
            // TODO: Navigate to Add Class screen
            // For now, show a simple message
            binding.welcomeText.text = "Add Class clicked!\nComing soon..."
        }
    }
}