package com.example.janetaa.sendflowersapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FlowerSelection extends AppCompatActivity {

    private Toast toastError = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_selection);

        final TextView lblFlowerSelection = (TextView) findViewById(R.id.lblFlowerSelection);
        final CheckedTextView txtRoses = (CheckedTextView) findViewById(R.id.txtRoses);
        final CheckedTextView txtCarnations = (CheckedTextView) findViewById(R.id.txtCarnations);
        final CheckedTextView txtTulips = (CheckedTextView) findViewById(R.id.txtTulips);
        final CheckedTextView txtLilies = (CheckedTextView) findViewById(R.id.txtLilies);
        final CheckedTextView txtChrysantemums = (CheckedTextView) findViewById(R.id.txtChrysantemums);
        final CheckedTextView txtOrchids = (CheckedTextView) findViewById(R.id.txtOrchids);
        final TextView txtPriceRoses = (TextView) findViewById(R.id.txtPriceRoses);
        final TextView txtPriceCarnations = (TextView) findViewById(R.id.txtPriceCarnations);
        final TextView txtPriceTulips = (TextView) findViewById(R.id.txtPriceTulips);
        final TextView txtPriceLilies = (TextView) findViewById(R.id.txtPriceLilies);
        final TextView txtPriceOrchids = (TextView) findViewById(R.id.txtPriceOrchids);
        final TextView txtPriceChrysantemums = (TextView) findViewById(R.id.txtPriceChrysantemums);
        final TextView lblSelectSize = (TextView) findViewById(R.id.lblSelectSize);
        final Spinner spnBouquetSize = (Spinner) findViewById(R.id.spnBouquetSize);
        final TextView lblSelectColor = (TextView) findViewById(R.id.lblSelectColor);
        final Spinner spnColor = (Spinner) findViewById(R.id.spnColor);
        Button btnBuy = (Button) findViewById(R.id.btnBuy);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = (new Intent(FlowerSelection.this, CustomerInfo.class));

                String ctvRosesText = "";
                String ctvCarnationsText = "";
                String ctvTulipsText = "";
                String ctvLiliesText = "";
                String ctvChrysantemumsText = "";
                String ctvOrchidsText = "";
                String sizeSelectedText = "";
                String colorSelectedText = "";


                if(txtRoses.isChecked()){
                    ctvRosesText =  txtRoses.getText().toString();
                }
                if(txtCarnations.isChecked()){
                    ctvCarnationsText =  txtCarnations.getText().toString();
                }
                if(txtTulips.isChecked()){
                    ctvTulipsText =  txtTulips.getText().toString();
                }
                if(txtLilies.isChecked()){
                    ctvLiliesText =  txtLilies.getText().toString();
                }
                if(txtChrysantemums.isChecked()){
                    ctvChrysantemumsText =  txtChrysantemums.getText().toString();
                }
                if(txtOrchids.isChecked()){
                    ctvOrchidsText =  txtOrchids.getText().toString();
                }
                 sizeSelectedText = spnBouquetSize.getSelectedItem().toString();
                 colorSelectedText = spnColor.getSelectedItem().toString();
                nextScreen.putExtra("Roses", ctvRosesText );
                nextScreen.putExtra("Carnations", ctvCarnationsText);
                nextScreen.putExtra("Tulips", ctvTulipsText);
                nextScreen.putExtra("Lilies", ctvLiliesText);
                nextScreen.putExtra("Chrysantemums", ctvChrysantemumsText);
                nextScreen.putExtra("Orchids", ctvOrchidsText);
                nextScreen.putExtra("BouquetSize", sizeSelectedText);
                nextScreen.putExtra("Color", colorSelectedText);

                    startActivity(nextScreen);

            }
        });

        txtRoses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtRoses.isChecked())
                    enableDisable(txtRoses, Color.WHITE, false);
                else
                    enableDisable(txtRoses, Color.GRAY, true);
            }
        });
        txtCarnations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtCarnations.isChecked())
                    enableDisable(txtCarnations, Color.WHITE, false);
                else
                    enableDisable(txtCarnations, Color.GRAY, true);
            }
        });
        txtTulips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtTulips.isChecked())
                    enableDisable(txtTulips, Color.WHITE, false);
                else
                    enableDisable(txtTulips, Color.GRAY, true);
            }
        });
        txtLilies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtLilies.isChecked())
                    enableDisable(txtLilies, Color.WHITE, false);
                else
                    enableDisable(txtLilies, Color.GRAY, true);
            }
        });
        txtChrysantemums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtChrysantemums.isChecked())
                    enableDisable(txtChrysantemums, Color.WHITE, false);
                else
                    enableDisable(txtChrysantemums, Color.GRAY, true);
            }
        });
        txtOrchids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtOrchids.isChecked())
                    enableDisable(txtOrchids, Color.WHITE, false);
                else
                    enableDisable(txtOrchids, Color.GRAY, true);
            }
        });
    }

    public void enableDisable(CheckedTextView ctv,Integer bgColor, Boolean state){
        ctv.setChecked(state);
        ctv.setBackgroundColor(bgColor);
    }


}
