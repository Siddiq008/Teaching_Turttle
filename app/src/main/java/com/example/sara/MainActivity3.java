package com.example.sara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void rom(View view) {
        Intent ob=new Intent(MainActivity3.this,romancelay_1.class);
        startActivity(ob);
    }

    public void mor(View view) {
        Intent ob=new Intent(MainActivity3.this,morallay_1.class);
        startActivity(ob);
    }

    public void crime(View view) {
        Intent ob=new Intent(MainActivity3.this, horrorlay_1.class);
        startActivity(ob);
    }



    public void adven(View view) {
        Intent ob=new Intent(MainActivity3.this,advenlay_1.class);
        startActivity(ob);
    }

    public void act(View view) {
        Intent ob= new Intent(MainActivity3.this,actionlay_1.class);
        startActivity(ob);
    }

    public void sci(View view) {
        Intent ob=new Intent(MainActivity3.this,Scificlay_1.class);
        startActivity(ob);
    }

    public void his(View view) {
        Intent ob =new Intent(MainActivity3.this,histlay_1.class);
        startActivity(ob);
    }
}