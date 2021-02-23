package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class notificationMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_main2);
        TextView textView=findViewById(R.id.textview1);
        String message=getIntent().getStringExtra("message");
        textView.setText(message);
    }
}