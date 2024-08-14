package com.example.agri_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomSpinnAdapter extends ArrayAdapter<String> {
    private LayoutInflater inflater;
    private int[] itemColor;

    public CustomSpinnAdapter(Context context, String[] item, int[] itemColor) {
        super(context, R.layout.spinner_item, item);
        inflater = LayoutInflater.from(context);
        this.itemColor = itemColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.text_view_item);
        textView.setText(getItem(position));
        textView.setBackgroundColor(itemColor[position]);
        return convertView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.spinner_dropdown_item, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.text_view_item);
        textView.setText(getItem(position));
        textView.setBackgroundColor(itemColor[position]);

        return convertView;
    }
}

