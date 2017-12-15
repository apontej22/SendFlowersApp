package com.example.janetaa.sendflowersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String street = "";
    private String city = "";
    private String zip = "";

    private String ctvRoses ="";
    private String ctvCarnations = "";
    private String ctvTulips = "";
    private String ctvLilies = "";
    private String ctvChrysantemums ="";
    private String ctvOrchids = "";


    private String selectedColor = "";
    private String selectedSize = "";
    private String deliver = "";
    private String storePickup = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);


        Bundle extras = getIntent().getExtras();
        if(extras != null){
            firstName = extras.getString("FirstName");
            lastName = extras.getString("LastName");
            phone = extras.getString("Phone");
            street = extras.getString("Street");
            city = extras.getString("City");
            zip = extras.getString("Zip");
            selectedSize = extras.getString("BouquetSize");
            selectedColor = extras.getString("Color");
            deliver = extras.getString("Deliver");
            storePickup = extras.getString("StorePickup");
            ctvRoses = extras.getString("Roses");
            ctvCarnations = extras.getString("Carnations");
            ctvTulips = extras.getString("Tulips");
            ctvLilies = extras.getString("Lilies");
            ctvChrysantemums = extras.getString("Chrysantemums");
            ctvOrchids = extras.getString("Orchids");




        }


        final TextView lblOrder = (TextView) findViewById(R.id.lblOrder);
        final TextView txtName = (TextView) findViewById(R.id.txtName);
        final TextView txtPhone = (TextView) findViewById(R.id.txtPhone);
        final TextView txtAddress = (TextView) findViewById(R.id.txtAddress);
        final TextView lblSum = (TextView) findViewById(R.id.lblSum);
        final TextView txtOrder = (TextView) findViewById(R.id.txtOrder);

        txtName.setText(firstName + " " + lastName);
        txtPhone.setText(phone);
        txtAddress.setText(street + "\n" + city + "\n" + zip);
        StringBuilder Order = new StringBuilder(250);
        if (!ctvRoses.equals("")){
            Order.append(ctvRoses + "\n" + selectedSize + "\n" + selectedColor );
        }
        if (!ctvCarnations.equals("")){
            Order.append(ctvCarnations + "\n" + selectedSize + "\n" + selectedColor);
        }
        if (!ctvTulips.equals("")){
            Order.append(ctvTulips + "\n" + selectedSize + "\n" + selectedColor);
        }
        if (!ctvLilies.equals("")){
            Order.append(ctvLilies + "\n" + selectedSize + "\n" + selectedColor);
        }
        if (!ctvChrysantemums.equals("")){
            Order.append(ctvChrysantemums + "\n" + selectedSize + "\n" + selectedColor);
        }
        if (!ctvOrchids.equals("")){
            Order.append(ctvOrchids + "\n" + selectedSize + "\n" + selectedColor);
        }

        txtOrder.setText(Order);







    }
}
