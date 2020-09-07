package com.example.mycovid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.ChainHead;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

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

        pregnant.setClickable(false);

        male.setChecked(true);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Login.this, MainActivity.class));
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
}