package com.example.levipole.codepathlab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    Button fpassword;
    Button signUp;
    Button change;
    Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login Button Pressed!", Toast.LENGTH_SHORT).show();

            }
        });

        fpassword = findViewById(R.id.forgotPassButton);
        fpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Forgot Password Button Pressed!", Toast.LENGTH_SHORT).show();

            }
        });

        signUp = findViewById(R.id.signUpButton);
        signUp.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Sign Up Button Pressed!", Toast.LENGTH_SHORT).show();

              }
        });
        change = findViewById(R.id.changeButton);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Change Button Pressed!", Toast.LENGTH_SHORT).show();
            }
        });
        help = findViewById(R.id.helpButton);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Help Button Pressed!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}