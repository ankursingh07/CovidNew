package com.example.mycovid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ChainHead;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import javax.security.auth.callback.CallbackHandler;

public class Login extends AppCompatActivity {

    Button update;

    EditText id;
    EditText age;

    RadioButton male;
    RadioButton female;
    RadioButton trans;

    CheckBox diabetes;
    CheckBox kidney;
    CheckBox heart;
    CheckBox respiratory;
    CheckBox pregnant;

    CheckBox aayushmaan;
    CheckBox aarogya;
    CheckBox insurance;

    FirebaseDatabase db;

    DatabaseReference ref;

    boolean flag;
    boolean done;

    String temp_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        update = findViewById(R.id.login_button_update);

        id = findViewById(R.id.login_text_id);
        age = findViewById(R.id.login_text_age);

        male = findViewById(R.id.login_radio_male);
        female = findViewById(R.id.login_radio_female);
        trans = findViewById(R.id.login_radio_other);

        diabetes = findViewById(R.id.login_checkbox_diabetes);
        kidney = findViewById(R.id.login_checkbox_kidney);
        heart = findViewById(R.id.login_checkbox_heart);
        respiratory = findViewById(R.id.login_checkbox_respiratory);
        pregnant = findViewById(R.id.login_checkbox_pregnant);

        aayushmaan = findViewById(R.id.login_checkbox_aayushmaan);
        aarogya = findViewById(R.id.login_checkbox_aarogya);
        insurance = findViewById(R.id.login_checkbox_insurance);

        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Member");

        pregnant.setClickable(false);

        male.setChecked(true);

        flag = false;
        done = false;

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Covid BLR ID is empty", Toast.LENGTH_SHORT).show();
                }
                else if (age.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Age is empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    temp_id = id.getText().toString().toUpperCase();

                    DatabaseReference temp = ref.child(temp_id);

                    temp.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.getValue() == null)
                                flag = false;
                            else if (dataSnapshot.child("updated").getValue(String.class).equals("false"))
                                flag = true;
                            else
                                done = true;
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });

                    Patient patient = new Patient();

                    patient.age = Integer.parseInt(age.getText().toString());
                    if (patient.age > 99)
                        patient.age = 99;

                    if (diabetes.isChecked())
                        patient.diabetes = "true";
                    if (kidney.isChecked())
                        patient.kidney = "true";
                    if (heart.isChecked())
                        patient.heart = "true";
                    if (respiratory.isChecked())
                        patient.respiratory = "true";
                    if (pregnant.isChecked())
                        patient.pregnant = "true";

                    if (aayushmaan.isChecked())
                        patient.aayushmaan = "true";
                    if (aarogya.isChecked())
                        patient.aarogya = "true";
                    if (insurance.isChecked())
                        patient.insurance = "true";

                    if (flag) {
                        temp.setValue(patient);

                        Toast.makeText(getApplicationContext(), "Successfully updated", Toast.LENGTH_SHORT).show();

                        finish();
                        startActivity(new Intent(Login.this, MainActivity.class));
                    }
                    else if (done)
                        Toast.makeText(getApplicationContext(), "Details has already been updated", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(getApplicationContext(), "Please check Covid BLR ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pregnant.setClickable(female.isChecked());
            }
        });

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pregnant.setClickable(false);
                pregnant.setChecked(false);
            }
        });

        trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pregnant.setClickable(false);
                pregnant.setChecked(false);
            }
        });
    }

    //public void onClickFindWorkout(View view)
   // {
        //TextView workouts=(TextView)findViewById(R.id.);
        //Spinner workout_type=(Spinner) findViewById(R.id.workout_type);
        //String workout = String.valueOf(workout_type.getSelectedItem());
        //workouts.setText(workout);
        //List<String > workoutList=expert.getWorkouts(workout);
        //StringBuilder workoutsformatted=new StringBuilder();
        //for(String work:workoutList)
        //{
        //    workoutsformatted.append(work).append('\n');
       // }
       // workouts.setText(workoutsformatted);
    //}


}