package com.example.swethu.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements
        AdapterView.OnItemClickListener, View.OnClickListener{
    /*ListView lv;*/
/*
    String days[]={"Water Packets","1 litre water bottle","Juhi"};
*/
    ImageButton b1,b2,b3,b4;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);
        b1 = findViewById(R.id.ib1);
        b1.setOnClickListener(this);
        b2= findViewById(R.id.ib2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.ib3);
        b3.setOnClickListener(this);
        b4= findViewById(R.id.ib4);
        b4.setOnClickListener(this);
        b= findViewById(R.id.button2);
        b.setOnClickListener(this);


      /*  //android.R.layout.simple_list_item_1
        ArrayAdapter<String> ada=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                days);
        lv.setAdapter(ada);
        lv.setOnItemClickListener(this);*/
    }




    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView txt = (TextView) view;
        Toast.makeText(getApplicationContext(), "You have selected : " + txt.getText(),
                Toast.LENGTH_SHORT).show();

    }
    public void onClick(View view) {
        if(view.getId() == b1.getId())
            Toast.makeText(this,"1 litre bottle selected", Toast.LENGTH_SHORT).show();
        else if(view.getId() == b3.getId())
            Toast.makeText(this,"water packet selected", Toast.LENGTH_SHORT).show();
        else if(view.getId() == b4.getId())
            Toast.makeText(this,"2 litre bottle selected", Toast.LENGTH_SHORT).show();
        else if(view.getId() == b2.getId())
            Toast.makeText(this,"Water can selected", Toast.LENGTH_SHORT).show();
        else if(view.getId() == b.getId()) {
            Toast.makeText(this, "Info about us", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(i);
        }

    }

}
