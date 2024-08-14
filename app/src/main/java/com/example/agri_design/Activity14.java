package com.example.agri_design;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class Activity14 extends AppCompatActivity {

    String[] fruits={"Not in class","In class","In class with support","Full blocks","Absent","started teaching one block"};
    int images[] = {R.drawable.red,R.drawable.orange, R.drawable.yellow, R.drawable.greeen, R.drawable.blue,R.drawable.brown_1_24 };
    private Spinner spnColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity14);

        Spinner spinner = findViewById(R.id.spinner1);
        String[] text = {"Not in class","In class","In class with support","Full blocks","Absent","started teaching one block"};
        int[] textColors = {Color. rgb(255,77,77), Color.rgb(255, 165, 0),
                Color.rgb(252,226,5),Color.GREEN, Color.rgb(54, 134, 233),Color.rgb(121,92,50)};

        CustomSpinnerAdapter adapter = new CustomSpinnerAdapter(this, text, textColors);
        spinner.setAdapter(adapter);


        Spinner spin = (Spinner) findViewById(R.id.spinner);
        CustomAdapter3 customAdapter3=new CustomAdapter3(getApplicationContext(),images,fruits);
        spin.setAdapter(customAdapter3);


        Spinner spinn = findViewById(R.id.spinner2);
        String[] item = {"Not in class","In class","In class with support","Full blocks","Absent","started teaching one block"};
        int[] itemColor = {Color. rgb(255,77,77), Color.rgb(255, 102, 0),
                Color.rgb(249,166,2),Color.GREEN, Color.rgb(54, 134, 233),Color.rgb(126,72,28)};

        CustomSpinnAdapter spinnAdapteradapter = new CustomSpinnAdapter(this, item, itemColor);
        spinn.setAdapter(spinnAdapteradapter);

    }
}