package com.example.mycovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Mystat extends AppCompatActivity {

    TextView id;
    TextView status;

    Button submit;

    FirebaseDatabase db;
    DatabaseReference ref;

    String temp_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystat);

        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Member");

        id = findViewById(R.id.mystat_text_id);
        status = findViewById(R.id.mystat_text_status);

        submit = findViewById(R.id.mystat_button_status);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        temp_id = id.getText().toString().toUpperCase();
                        if (dataSnapshot.child(temp_id).getValue() == null)
                            status.setText("Please enter Covid BLR ID correctly");
                        else
                            status.setText(dataSnapshot.child(temp_id).child("status").getValue(String.class));
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}