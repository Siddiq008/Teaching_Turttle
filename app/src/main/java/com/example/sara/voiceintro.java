package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class voiceintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voiceintro);
    }
    public void defv(View view) {
        Intent intent=new Intent(this,vocdef.class);
        startActivity(intent);
    }

    public void typev(View view) {
        Intent intent=new Intent(this,typev.class);
        startActivity(intent);
    }

    public void rulev(View view) {
        Intent intent=new Intent(this,rulev.class);
        startActivity(intent);
    }

    public void actopa(View view) {
        Intent intent=new Intent(this,actopa.class);
        startActivity(intent);
    }

    public void patoac(View view) {
        Intent intent=new Intent(this,patoac.class);
        startActivity(intent);
    }

    public void voitest(View view) {
        Intent intent=new Intent(this,voicetest.class);
        startActivity(intent);
    }
}