package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class preposintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preposintro);
    }
    public void prepdef(View view) {
        Intent intent=new Intent(this,prepdef.class);
        startActivity(intent);
    }

    public void preptyp(View view) {
        Intent intent=new Intent(this,preptyp.class);
        startActivity(intent);
    }

    public void prepexp(View view) {
        Intent intent=new Intent(this,prepexp.class);
        startActivity(intent);
    }

    public void prepend(View view) {
        Intent intent=new Intent(this,prepend.class);
        startActivity(intent);
    }

    public void prepunn(View view) {
        Intent intent=new Intent(this,prepunn.class);
        startActivity(intent);
    }

    public void preptest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}