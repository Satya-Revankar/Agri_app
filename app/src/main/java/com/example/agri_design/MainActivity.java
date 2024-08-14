package com.example.agri_design;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button1 = findViewById(R.id.button1);
            Button button2 = findViewById(R.id.button2);
            Button button3 = findViewById(R.id.button3);
            Button button4 = findViewById(R.id.button4);
            Button button5 = findViewById(R.id.button5);
            Button button6 = findViewById(R.id.button6);
            Button button7 = findViewById(R.id.button7);
            Button button8 = findViewById(R.id.button8);
            Button button9 = findViewById(R.id.button9);
            Button button10 = findViewById(R.id.button10);
            Button button11 = findViewById(R.id.button11);
            Button button12 = findViewById(R.id.button12);
            Button button13 = findViewById(R.id.button13);
            Button button14 = findViewById(R.id.button14);
            Button button15 = findViewById(R.id.button15);



            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button1 = new Intent(MainActivity.this, MainActivity1.class);
                    startActivity(button1);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button2 = new Intent(MainActivity.this, Activity2.class);
                    startActivity(button2);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button3 = new Intent(MainActivity.this, Activity3.class);
                    startActivity(button3);
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button4 = new Intent(MainActivity.this, Activity4.class);
                    startActivity(button4);
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button5 = new Intent(MainActivity.this, Activity5.class);
                    startActivity(button5);
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button6 = new Intent(MainActivity.this, Activity6.class);
                    startActivity(button6);
                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button7 = new Intent(MainActivity.this, Activity7.class);
                    startActivity(button7);

                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button8 = new Intent(MainActivity.this, Activity8.class);
                    startActivity(button8);
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button9 = new Intent(MainActivity.this, Activity9.class);
                    startActivity(button9);
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button10 = new Intent(MainActivity.this, Activity10.class);
                    startActivity(button10);
                }
            });
            button11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button11 = new Intent(MainActivity.this, Activity11.class);
                    startActivity(button11);
                }
            });
            button12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button12 = new Intent(MainActivity.this, Activity12.class);
                    startActivity(button12);

                }
            });
            button13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button13 = new Intent(MainActivity.this, Activity13.class);
                    startActivity(button13);
                }
            });
            button14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button14 = new Intent(MainActivity.this, Activity14.class);
                    startActivity(button14);
                }
            });
            button15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent button15 = new Intent(MainActivity.this, Activity15.class);
                    startActivity(button15);
                }
            });
        }
    }

