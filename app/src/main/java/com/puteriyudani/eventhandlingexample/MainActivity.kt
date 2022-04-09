package com.puteriyudani.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fungsi OnClickListener = saat button di klik akan muncul pesan "Hello World!"
        btnDisplayMessage.setOnClickListener {
            Toast.makeText(applicationContext, "Hello World!", Toast.LENGTH_SHORT).show()
        }

        //fungsi OnLongClickListener = saat button di klik dan tahan akan muncul pesan "Long Click"
        btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(root_layout, "Long click", Snackbar.LENGTH_LONG).show()
            true
        }
    }
}