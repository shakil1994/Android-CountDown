package com.example.shakil.androidcountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.gusakov.library.PulseCountDown;

public class MainActivity extends AppCompatActivity {

    PulseCountDown countDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countDown = findViewById(R.id.countDown);

        countDown.start(() -> {
            startActivity(new Intent(this, HomeActivity.class));
            Toast.makeText(this, "Home Activity", Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}
