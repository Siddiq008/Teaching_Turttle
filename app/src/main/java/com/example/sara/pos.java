package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos);

    }
    public void noun(View view) {
        Intent intent=new Intent(this,nounintro.class);
        startActivity(intent);
    }

    public void art1(View view) {

        Intent intent=new Intent(this,artintro.class);
        startActivity(intent);
    }

    public void pron(View view) {
        Intent intent=new Intent(this,pronintro.class);
        startActivity(intent);
    }

    public void adje(View view) {
        Intent intent=new Intent(this,adjeintro.class);
        startActivity(intent);
    }

    public void verb(View view) {
        Intent intent=new Intent(this,verbintro.class);
        startActivity(intent);
    }

    public void adverb(View view) {
        Intent intent=new Intent(this,adverbintro.class);
        startActivity(intent);
    }

    public void prepos(View view) {
        Intent intent=new Intent(this,preposintro.class);
        startActivity(intent);
    }

    public void conjunc(View view) {
        Intent intent=new Intent(this,conjunc.class);
        startActivity(intent);
    }
}