package com.slowmonkeycodes.queuethecrickets

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
            // Crickets sound obtained from: https://www.soundboard.com/sb/sound/961311
            mediaPlayer = MediaPlayer.create(this, R.raw.crickets)
            mediaPlayer?.start()
        }
    }
}
