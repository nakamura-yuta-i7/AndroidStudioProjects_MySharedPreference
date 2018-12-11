package com.nkmr.mysharedpreference

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        Log.d("koko1", "onStart")

        var text = findViewById(R.id.yesNoTextView) as TextView
        var bool = (application as MyApplication).preferences.getBoolean("ScreenConfirmed", false)
        text.text = if (bool) "YES" else "NO"
    }
    fun goLaunchScreen(v: View) {
        startActivity(Intent(this, LaunchScreenActivity::class.java))
    }
}
