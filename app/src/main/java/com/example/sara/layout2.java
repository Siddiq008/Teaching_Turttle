package com.example.sara;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class layout2 extends AppCompatActivity {
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

    }

    public void door(View view) {
        i++;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(i==1){
                    Toast.makeText(layout2.this, "Knock Two Times To Open", Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    Intent ob=new Intent(layout2.this,MainActivity3.class);
                    startActivity(ob);
                }i=0;

            }
        },250);
    }
}