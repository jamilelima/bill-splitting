package dev.jamile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
    }


    private fun setupToolbar() {
        supportActionBar?.apply {
            setCustomView(R.layout.custom_toolbar)
            displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
            elevation = 0F
        }
    }
}