package com.example.w7_gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //String to save input
    private String message = "";
    //EditText
    private EditText editText;

    //Button for next page
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inside oncreate
        editText = findViewById(R.id.editText);
        //Button assignment
        btnMove = findViewById(R.id.moveNext);

        //Onclick listener
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToTextPage();
            }
        });
    }

    //NExt page method
    private void moveToTextPage() {
        Intent intent = new Intent(MainActivity.this, textPage.class);

        //puts the message in intent.putextra to be recieved on nxt activity
        intent.putExtra("message_key", message);
        startActivity(intent);
    }

    //Method for when button will be pressed
    public void savePressed(View view)
    {
        //Getting the input text.
        message = editText.getText().toString();

        //Log msg to see it works
        Log.i("all", "saved" + message);

    }


}
