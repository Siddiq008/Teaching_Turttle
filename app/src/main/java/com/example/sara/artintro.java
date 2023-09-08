package com.example.sara;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class artintro extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artintro);
    }
    public void def(View view) {
        startActivity(new Intent(artintro.this,artdef.class));
    }

    public void types(View view) {
        Intent intent=new Intent(this,arttype.class);
        startActivity(intent);
    }

    public void exp(View view) {
        Intent intent=new Intent(this,artexp.class);
        startActivity(intent);
    }

    public void adj(View view) {
        Intent intent=new Intent(this,artadj.class);
        startActivity(intent);
    }

    public void ind(View view) {
        Intent intent=new Intent(this,artind.class);
        startActivity(intent);
    }

    public void art(View view) {
        Intent intent=new Intent(this,artpro.class);
        startActivity(intent);
    }

    public void test(View view) {

        startActivity(new Intent(this,TestLay1.class));
    }
}