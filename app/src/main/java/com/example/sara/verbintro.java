package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class verbintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbintro);
    }
    public void defve(View view) {
        Intent intent=new Intent(this,defve.class);
        startActivity(intent);
    }

    public void verhel(View view) {
        Intent intent=new Intent(this,verhel.class);
        startActivity(intent);
    }

    public void verpri(View view) {
        Intent intent=new Intent(this,verpri.class);
        startActivity(intent);
    }

    public void vermo(View view) {
        Intent intent=new Intent(this,vermo.class);
        startActivity(intent);
    }

    public void vermain(View view) {
        Intent intent=new Intent(this,vermain.class);
        startActivity(intent);
    }

    public void vertest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}