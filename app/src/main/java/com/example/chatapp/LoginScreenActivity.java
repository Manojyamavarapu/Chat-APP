package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.hbb20.CountryCodePicker;

public class LoginScreenActivity extends AppCompatActivity {

    CountryCodePicker countryCodePicker;
    EditText phoneInput;
    Button sendOtpButton;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        countryCodePicker = findViewById(R.id.login_countrycode);
        sendOtpButton = findViewById(R.id.send_otp_btn);
        phoneInput = findViewById(R.id.login_mobile_number);
        progressBar = findViewById(R.id.login_progessbar);

        progressBar.setVisibility(View.GONE);

        countryCodePicker.registerCarrierNumberEditText(phoneInput);
        sendOtpButton.setOnClickListener((view -> {
            if(!countryCodePicker.isValidFullNumber()){
                phoneInput.setError("Enter valid phone number");
                return;
            }
            Intent in = new Intent(LoginScreenActivity.this, LoginOTPActivity.class);
            in.putExtra("phone", countryCodePicker.getFullNumberWithPlus());
            startActivity(in);
        }));
    }
}