package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class idomsintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idomsintro);
    }
    public void ididef(View view) {
        Intent intent=new Intent(this,ididef.class);
        startActivity(intent);
    }

    public void idimp(View view) {
        Intent intent=new Intent(this,idimp.class);
        startActivity(intent);
    }

    public void iditest(View view) {
        Intent intent=new Intent(this,idiomtest.class);
        startActivity(intent);
    }
}