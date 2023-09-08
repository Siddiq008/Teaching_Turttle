package com.example.sara;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;


public class vocsplash extends AppCompatActivity {


    ProgressBar progressBar;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocsplash);
        progressBar=findViewById(R.id.progressbar);
        progressBar.setVisibility(view.VISIBLE);
        setContentView(R.layout.activity_vocsplash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(vocsplash.this,vocabularylay.class));
                finish();
            }
        },1500);


    }
}