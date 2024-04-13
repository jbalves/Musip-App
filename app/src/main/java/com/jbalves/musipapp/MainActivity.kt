package com.jbalves.musipapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadMusicPlayerFragment()
    }

    private fun loadMusicPlayerFragment() {
        // Create a instance of MusicPlayerFragment
        val musicPlayerFragment = MusicPlayerFragment()

        //Begin transaction to replace the fragment_container with MusicPlayerFragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, musicPlayerFragment)
        // Optional: allows to back transaction
        transaction.addToBackStack(null)
        transaction.commit()
    }
}