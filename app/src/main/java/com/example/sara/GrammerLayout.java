package com.example.sara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GrammerLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammer_layout);
    }


    public void pos(View view) {
        startActivity(new Intent(this,pos.class));
    }

    public void idoms(View view) {
        startActivity(new Intent(this,idomsintro.class));
    }

    public void mod(View view) {
        startActivity(new Intent(this,Modintro.class));
    }

    public void tense(View view) {
        startActivity(new Intent(this,tenseintro.class));
    }

    public void voice(View view) {
        startActivity(new Intent(this,voiceintro.class));
    }

    public void iff(View view) {
        startActivity(new Intent(this,ifintro.class));
    }

    public void trs(View view) {
        startActivity(new Intent(this,transintro.class));
    }
}