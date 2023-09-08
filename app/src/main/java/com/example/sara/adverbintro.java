package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adverbintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverbintro);
    }
    public void advdef(View view) {
        Intent intent=new Intent(this,advdef.class);
        startActivity(intent);
    }

    public void advver(View view) {
        Intent intent=new Intent(this,advver.class);
        startActivity(intent);
    }

    public void advadj(View view) {
        Intent intent=new Intent(this,advadj.class);
        startActivity(intent);
    }

    public void advadv(View view) {
        Intent intent=new Intent(this,advadv.class);
        startActivity(intent);
    }

    public void advsen(View view) {
        Intent intent=new Intent(this,advsen.class);
        startActivity(intent);
    }

    public void advdeg(View view) {
        Intent intent=new Intent(this,advdeg.class);
        startActivity(intent);
    }

    public void advpla(View view) {
        Intent intent=new Intent(this,advpla.class);
        startActivity(intent);
    }

    public void advavo(View view) {
        Intent intent=new Intent(this,advavo.class);
        startActivity(intent);
    }

    public void advent(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}