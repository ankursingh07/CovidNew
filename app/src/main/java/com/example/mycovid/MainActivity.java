package com.example.mycovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

   /* Button update;
    Button bedstat;
    Button mystat;

    TextView confirmed;
    TextView active;
    TextView recovered;
    TextView deaths;

    TextView emptybed;
    TextView occupiedbed;

    FirebaseDatabase db;
    DatabaseReference track;
    DatabaseReference hos;

    int available;
    int occupied;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void update_detailsss(View view)
    {
       Intent intent = new Intent(this,Login.class);
    startActivity(intent);
    }

    public void Bed_statss(View view)
    {
        Intent intent = new Intent(this,Bedstat.class);
        startActivity(intent);
    }

    public void check_my_statss(View view)
    {
        Intent intent = new Intent(this,Mystat.class);
        startActivity(intent);
    }
    public void contact_us(View view)
    {
        Intent intent = new Intent(this,ContactUs.class);
        startActivity(intent);
    }
       /* update = findViewById(R.id.main_button_update);
        bedstat = findViewById(R.id.main_button_bedstat);
        mystat = findViewById(R.id.main_button_mystat);

        confirmed = findViewById(R.id.main_text_confirmed);
        active = findViewById(R.id.main_text_active);
        recovered = findViewById(R.id.main_text_recovered);
        deaths = findViewById(R.id.main_text_deaths);

        emptybed = findViewById(R.id.main_text_emptybed);
        occupiedbed = findViewById(R.id.main_text_occupiedbed);

        db = FirebaseDatabase.getInstance();
        track = db.getReference("Tracker");
        hos = db.getReference("Hospital");

        available = 0;
        occupied = 0;

        track.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                confirmed.setText(String.valueOf(dataSnapshot.child("Confirmed").getValue()));
                active.setText(String.valueOf(dataSnapshot.child("Active").getValue()));
                recovered.setText(String.valueOf(dataSnapshot.child("Recovered").getValue()));
                deaths.setText(String.valueOf(dataSnapshot.child("Deaths").getValue()));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        hos.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                DataSnapshot dss_covidcentre = dataSnapshot.child("covidcentre");
                DataSnapshot dss_rajivgandhi = dataSnapshot.child("rajivgandhi");
                DataSnapshot dss_victoria = dataSnapshot.child("victoria");
                DataSnapshot dss_rrmc = dataSnapshot.child("rrmc");
                DataSnapshot dss_apollo = dataSnapshot.child("apollo");
                DataSnapshot dss_bgs = dataSnapshot.child("bgs");

                int bed_covidcentre = Integer.parseInt(String.valueOf(dss_covidcentre.child("general").getValue()));
                bed_covidcentre += Integer.parseInt(String.valueOf(dss_covidcentre.child("oxygen").getValue()));
                bed_covidcentre += Integer.parseInt(String.valueOf(dss_covidcentre.child("ventilator").getValue()));

                int bed_rajivgandhi = Integer.parseInt(String.valueOf(dss_rajivgandhi.child("general").getValue()));
                bed_rajivgandhi += Integer.parseInt(String.valueOf(dss_rajivgandhi.child("oxygen").getValue()));
                bed_rajivgandhi += Integer.parseInt(String.valueOf(dss_rajivgandhi.child("ventilator").getValue()));

                int bed_victoria = Integer.parseInt(String.valueOf(dss_victoria.child("general").getValue()));
                bed_victoria += Integer.parseInt(String.valueOf(dss_victoria.child("oxygen").getValue()));
                bed_victoria += Integer.parseInt(String.valueOf(dss_victoria.child("ventilator").getValue()));

                int bed_rrmc = Integer.parseInt(String.valueOf(dss_rrmc.child("general").getValue()));
                bed_rrmc += Integer.parseInt(String.valueOf(dss_rrmc.child("oxygen").getValue()));
                bed_rrmc += Integer.parseInt(String.valueOf(dss_rrmc.child("ventilator").getValue()));

                int bed_apollo = Integer.parseInt(String.valueOf(dss_apollo.child("general").getValue()));
                bed_apollo += Integer.parseInt(String.valueOf(dss_apollo.child("oxygen").getValue()));
                bed_apollo += Integer.parseInt(String.valueOf(dss_apollo.child("ventilator").getValue()));

                int bed_bgs = Integer.parseInt(String.valueOf(dss_bgs.child("general").getValue()));
                bed_bgs += Integer.parseInt(String.valueOf(dss_bgs.child("oxygen").getValue()));
                bed_bgs += Integer.parseInt(String.valueOf(dss_bgs.child("ventilator").getValue()));

                available = 0;
                occupied = 0;

                available += bed_covidcentre;
                available += bed_rajivgandhi;
                available += bed_victoria;
                available += bed_rrmc;
                available += bed_apollo;
                available += bed_bgs;

                occupied = 6300-available;

                emptybed.setText(String.valueOf(available));
                occupiedbed.setText(String.valueOf(occupied));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

        bedstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bedstat.class));
            }
        });

        mystat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mystat.class));
            }
        });
    }

        */
}