package com.example.mycovid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

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


    }
}