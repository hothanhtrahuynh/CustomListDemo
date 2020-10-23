package com.example.customlistdemo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CusttomContactLabelAdapter extends ArrayAdapter<Info> {

    private Context context;
    private int resource;

    List<Info> listcontact;

    public CusttomContactLabelAdapter(Context MainActivityContext, int layoutTobeInflated, List<Info> list){
        super(MainActivityContext,layoutTobeInflated,list);

        this.context=MainActivityContext;
        this.resource = layoutTobeInflated;
        listcontact = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.contaclayout,null,true);

            TextView textViewname = (TextView) row.findViewById(R.id.name);
            TextView textViewphone = (TextView) row.findViewById((R.id.num));
            ImageView imgAvatar = (ImageView) row.findViewById(R.id.thumbnail);

            String ten = listcontact.get(position).getName() ;
            String sdt = listcontact.get(position).getPhone();
            Integer Rsc= listcontact.get(position).getResource();

            textViewname.setText(ten);
            textViewphone.setText(sdt);
            imgAvatar.setImageResource(Rsc);
        }
        return row;
    }


}
