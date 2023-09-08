package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nounintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nounintro);
    }
    public void defn(View view) {
        Intent intent=new Intent(this,defn.class);
        startActivity(intent);
    }

    public void prop(View view) {
        Intent intent=new Intent(this,prop.class);
        startActivity(intent);
    }

    public void con(View view) {
        Intent intent=new Intent(this,con.class);
        startActivity(intent);
    }

    public void coll(View view) {
        Intent intent=new Intent(this,coll.class);
        startActivity(intent);
    }

    public void count(View view) {
        Intent intent=new Intent(this,count.class);
        startActivity(intent);
    }

    public void other(View view) {
        Intent intent=new Intent(this,other.class);
        startActivity(intent);
    }

    public void nountest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}