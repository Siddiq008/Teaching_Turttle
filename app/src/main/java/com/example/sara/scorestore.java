package com.example.sara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class scorestore extends AppCompatActivity {
    FirebaseFirestore fstore;
    FirebaseAuth fAuth;
    String userID;
    int prevt=0;
    int correct,wrong;
    int prev=0;
    long time;
    String type="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scorestore);
        fstore=FirebaseFirestore.getInstance();
        fAuth=FirebaseAuth.getInstance();
        correct=getIntent().getIntExtra("correct",0);
        wrong=getIntent().getIntExtra("wrong",0);
        time=getIntent().getLongExtra("time",0);
        type=getIntent().getStringExtra("Type");
        userID=fAuth.getCurrentUser().getUid();
        switch (type){
            case "POS":
        DocumentReference dcumentReference=fstore.collection("scores").document(userID);
        dcumentReference.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                prev= Math.toIntExact(value.getLong("Scores"));
                prevt= Math.toIntExact(value.getLong("Times"));

            }

        });
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(scorestore.this,wonActivity.class);
                intent.putExtra("prevs",prev);
                intent.putExtra("prevt",prevt);
                intent.putExtra("correct", correct);
                intent.putExtra("Type",type);
                intent.putExtra("wrong" , wrong);
                intent.putExtra("time",time);
                startActivity(intent);
                finish();
            }
        },1000);
        break;
            case "Idiom":
                DocumentReference dcumentReferenc=fstore.collection("scoresi").document(userID);
                dcumentReferenc.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));

                    }

                });
                Handler handle=new Handler();
                handle.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("correct", correct);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("Type",type);
                        intent.putExtra("time",time);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;
            case "Mod":
                DocumentReference dcumentReferen=fstore.collection("scoresM").document(userID);
                dcumentReferen.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));

                    }

                });
                Handler handl=new Handler();
                handl.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("correct", correct);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("time",time);
                        intent.putExtra("Type",type);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;
            case "IF":
                DocumentReference dcumentRefere=fstore.collection("scoresIF").document(userID);
                dcumentRefere.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));

                    }

                });
                Handler hand=new Handler();
                hand.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("correct", correct);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("Type",type);
                        intent.putExtra("time",time);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;
            case "Tense":
                DocumentReference dcumentRefer=fstore.collection("scoresT").document(userID);
                dcumentRefer.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));

                    }

                });
                Handler han=new Handler();
                han.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("Type",type);
                        intent.putExtra("correct", correct);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("time",time);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;
            case "Vocies":
                DocumentReference dcumentRefe=fstore.collection("scoresV").document(userID);
                dcumentRefe.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));

                    }

                });
                Handler ha=new Handler();
                ha.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("Type",type);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("correct", correct);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("time",time);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;
            case "TOS":
                DocumentReference dcumentRef=fstore.collection("scoresTOS").document(userID);
                dcumentRef.addSnapshotListener(scorestore.this, new EventListener<DocumentSnapshot>() {
                    @Override
                    public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                        prev= Math.toIntExact(value.getLong("Scores"));
                        prevt= Math.toIntExact(value.getLong("Times"));
                    }

                });
                Handler h=new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(scorestore.this,wonActivity.class);
                        intent.putExtra("prevs",prev);
                        intent.putExtra("prevt",prevt);
                        intent.putExtra("correct", correct);
                        intent.putExtra("Type",type);
                        intent.putExtra("wrong" , wrong);
                        intent.putExtra("time",time);
                        startActivity(intent);
                        finish();
                    }
                },1000);
                break;



    }
}}