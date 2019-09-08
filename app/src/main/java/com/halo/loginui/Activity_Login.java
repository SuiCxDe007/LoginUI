package com.halo.loginui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity {
Button signin;
EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signin = (Button) findViewById(R.id.button_signin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }



    public void login(){

        if(signin.toString()==null||password.toString()==null){

            Toast.makeText(this, "Please Fill The Required Fields", Toast.LENGTH_SHORT).show();

        }
        else if (signin.toString()=="admin" && password.toString()=="admin"){
            Toast.makeText(this, "Sign In Successfull", Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(Activity_Login.this,
                    HomeActivity.class);
            startActivity(myIntent);
        }



    }
}
