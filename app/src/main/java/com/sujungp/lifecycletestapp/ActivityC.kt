package com.sujungp.lifecycletestapp

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_c.*

/**
 * Created by sujung26 on 2019-10-31.
 */
class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d("sujung", "[Activity C] onCreate")

        goBBtn.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java).apply {
                putExtra("b", 2)
            }
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("sujung", "[Activity C] onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sujung", "[Activity C] onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sujung", "[Activity C] onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sujung", "[Activity C] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sujung", "[Activity C] onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sujung", "[Activity C] onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("sujung", "[Activity C] onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d("sujung", "[Activity C] onNewIntent")
        super.onNewIntent(intent)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("sujung", "[Activity C] onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.d("sujung", "[Activity C] onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }
}