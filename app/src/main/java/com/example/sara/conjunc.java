package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class conjunc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conjunc);
    }
    public void condef(View view) {
        Intent intent=new Intent(this,condef.class);
        startActivity(intent);
    }

    public void concoo(View view) {
        Intent intent=new Intent(this,concoo.class);
        startActivity(intent);
    }

    public void concor(View view) {
        Intent intent=new Intent(this,concor.class);
        startActivity(intent);
    }

    public void consub(View view) {
        Intent intent=new Intent(this,consub.class);
        startActivity(intent);
    }

    public void consta(View view) {
        Intent intent=new Intent(this,consta.class);
        startActivity(intent);
    }

    public void conlis(View view) {
        Intent intent=new Intent(this,conlis.class);
        startActivity(intent);
    }

    public void contest(View view) {
        Intent intent=new Intent(this,TestLay1.class);
        startActivity(intent);
    }
}