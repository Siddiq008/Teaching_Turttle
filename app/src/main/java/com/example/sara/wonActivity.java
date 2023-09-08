package com.example.sara;


import static android.content.ContentValues.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class wonActivity extends AppCompatActivity {
    FirebaseFirestore fstore;
    FirebaseAuth fAuth;
    CircularProgressBar circularProgressBar;
    TextView resultText,texttime,comment,globtime;
    int correct,wrong;
    String userID;
    int prevt=0;
    int prev=0;
    int crt;
    String type;
    long time;
    Tag sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_won);
        fstore=FirebaseFirestore.getInstance();
        fAuth=FirebaseAuth.getInstance();
        correct=getIntent().getIntExtra("correct",0);
        wrong=getIntent().getIntExtra("wrong",0);
        time=getIntent().getLongExtra("time",0);
        prev=getIntent().getIntExtra("prevs",0);
        prevt=getIntent().getIntExtra("prevt",0);
        type=getIntent().getStringExtra("Type");
        userID=fAuth.getCurrentUser().getUid();
        switch(type) {
            case "POS":
            DocumentReference documentReference = fstore.collection("scores").document(userID);
            Map<String, Object> Score = new HashMap<>();
            crt = correct;
            Score.put("Scores", prev + crt);
            Score.put("Times", prevt + 1);
            documentReference.set(Score).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void unused) {
                    Log.d("TAG", "Scores uploaded into databse");
                }
            });
            break;
            case "Idiom":
                DocumentReference documentReferenc = fstore.collection("scoresi").document(userID);
                Map<String, Object> Scor = new HashMap<>();
                crt = correct;
                Scor.put("Scores", prev + crt);
                Scor.put("Times", prevt + 1);
                documentReferenc.set(Scor).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;
            case "Mod":
                DocumentReference documentReferen = fstore.collection("scoresM").document(userID);
                Map<String, Object> Sco = new HashMap<>();
                crt = correct;
                Sco.put("Scores", prev + crt);
                Sco.put("Times", prevt + 1);
                documentReferen.set(Sco).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;
            case "IF":
                DocumentReference documentRefern = fstore.collection("scoresIF").document(userID);
                Map<String, Object> Sc = new HashMap<>();
                crt = correct;
                Sc.put("Scores", prev + crt);
                Sc.put("Times", prevt + 1);
                documentRefern.set(Sc).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;
            case "Tense":
                DocumentReference documentRefer = fstore.collection("scoresT").document(userID);
                Map<String, Object> ScT = new HashMap<>();
                crt = correct;
                ScT.put("Scores", prev + crt);
                ScT.put("Times", prevt + 1);
                documentRefer.set(ScT).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;
            case "Vocies":
                DocumentReference documentRefe = fstore.collection("scoresV").document(userID);
                Map<String, Object> ScV = new HashMap<>();
                crt = correct;
                ScV.put("Scores", prev + crt);
                ScV.put("Times", prevt + 1);
                documentRefe.set(ScV).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;
            case "TOS":
                DocumentReference documentRef = fstore.collection("scoresTOS").document(userID);
                Map<String, Object> ScTOS = new HashMap<>();
                crt = correct;
                ScTOS.put("Scores", prev + crt);
                ScTOS.put("Times", prevt + 1);
                documentRef.set(ScTOS).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG", "Scores uploaded into databse");
                    }
                });
                break;



        }
        circularProgressBar = findViewById(R.id.circularProgressBar2);
        resultText = findViewById(R.id.resultText);
        texttime = findViewById(R.id.time);
        comment = findViewById(R.id.comment);
        globtime = findViewById(R.id.globtime);

        long minutes = (time / 1000)  / 60;
        int seconds = (int)((time / 1000) % 60);
        texttime.setText(""+minutes+":"+seconds+" Minutes");

        circularProgressBar.setProgress(correct);
        resultText.setText(correct+"/10");

        if(correct==10){
            comment.setText(" Outstanding ");
        }else if(correct>=7){
            comment.setText(" Excellent ");
        }else if(correct>=4){
            comment.setText(" Bettter ");
        }else{
            comment.setText(" Study Deeply ");
        }
        globtime.setText( DateFormat.getDateTimeInstance()
                .format(new Date()));

    }
}