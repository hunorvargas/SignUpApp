package com.example.projekt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
private static Integer registnumber=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText firstname = (EditText) findViewById(R.id.firstNameText);
        final EditText lastname = (EditText) findViewById(R.id.lastNameText1);
        final EditText depname = (EditText) findViewById(R.id.departNameText);
        Button registerButton = (Button) findViewById(R.id.registerButton2);

        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String fname=firstname.getText().toString();
                String lname=lastname.getText().toString();
                String dname=depname.getText().toString();
                Intent profileintent=new Intent(Register.this, Profile.class);
                profileintent.putExtra("fname",fname);
                profileintent.putExtra("lname",lname);
                profileintent.putExtra("dname",dname);


                ++registnumber;
                profileintent.putExtra("regnum",registnumber);

                startActivity(profileintent);
            }
        });
        firstname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname.setText(" ");
            }
        });
        lastname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastname.setText(" ");
            }
        });
        depname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                depname.setText(" ");
            }
        });
    }
}
