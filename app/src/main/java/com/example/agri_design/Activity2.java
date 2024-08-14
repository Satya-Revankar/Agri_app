package com.example.agri_design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {
    Button button;
    Spinner spinner1,spinner2,spinner3,spinner5,spinner6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        spinner1= findViewById(R.id.spinner1);
        spinner2= findViewById(R.id.spinner2);
        spinner3= findViewById(R.id.spinner3);
        spinner5= findViewById(R.id.spinner5);
        spinner6= findViewById(R.id.spinner6);
        List<String> soiltype = new ArrayList<>();
        soiltype.add(0, " soiltype");

        soiltype.add("Sandy soil");
        soiltype.add("Silt soil");
        soiltype.add("Clay soil");
        soiltype.add("Loamy soil");
        soiltype.add("Chalk soil");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, soiltype);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter);
        /*spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose soiltype from lis")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/


        List<String> croptype = new ArrayList<>();
        croptype.add(0, " croptype");

        croptype.add("Fiber");
        croptype.add("Fruit");
        croptype.add("Vegetables");
        croptype.add("feed");
        croptype.add("Grains");
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, croptype);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(arrayAdapter2);
      /*  spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose croptype from lis")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/


        List<String> Reason = new ArrayList<>();
        Reason.add(0, " Reason");

        Reason.add("None");
        Reason.add("No data");
        Reason.add("No site selected");
        Reason.add("feed");
        Reason.add("Grains");
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Reason);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter3);
        /*spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose Reason from lis")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/

        List<String> machinenum = new ArrayList<>();
        machinenum.add(0, " machine num");

        machinenum.add("2343");
        machinenum.add("2343");
        machinenum.add("5464");
        machinenum.add("5765");
        machinenum.add("3454");
        ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, machinenum);
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter4);
       /* spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose machinenum from lis")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });*/
        List<String> vendor = new ArrayList<>();
        vendor.add(0, " vendor");

        vendor.add("2343");
        vendor.add("2343");
        vendor.add("5464");
        vendor.add("5765");
        vendor.add("3454");
        ArrayAdapter<String> arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, vendor);
        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter5);
      /*  spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Choose vendor from lis")){
                }else {
                    String item = parent.getItemAtPosition(position).toString();
                    Toast.makeText(parent.getContext(),"Selected: " +item, Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
*/
        Button button6= findViewById(R.id.button6);


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button6 = new Intent(Activity2.this, Activity3.class);
                startActivity(button6);
            }
        });

    }
}
