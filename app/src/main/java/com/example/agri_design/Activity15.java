package com.example.agri_design;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Activity15 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity15);
        EditText editText = findViewById(R.id.editText);

        SpannableString spannableString = new SpannableString("Student Name *");
        ForegroundColorSpan colorSpan1 = new ForegroundColorSpan(Color.rgb(0,139,139) );
        ForegroundColorSpan colorSpan2 = new ForegroundColorSpan(Color.rgb(255,0,144) );

        spannableString.setSpan(colorSpan1, 0, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(colorSpan2, 13, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        editText.setHint(new SpannableStringBuilder(spannableString));
        TextInputLayout textInputLayout = findViewById(R.id.textview);
        textInputLayout.setHint(new SpannableStringBuilder(spannableString));

    }
}