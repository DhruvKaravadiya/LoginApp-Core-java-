package com.dhruvkaravadiya.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText userNameObj = (EditText) findViewById(R.id.username);
        MaterialButton regBtnObj = (MaterialButton)  findViewById(R.id.signupbtn);
        EditText passwordObj = (EditText) findViewById(R.id.password);
        EditText rePasswordObj = (EditText) findViewById(R.id.repassword);
        regBtnObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = userNameObj.getText().toString();
                String password1 = passwordObj.getText().toString();
                String repassword1 = rePasswordObj.getText().toString();
                if(password1 == repassword1){
                    Toast.makeText(MainActivity.this, "Sign Up Successfull", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}