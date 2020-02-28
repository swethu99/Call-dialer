package com.example.swethu.myfirstapp;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e;
    Button dialButton, callButton, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialButton = (Button) findViewById(R.id.dialbutton);
        callButton = (Button) findViewById(R.id.callbutton);
        e = (EditText) findViewById(R.id.e1);
        dialButton.setOnClickListener(this);
        callButton.setOnClickListener(this);
        b9=findViewById(R.id.buttonmy);
        b9.setOnClickListener(this);
    }



    public void onClick(View view) {
        String phonenumber;
        e = (EditText) findViewById(R.id.e1);
        phonenumber = e.getText().toString();

        if (view.getId() == dialButton.getId()) {
            //Dialer
            Intent i = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:" + phonenumber));
            startActivity(i);

        }
        if (view.getId() == callButton.getId()) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            //Another way to pass phone no
            intent.setData(Uri.parse("tel:" + phonenumber));

            // The below if condition will be auto suggessted if not given.
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {

                // add the following line for runtime permission request
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.CALL_PHONE},
                        123);
                return;
            }
            startActivity(intent);

        }
        if(view.getId()==b9.getId()){
            Intent i=new Intent(this,Main4Activity.class);
            startActivity(i);
        }

    }
}

/*
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
       // b2 = findViewById(R.id.button2);

  */
/*  ---  Style 1  ---
 	 Making MainActivity class implement
View.OnClickListener interface and override
        its onClick method
        *//*

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            Toast.makeText(this,"Lets go", Toast.LENGTH_LONG).show();
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);

        }
        else
            Toast.makeText(this,"Button 2 Clicked", Toast.LENGTH_LONG).show();

    }
}

*/
