package com.example.testdialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dialogButton = findViewById<Button>(R.id.dialog_button)
        dialogButton.setOnClickListener {
            SampleDialogFragment().show(supportFragmentManager, "TAG")
        }
    }
}