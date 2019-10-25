package com.sujungp.lifecycletestapp

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityA : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("sujung", "[Activity A] onCreate")

        onNewIntentBtn.setOnClickListener(this)
        goBBtn.setOnClickListener(this)
        showDialogBtn.setOnClickListener(this)
        showDialogFragmentBtn.setOnClickListener(this)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("sujung", "[Activity A] onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sujung", "[Activity A] onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sujung", "[Activity A] onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sujung", "[Activity A] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sujung", "[Activity A] onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sujung", "[Activity A] onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("sujung", "[Activity A] onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onNewIntent(intent: Intent?) {
        Log.d("sujung", "[Activity A] onNewIntent")
        super.onNewIntent(intent)

        intent?.let {
            val num = it.getIntExtra("a", 1)
            Toast.makeText(this, num.toString(), Toast.LENGTH_LONG).show()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d("sujung", "[Activity A] onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.d("sujung", "[Activity A] onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    override fun onClick(v: View?) {
        when (v) {
            onNewIntentBtn -> {
                val intent = Intent(this, ActivityA::class.java).apply {
                    putExtra("a", 1)
                    putExtra("b", 2)
                }
                startActivity(intent)
            }
            goBBtn -> {
                val intent = Intent(this, ActivityB::class.java).apply {
                    putExtra("a", 1)
                    putExtra("b", 2)
                }
                startActivity(intent)
            }
            showDialogBtn -> {
                AlertDialog.Builder(this).apply {
                    setMessage("다이얼로그")
                    setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                }.create().show()
            }
            showDialogFragmentBtn -> {
//                supportFragmentManager.beginTransaction().run {
//                    add(R.id.fragment_place, HahaDialogFragment())
//                    commit()
//                }
                val dialog = HahaDialogFragment()
                dialog.show(supportFragmentManager,"dialog")
            }
        }
    }
}
