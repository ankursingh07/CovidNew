package com.example.mycovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Bedstat extends AppCompatActivity {

    TextView covidcentre_general;
    TextView covidcentre_oxygen;
    TextView covidcentre_ventilator;

    TextView rajivgandhi_general;
    TextView rajivgandhi_oxygen;
    TextView rajivgandhi_ventilator;

    TextView victoria_general;
    TextView victoria_oxygen;
    TextView victoria_ventilator;

    TextView rrmc_general;
    TextView rrmc_oxygen;
    TextView rrmc_ventilator;

    TextView apollo_general;
    TextView apollo_oxygen;
    TextView apollo_ventilator;

    TextView bgs_general;
    TextView bgs_oxygen;
    TextView bgs_ventilator;

    FirebaseDatabase db;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedstat);

        covidcentre_general = findViewById(R.id.bedstat_text_covidcentre_general);
        covidcentre_oxygen = findViewById(R.id.bedstat_text_covidcentre_oxygen);
        covidcentre_ventilator = findViewById(R.id.bedstat_text_covidcentre_ventilator);

        rajivgandhi_general = findViewById(R.id.bedstat_text_rajivgandhi_general);
        rajivgandhi_oxygen = findViewById(R.id.bedstat_text_rajivgandhi_oxygen);
        rajivgandhi_ventilator = findViewById(R.id.bedstat_text_rajivgandhi_ventilator);

        victoria_general = findViewById(R.id.bedstat_text_victoria_general);
        victoria_oxygen = findViewById(R.id.bedstat_text_victoria_oxygen);
        victoria_ventilator = findViewById(R.id.bedstat_text_victoria_ventilator);

        rrmc_general = findViewById(R.id.bedstat_text_rrmc_general);
        rrmc_oxygen = findViewById(R.id.bedstat_text_rrmc_oxygen);
        rrmc_ventilator = findViewById(R.id.bedstat_text_rrmc_ventilator);

        apollo_general = findViewById(R.id.bedstat_text_apollo_general);
        apollo_oxygen = findViewById(R.id.bedstat_text_apollo_oxygen);
        apollo_ventilator = findViewById(R.id.bedstat_text_apollo_ventilator);

        bgs_general = findViewById(R.id.bedstat_text_bgs_general);
        bgs_oxygen = findViewById(R.id.bedstat_text_bgs_oxygen);
        bgs_ventilator = findViewById(R.id.bedstat_text_bgs_ventilator);

        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Hospital");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                DataSnapshot dss_covidcentre = dataSnapshot.child("covidcentre");
                DataSnapshot dss_rajivgandhi = dataSnapshot.child("rajivgandhi");
                DataSnapshot dss_victoria = dataSnapshot.child("victoria");
                DataSnapshot dss_rrmc = dataSnapshot.child("rrmc");
                DataSnapshot dss_apollo = dataSnapshot.child("apollo");
                DataSnapshot dss_bgs = dataSnapshot.child("bgs");

                covidcentre_general.setText(String.valueOf(dss_covidcentre.child("general").getValue()));
                covidcentre_oxygen.setText(String.valueOf(dss_covidcentre.child("oxygen").getValue()));
                covidcentre_ventilator.setText(String.valueOf(dss_covidcentre.child("ventilator").getValue()));

                rajivgandhi_general.setText(String.valueOf(dss_rajivgandhi.child("general").getValue()));
                rajivgandhi_oxygen.setText(String.valueOf(dss_rajivgandhi.child("oxygen").getValue()));
                rajivgandhi_ventilator.setText(String.valueOf(dss_rajivgandhi.child("ventilator").getValue()));

                victoria_general.setText(String.valueOf(dss_victoria.child("general").getValue()));
                victoria_oxygen.setText(String.valueOf(dss_victoria.child("oxygen").getValue()));
                victoria_ventilator.setText(String.valueOf(dss_victoria.child("ventilator").getValue()));

                rrmc_general.setText(String.valueOf(dss_rrmc.child("general").getValue()));
                rrmc_oxygen.setText(String.valueOf(dss_rrmc.child("oxygen").getValue()));
                rrmc_ventilator.setText(String.valueOf(dss_rrmc.child("ventilator").getValue()));

                apollo_general.setText(String.valueOf(dss_apollo.child("general").getValue()));
                apollo_oxygen.setText(String.valueOf(dss_apollo.child("oxygen").getValue()));
                apollo_ventilator.setText(String.valueOf(dss_apollo.child("ventilator").getValue()));

                bgs_general.setText(String.valueOf(dss_bgs.child("general").getValue()));
                bgs_oxygen.setText(String.valueOf(dss_bgs.child("oxygen").getValue()));
                bgs_ventilator.setText(String.valueOf(dss_bgs.child("ventilator").getValue()));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}