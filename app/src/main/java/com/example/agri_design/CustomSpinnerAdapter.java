package com.example.agri_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomSpinnerAdapter extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private int[] textColors;

    public CustomSpinnerAdapter(Context context, String[] text, int[] textColors) {
        super(context, R.layout.spinner_item, text);
        inflater = LayoutInflater.from(context);
        this.textColors = textColors;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.text_view_item);
        textView.setText(getItem(position));
        textView.setTextColor(textColors[position]);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_dropdown_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.text_view_item);
        textView.setText(getItem(position));
        textView.setTextColor(textColors[position]);

        return convertView;
    }
}

