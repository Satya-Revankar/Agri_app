package com.example.agri_design;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

public class Activity12 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity12);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        //getSupportActionBar().setElevation(0);
        View view = getSupportActionBar().getCustomView();
        TextView name = view.findViewById(R.id.name);

        SwitchCompat switchCompat;switchCompat = findViewById(R.id.sw);

        switchCompat.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if (switchCompat.isChecked()){
                    Toast.makeText(Activity12.this, "Cliked on Finance", Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(Activity12.this, "Cliked on CSR!", Toast.LENGTH_SHORT).show();

                }
            }

        });

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textview1 = new Intent(Activity12.this, Activity13.class);
                startActivity(textview1);
            }
        });



/*
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle.isChecked()) {
                    Toast.makeText(Activity12.this, "You have clicked ", Toast.LENGTH_LONG).show();
                }            }
        });*/
    }
}



   /* // methods to control the operations that will
    // happen when user clicks on the action buttons
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {

        switch (item.getItemId()){
            case R.id.search:
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.refresh:
                Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}*/

