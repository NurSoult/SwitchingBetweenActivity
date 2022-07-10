package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");

        TextView textViewMessage = findViewById(R.id.textViewMessage);
        textViewMessage.setText(message);

    }
}