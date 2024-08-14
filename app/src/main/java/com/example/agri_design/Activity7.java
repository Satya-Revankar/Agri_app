package com.example.agri_design;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {

LinearLayout layout1,layout2,layout3,layout4,layout5,layout10,
             layout14,layout7,layout8,layout9,layout6,layout11;
TextView     textview1,textview2,textview3,text4,text7,text8,text9;


@SuppressLint("MissingInflatedId")
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity7);

        final Button button = findViewById(R.id.button);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
        layout5 = findViewById(R.id.layout5);
        layout6 = findViewById(R.id.layout6);
        layout14 = findViewById(R.id.layout14);
        layout7 = findViewById(R.id.layout7);
        layout8 = findViewById(R.id.layout8);
        layout9 = findViewById(R.id.layout9);
        layout10 = findViewById(R.id.layout10);
        layout11= findViewById(R.id.layout11);
        textview1= findViewById(R.id.textview1);
        textview2= findViewById(R.id.textview2);
        textview3= findViewById(R.id.textview3);
        text4= findViewById(R.id.text4);
        text7= findViewById(R.id.text7);
        text8= findViewById(R.id.text8);
        text9= findViewById(R.id.text9);



    button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout1.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout2.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout3.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout4.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout5.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout6.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout14.setBackgroundColor(getResources().getColor(R.color.teal_200));
                layout7.setBackgroundColor(getResources().getColor(R.color.teal_800));
                layout8.setBackgroundColor(getResources().getColor(R.color.teal_800));
                layout9.setBackgroundColor(getResources().getColor(R.color.teal_800));
                layout10.setBackgroundColor(getResources().getColor(R.color.teal_800));
                layout11.setBackgroundColor(getResources().getColor(R.color.teal_800));
                textview1.setTextColor(getResources().getColor(R.color.white));
                textview2.setTextColor(getResources().getColor(R.color.white));
                textview3.setTextColor(getResources().getColor(R.color.white));
                text4.setTextColor(getResources().getColor(R.color.white));
                text7.setTextColor(getResources().getColor(R.color.white));
                text8.setTextColor(getResources().getColor(R.color.white));
                text9.setTextColor(getResources().getColor(R.color.white));
            }
        });

        /*Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button2 = new Intent(Activity6.this, Activity7.class);
                startActivity(button2);
            }
        });*/

    Button button1= findViewById(R.id.button1);


    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent button1 = new Intent(Activity7.this, Activity8.class);
            startActivity(button1);
        }
    });
    }
}