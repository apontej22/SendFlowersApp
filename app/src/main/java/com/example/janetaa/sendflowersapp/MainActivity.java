package com.example.janetaa.sendflowersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView lblFlowerShopName = (TextView) findViewById(R.id.lblFlowerShopName);
        Button btnShopNow = (Button) findViewById(R.id.btnShopNow);

        btnShopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(MainActivity.this, FlowerSelection.class);
                startActivity(nextScreen);
            }
        });
    }
}
