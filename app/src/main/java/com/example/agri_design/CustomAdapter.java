package com.example.agri_design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter  extends BaseAdapter {
    private ArrayList<listitem> listData;
    private LayoutInflater layoutInflater;
    public CustomAdapter(Context aContext, ArrayList<listitem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listData.size();
    }
    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View v, ViewGroup vg) {
        ViewHolder holder;
        if (v == null) {
            v = layoutInflater.inflate(R.layout.listview_ui, null);
            holder = new ViewHolder();
            holder.sl = (TextView) v.findViewById(R.id.sl);

            holder.number= (TextView) v.findViewById(R.id.number); //  holder.submit = (TextView) v.findViewById(R.id.submit);
            holder.date = (TextView) v.findViewById(R.id.date);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }


        holder.number.setText(listData.get(position).getNumber());


        return v;
    }
    static class ViewHolder {
        TextView sl;

        TextView number;

        TextView date;
    }
}




