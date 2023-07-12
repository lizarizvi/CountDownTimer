package com.example.countdowntimer

import android.content.IntentSender.OnFinished
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import com.example.countdowntimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var countDownTimer : CountDownTimer? = null
    private var timeDuration : Long = 60000 //in ms
    private var pauseOffset : Long = 0 //pauseOffset=timeDuration-timeLeft

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.tvTimer?.text = "${(timeDuration/1000).toString()}"
        binding?.startBtn?.setOnClickListener {
            Toast.makeText(this@MainActivity,"timer started", Toast.LENGTH_SHORT).show()
        }
        binding?.pauseBtn?.setOnClickListener {
            Toast.makeText(this@MainActivity,"timer paused",Toast.LENGTH_SHORT).show()
        }
        binding?.resetBtn?.setOnClickListener {
            Toast.makeText(this@MainActivity,"reset timer",Toast.LENGTH_SHORT).show()
        }

    }
}