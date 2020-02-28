package com.example.swethu.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
ImageButton b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b7=findViewById(R.id.ib4);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==b7.getId()){
            Toast.makeText(this, "One beautiful Happy Girl :)", Toast.LENGTH_SHORT).show();
        }
    }
}
