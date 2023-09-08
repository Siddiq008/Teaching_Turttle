package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pronintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronintro);
    }
    public void prodef(View view) {
        Intent intent=new Intent(this,prodef.class);
        startActivity(intent);
    }

    public void proper(View view) {
        Intent intent=new Intent(this,proper.class);
        startActivity(intent);
    }

    public void proant(View view) {
        Intent intent=new Intent(this,proant.class);
        startActivity(intent);
    }

    public void prorel(View view) {
        Intent intent=new Intent(this,prorel.class);
        startActivity(intent);
    }

    public void prodem(View view) {
        Intent intent=new Intent(this,prodem.class);
        startActivity(intent);
    }

    public void proind(View view) {
        Intent intent=new Intent(this,proind.class);
        startActivity(intent);
    }

    public void proref(View view) {
        Intent intent=new Intent(this,proref.class);
        startActivity(intent);
    }

    public void proint(View view) {
        Intent intent=new Intent(this,proint.class);
        startActivity(intent);
    }

    public void propos(View view) {
        Intent intent=new Intent(this,propos.class);
        startActivity(intent);
    }

    public void prointe(View view) {
        Intent intent=new Intent(this,prointe.class);
        startActivity(intent);
    }

    public void prorec(View view) {
        Intent intent=new Intent(this,prorec.class);
        startActivity(intent);
    }

    public void prodis(View view) {
        Intent intent=new Intent(this,prodis.class);
        startActivity(intent);
    }

    public void protest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}