package com.example.bottonnavkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.bottonnavkotlin.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashborad : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("tag","Dashborad onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashborad)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        navView.selectedItemId = R.id.navigation_dashboard

    }
}