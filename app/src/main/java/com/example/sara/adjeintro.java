package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adjeintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adjeintro);
    }
    public void defadj(View view) {
        Intent intent=new Intent(this,defadj.class);
        startActivity(intent);
    }

    public void adjmo(View view) {
        Intent intent=new Intent(this,adjmo.class);
        startActivity(intent);
    }

    public void adjuse(View view) {
        Intent intent=new Intent(this,adjuse.class);
        startActivity(intent);
    }

    public void adjdeg(View view) {
        Intent intent=new Intent(this,adjdeg.class);
        startActivity(intent);
    }

    public void adjcoo(View view) {
        Intent intent=new Intent(this,adjcoo.class);
        startActivity(intent);
    }

    public void adjadj(View view) {
        Intent intent=new Intent(this,adjadj.class);
        startActivity(intent);
    }

    public void adjnoun(View view) {
        Intent intent=new Intent(this,adjnoun.class);
        startActivity(intent);
    }

    public void adjtest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}