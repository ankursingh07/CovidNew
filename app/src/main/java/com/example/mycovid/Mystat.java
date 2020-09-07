package com.example.mycovid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Mystat extends AppCompatActivity {

    TextView id;
    TextView status;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystat);

        id = findViewById(R.id.mystat_text_id);
        status = findViewById(R.id.mystat_text_status);

        submit = findViewById(R.id.mystat_button_status);
    }
}