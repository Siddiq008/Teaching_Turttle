package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transintro);
    }
    public void trdef(View view) {
        Intent intent=new Intent(this,transdef.class);
        startActivity(intent);
    }

    public void trsim(View view) {
        Intent intent=new Intent(this,trsim.class);
        startActivity(intent);
    }

    public void trsimc(View view) {
        Intent intent=new Intent(this,trsimc.class);
        startActivity(intent);
    }

    public void trcoms(View view) {
        Intent intent=new Intent(this,trcoms.class);
        startActivity(intent);
    }

    public void trcomc(View view) {
        Intent intent=new Intent(this,trcomc.class);
        startActivity(intent);
    }

    public void trcomsi(View view) {
        Intent intent=new Intent(this,trcomsi.class);
        startActivity(intent);
    }

    public void trcomco(View view) {
        Intent intent=new Intent(this,trcomco.class);
        startActivity(intent);
    }

    public void trantest(View view) {
        Intent intent=new Intent(this,verbtest.class);
        startActivity(intent);
    }
}