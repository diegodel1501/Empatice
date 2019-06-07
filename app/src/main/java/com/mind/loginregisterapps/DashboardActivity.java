package com.mind.loginregisterapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;


public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView rlprogres;
    private CardView cvrecomendaciones;
    private CardView cvtest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashbroad);
        rlprogres=findViewById(R.id.rlprogreso);
        rlprogres.setOnClickListener(this);
        cvrecomendaciones=findViewById(R.id.cvrecomendaciones);
        cvrecomendaciones.setOnClickListener(this);
        cvtest=findViewById(R.id.cvtest);
        cvtest.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        if(v==rlprogres){
            Intent i = new Intent(this, ProgresoActivity.class );
            startActivity(i);
        }
        if(v==cvrecomendaciones){
            Intent i = new Intent(this, RecomendacionActivity.class );
            startActivity(i);
        }
        if(v==cvtest){
            Intent i = new Intent(this, TestActivity.class );
            startActivity(i);
        }


    }
}