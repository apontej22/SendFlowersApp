package com.example.janetaa.sendflowersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class CustomerInfo extends AppCompatActivity {

    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String street = "";
    private String city = "";
    private String zip = "";
    private String sizeSelected = "";
    private String colorSelected = "";


    private String ctvRoses;
    private String ctvCarnations;
    private String ctvTulips;
    private String ctvLilies;
    private String ctvChrysantemums;
    private String ctvOrchids;
    private RadioGroup rg1;
    private RadioButton rb1;
    private RadioButton rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);

         String ctvRosesText = "";
        String ctvCarnationsText = "";
        String ctvTulipsText = "";
        String ctvLiliesText = "";
        String ctvChrysantemumsText = "";
        String ctvOrchidsText = "";
        String sizeSelectedText = "";
        String colorSelectedText = "";


        final TextView lblCustomerInfo = (TextView) findViewById(R.id.lblCustomerInfo);
        final TextView lblFirstName = (TextView) findViewById(R.id.lblFirstName);
        final TextView lblLastName = (TextView) findViewById(R.id.lblLastName);
        final TextView lblPhone = (TextView) findViewById(R.id.lblPhone);
        final TextView lblStreet = (TextView) findViewById(R.id.lblStreet);
        final TextView lblCity = (TextView) findViewById(R.id.lblCity);
        final TextView lblZip = (TextView) findViewById(R.id.lblZip);
        final EditText firstName = (EditText) findViewById(R.id.txtFirstName);
        final EditText lastName = (EditText) findViewById(R.id.txtLastName);
        final EditText phone = (EditText) findViewById(R.id.txtPhone);
        final EditText street = (EditText) findViewById(R.id.txtStreet);
        final EditText city = (EditText) findViewById(R.id.txtCity);
        final EditText zip = (EditText) findViewById(R.id.txtZip);
        final TextView lblSelectService = (TextView) findViewById(R.id.lblSelectService);
        final RadioGroup rdGroup = (RadioGroup) findViewById(R.id.rdGroup);
        final RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        final Button btnSubmit = (Button) findViewById(R.id.btnSubmit);




        Bundle extras = getIntent().getExtras();
        if (extras != null){
            ctvRoses = extras.getString("Roses");
            ctvCarnations = extras.getString("Carnations");
            ctvTulips = extras.getString("Tulips");
            ctvLilies = extras.getString("Lilies");
            ctvChrysantemums = extras.getString("Chrysantemums");
            ctvOrchids = extras.getString("Orchids");
            sizeSelected = extras.getString("BouquetSize");
            colorSelected = extras.getString("Color");
        }

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(CustomerInfo.this, Summary.class);
                nextScreen.putExtra("FirstName", firstName.getText().toString());
                nextScreen.putExtra("LastName", lastName.getText().toString());
                nextScreen.putExtra("Phone", phone.getText().toString());
                nextScreen.putExtra("Street", street.getText().toString());
                nextScreen.putExtra("City", city.getText().toString());
                nextScreen.putExtra("Zip", zip.getText().toString());
                nextScreen.putExtra("Deliver", rb1.getText().toString());
                nextScreen.putExtra("StorePickup",rb2.getText().toString());
                nextScreen.putExtra("Roses", ctvRoses);
                nextScreen.putExtra("Carnations", ctvCarnations);
                nextScreen.putExtra("Tulips", ctvTulips);
                nextScreen.putExtra("Liles", ctvLilies);
                nextScreen.putExtra("Chrysantemums", ctvChrysantemums);
                nextScreen.putExtra("Orchids", ctvOrchids);
                nextScreen.putExtra("BouquetSize", sizeSelected);
                nextScreen.putExtra("Color", colorSelected);

                startActivity(nextScreen);

            }
        });


    }
}
