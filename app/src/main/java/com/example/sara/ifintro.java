package com.example.sara;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ifintro extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ifintro);
    }
    public void defi(View view) {
        Intent intent=new Intent(this,ifdef.class);
        startActivity(intent);
    }

    public void form(View view) {
        Intent intent=new Intent(this,ifform.class);
        startActivity(intent);
    }

    public void exp1(View view) {
        Intent intent=new Intent(this,ifbeg.class);
        startActivity(intent);
    }

    public void exp2(View view) {
        Intent intent=new Intent(this,ifend.class);
        startActivity(intent);
    }

    public void exp3(View view) {
        Intent intent=new Intent(this,ifaff.class);
        startActivity(intent);
    }

    public void exc(View view) {
        Intent intent=new Intent(this,ifexc.class);
        startActivity(intent);
    }

    public void iftest(View view) {
        Intent intent=new Intent(this,ifctest.class);
        startActivity(intent);
    }
}