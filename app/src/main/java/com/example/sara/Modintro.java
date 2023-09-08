package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Modintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modintro);
    }
    public void auxdef(View view) {
        Intent intent=new Intent(this,auxdef.class);
        startActivity(intent);
    }

    public void auxmod(View view) {
        Intent intent=new Intent(this,auxmod.class);
        startActivity(intent);
    }

    public void auxsem(View view) {
        Intent intent=new Intent(this,auxsem.class);
        startActivity(intent);
    }

    public void auxtest(View view){
        Intent intent=new Intent(this,modtest.class);
        startActivity(intent);
    }
}