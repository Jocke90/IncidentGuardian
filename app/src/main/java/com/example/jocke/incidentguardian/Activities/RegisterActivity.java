package com.example.jocke.incidentguardian.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jocke.incidentguardian.R;

public class RegisterActivity extends AppCompatActivity {

    Button btnCompleteReg;
    Button btnBack;
    EditText userName;
    EditText pass;
    String userNameValue;
    String passValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnCompleteReg = (Button) findViewById(R.id.buttonFinish);
        btnBack = (Button) findViewById(R.id.buttonBack);
        userName = (EditText) findViewById(R.id.editTextUserName);
        pass = (EditText) findViewById(R.id.editTextPass);

        btnCompleteReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNameValue = userName.getText().toString();
                passValue = pass.getText().toString();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });
    }

}
