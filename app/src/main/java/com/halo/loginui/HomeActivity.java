package com.halo.loginui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class HomeActivity extends AppCompatActivity {
Button Mapbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Mapbutton = (Button) findViewById(R.id.mapbutton);
        Mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(HomeActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
