package com.example.implicitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {
TextView Tsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        setTitle("Receive ACTION_SEND");

        Tsend = findViewById(R.id.text1);
        Intent intent = getIntent();
        String hasil = intent.getStringExtra(Intent.EXTRA_TEXT);
        Tsend.setText(hasil);
    }
}
