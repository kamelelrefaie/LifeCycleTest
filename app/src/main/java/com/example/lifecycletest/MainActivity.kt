package com.example.lifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lifecycletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("lifecycle", "application created")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Note about lifecycle
        /*
         onCreate : Only called once
         when you rotate your screen onDestroy is called
         application goes from  onStop -> onRestart -> onStart

         */

        //go to activity two
        binding.button.setOnClickListener {
            startActivity(Intent(this, ActivityTwo::class.java))
        }


    }

    override fun onStart() {
        super.onStart()
        Log.e("lifecycle", "application started")
    }

    override fun onResume() {
        super.onResume()
        Log.e("lifecycle", "application resumed")

    }

    override fun onPause() {
        super.onPause()
        Log.e("lifecycle", "application paused")

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("lifecycle", "application restarted")

    }

    override fun onStop() {
        super.onStop()
        Log.e("lifecycle", "application stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lifecycle", "application destroyed")

    }
}

