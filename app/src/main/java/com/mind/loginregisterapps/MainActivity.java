package com.mind.loginregisterapps;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btRegister;
    private TextView tvLogin;
    private TextView tvDash;

    private EditText nick;
    private EditText pass;

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRegister  = findViewById(R.id.btRegister);
        tvLogin     = findViewById(R.id.tvLogin);
        tvDash     = findViewById(R.id.tvDash);

        btRegister.setOnClickListener(this);
        tvLogin.setOnClickListener(this);
        nick = findViewById(R.id.nick);

        pass= findViewById(R.id.pass);
        nick.setText("admin");
        pass.setText("1234");
        /*

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webconexion(nick.getText().toString(),pass.getText().toString());

            }
        });
        */

    }







    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        if (v==btRegister){
            Intent intent   = new Intent(MainActivity.this,RegisterActivity.class);
            Pair[] pairs    = new Pair[1];
            pairs[0] = new Pair<View,String>(tvLogin,"tvLogin");
            ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
            startActivity(intent,activityOptions.toBundle());
        }
       // Toast.makeText(MainActivity.this,nick.getText().toString(),Toast.LENGTH_SHORT).show();
       // Toast.makeText(MainActivity.this,pass.getText().toString(),Toast.LENGTH_SHORT).show();
        if(v==tvLogin){

            if( nick.getText().toString().equalsIgnoreCase("admin")&& pass.getText().toString().equals("1234") ){
                Intent i = new Intent(this, DashboardActivity.class );
                startActivity(i);

            }  else{
                Toast.makeText(MainActivity.this,"user or pass wrong",Toast.LENGTH_SHORT).show();

            }
        }


        }



        }




