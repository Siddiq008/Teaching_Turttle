package com.example.sara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;

import java.util.ArrayList;

public class favoriteswords extends AppCompatActivity {
    DBhelper db;
    ArrayList<String> wordsary =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoriteswords);

        List<String> list= new ArrayList<>();

        db= new DBhelper(this);
        setContentView(R.layout.activity_favoriteswords);
        Cursor res= db.getdata();
        if(res.getCount()==0){
            Toast.makeText(favoriteswords.this,"NO DATA EXISTS",Toast.LENGTH_SHORT).show();

        }
        StringBuffer buffer= new StringBuffer();
        int i=0;
        while(res.moveToNext()){
            list.add(i,"WORD:"+res.getString(0)+"\n"+"MEAN:"+res.getString(1));
            i++;

        }
        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        ListView fav=findViewById(R.id.favlist);
        fav.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();

        fav.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                int   indexVal=position;
                String str= list.get(indexVal);
                str=str.substring(5,str.indexOf("MEAN:")).trim();

                db.deletedata(str);
                list.remove(indexVal);
                arrayAdapter.notifyDataSetChanged();
                return false;
            }
        });




    }
 }
