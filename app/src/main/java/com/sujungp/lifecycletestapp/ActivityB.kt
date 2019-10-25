package com.sujungp.lifecycletestapp

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_b.*

/**
 * Created by sujung26 on 2019-10-24.
 */
class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("sujung", "[Activity B] onCreate")

        intent?.let {
            val num = it.getIntExtra("a", 1)
            numText.text = num.toString()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("sujung", "[Activity B] onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sujung", "[Activity B] onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sujung", "[Activity B] onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sujung", "[Activity B] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sujung", "[Activity B] onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sujung", "[Activity B] onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("sujung", "[Activity B] onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d("sujung", "[Activity B] onNewIntent")
        super.onNewIntent(intent)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("sujung", "[Activity B] onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.d("sujung", "[Activity B] onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }
}