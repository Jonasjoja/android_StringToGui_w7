package com.example.w7_gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class textPage extends AppCompatActivity {

    //textview obj
    TextView messageTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_page);
        //Gets the string from other page
        String message = getIntent().getStringExtra("message_key");
        messageTextview = (TextView)findViewById(R.id.rcvMsg);
        messageTextview.setText(message);
    }
}
