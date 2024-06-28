package com.example.blog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    EditText e1, e2, e3, e5, e8;
    AppCompatButton b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.age);
        e3 = (EditText) findViewById(R.id.hn);

        e5 = (EditText) findViewById(R.id.mob);

        e8 = (EditText) findViewById(R.id.cnf);
        b1 = (AppCompatButton) findViewById(R.id.reg);
        b2 = (AppCompatButton) findViewById(R.id.back);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName = e1.getText().toString();
                String getage = e2.getText().toString();
                String getHouseName = e3.getText().toString();

                String getMobileNumber = e5.getText().toString();

                String getConfirmPassword = e8.getText().toString();
                Toast.makeText(getApplicationContext(), getName+" " + getage + " " +getHouseName +" " + getMobileNumber + " " + getConfirmPassword, Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });


    }
}