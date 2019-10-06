package com.example.projekt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button backButton = (Button) findViewById(R.id.backButton);
        final TextView firstname = (TextView) findViewById(R.id.firstNameText1);
        final TextView lastname = (TextView) findViewById(R.id.lastNameText1);
        final TextView depname = (TextView) findViewById(R.id.depNameText1);

        String fname1,lname1,depname1;

        fname1=getIntent().getStringExtra("fname");
        lname1=getIntent().getStringExtra("lname");
        depname1=getIntent().getStringExtra("dname");

        firstname.setText(fname1);
        lastname.setText(lname1);
        depname.setText(depname1);


        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MainActivity.class));

            }
        });
    }

    //comment
}
