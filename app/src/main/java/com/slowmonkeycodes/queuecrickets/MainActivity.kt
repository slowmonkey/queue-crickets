package com.slowmonkeycodes.queuecrickets

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private lateinit var queueTheCricketsButton : ImageButton
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        queueTheCricketsButton = findViewById(R.id.queue_crickets_button)

        queueTheCricketsButton.isSoundEffectsEnabled = false

        queueTheCricketsButton.setOnClickListener {
            mediaPlayer = MediaPlayer.create(this, R.raw.crickets)
            mediaPlayer?.start()
        }
    }
}
