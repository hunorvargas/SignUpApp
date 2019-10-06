package com.example.projekt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signUpButton = (Button) findViewById(R.id.signUpButton);
        Button registerButton = (Button) findViewById(R.id.registerButton1);
        final EditText fname = (EditText) findViewById(R.id.editFirstName);
        final EditText lname = (EditText) findViewById(R.id.editLastName);

        fname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname.setText(" ");
            }
        });
        lname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lname.setText(" ");
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String fname1,lname1;
                fname1=getIntent().getStringExtra("fname");
                lname1=getIntent().getStringExtra("lname");

                System.out.printf("name %s",fname1);

                if(fname.getText().toString().equals(fname1) &&
                        lname.getText().toString().equals(lname1)) {
                    startActivity(new Intent(MainActivity.this, Profile.class));
                }else{
                    fname.setError(" Frist name Problem");
                    lname.setError("Last name Problem");

                }
            }

        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Register.class));

            }
        });
    }

}