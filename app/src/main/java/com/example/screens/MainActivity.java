package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = findViewById(R.id.btnStartSecondActivity);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the EditText view
                EditText editText = findViewById(R.id.editText);
                String text = editText.getText().toString();

                // Create an intent to launch the second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Pass the text to the second activity as an extra
                intent.putExtra("text", text);

                // Launch the second activity
                startActivity(intent);
            }
        });

    }

}
