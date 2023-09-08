package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tenseintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenseintro);
    }
    public void tendef(View view) {
        Intent intent=new Intent(this,tendef.class);
        startActivity(intent);

    }

    public void tensim(View view) {
        Intent intent=new Intent(this,tensim.class);
        startActivity(intent);
    }

    public void tenpro(View view) {
        Intent intent=new Intent(this,tenpro.class);
        startActivity(intent);
    }

    public void tenper(View view) {
        Intent intent=new Intent(this,tenper.class);
        startActivity(intent);
    }

    public void tenperpro(View view) {
        Intent intent=new Intent(this,tenperpro.class);
        startActivity(intent);
    }

    public void tensetest(View view) {
        Intent intent=new Intent(this,tentest.class);
        startActivity(intent);
    }
}