package com.nkmr.mysharedpreference

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LaunchScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)

        title = "導入画面"

        var app = application as MyApplication
        app.preferences.edit().putBoolean("ScreenConfirmed", true).apply()
    }
}
