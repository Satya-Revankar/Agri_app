package com.example.agri_design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity10);

        Button button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button2 = new Intent(Activity10.this,Activity11.class);
                startActivity(button2);
            }
        });

        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.listView);

        lv.setAdapter(new CustomAdapter(this, userList));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                listitem user = (listitem) lv.getItemAtPosition(position);
                Toast.makeText(Activity10.this, "Selected :" + " " + user.getSl()+","+user.getNumber()+","+user.getDate(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private ArrayList getListData() {
        ArrayList<listitem> results = new ArrayList<>();
        listitem user1 = new listitem();

        //  user1.setText("TestNotification");
        //  user1.setMblNo("SubmitedOn");
        user1.setNumber("9986638183");
        user1.setDate("1-1-2023 4:05:2");
        results.add(user1);

        return results;
    }
}