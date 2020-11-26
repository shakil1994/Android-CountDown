package com.example.shakil.kotlincountdown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gusakov.library.start
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countDown.start {
            startActivity(Intent(this, HomeActivity::class.java))
            Toast.makeText(this, "Home Activity", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
