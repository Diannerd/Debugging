package com.example.implicit

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val websiteEditText: EditText = findViewById(R.id.website_edit_text)
        val openWebsiteButton: Button = findViewById(R.id.open_website_button)
        openWebsiteButton.setOnClickListener {
            val websiteUrl = websiteEditText.text.toString()
            openWebsite(websiteUrl)
        }
        val locationEditText: EditText = findViewById(R.id.location_edit_text)
        val locationButton: Button = findViewById(R.id.location_button)
        locationButton.setOnClickListener {
            val locationName = locationEditText.text.toString()
            openLocation(locationName)
        }
        val shareEditText: EditText = findViewById(R.id.location_edit_text)
        val shareTextButton: Button = findViewById(R.id.share_text_button)
        shareTextButton.setOnClickListener {
            val shareText = shareEditText.text.toString()
            shareText(shareText)
        }
        val shareEdit: EditText = findViewById(R.id.location_edit_text)
        val shareButton: Button = findViewById(R.id.share_text_button)
        shareButton.setOnClickListener {
            val text = shareEdit.text.toString()
            Log.v("cek string", text)
            Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT).show()
            shareText(text)
        }
        fun openWebsite(view: View) {}
        fun shareText(view: View) {}
        fun openLocation(view: View) {}
    }

    private fun shareText(shareText: String) {

    }

    private fun openLocation(locationName: String) {

    }

    private fun openWebsite(websiteUrl: String) {
    }

    fun openWebsite(view: View) {}
    fun openLocation(view: View) {}
    fun shareText(view: View) {}
}