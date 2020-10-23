package com.example.customlistdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends Activity {

    TextView name;
    ArrayList<Info> listContact;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.contact);
        name = (TextView) findViewById(R.id.itemName);

        listContact = new ArrayList<Info>();
        listContact.add(new Info("0974748521", "Nguyen Van A",R.drawable.avatar_male));
        listContact.add(new Info("0974748522", "Nguyen Van B",R.drawable.img_avatar2));
        listContact.add(new Info("0974748523", "Nguyen Van C",R.drawable.avatar_male));
        listContact.add(new Info("0974748524", "Nguyen Van D",R.drawable.img_avatar2));
        listContact.add(new Info("0974748525", "Nguyen Van E",R.drawable.avatar_male));
        listContact.add(new Info("0974748526", "Nguyen Van F",R.drawable.img_avatar2));
        listContact.add(new Info("0974748527", "Nguyen Van G",R.drawable.img_avatar2));
        listContact.add(new Info("0974748528", "Nguyen Van H",R.drawable.img_avatar2));
        listContact.add(new Info("0974748529", "Nguyen Van I",R.drawable.img_avatar2));
        listContact.add(new Info("0974748510", "Nguyen Van K",R.drawable.img_avatar2));
        listContact.add(new Info("0974748511", "Nguyen Van L",R.drawable.img_avatar2));


        CusttomContactLabelAdapter adapter = new CusttomContactLabelAdapter(MainActivity.this,R.layout.contaclayout,listContact);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               name.setText("Your Choice: "+ listContact.get(position).getName());
            }
        });
        listView.setAdapter(adapter);
    }

};



