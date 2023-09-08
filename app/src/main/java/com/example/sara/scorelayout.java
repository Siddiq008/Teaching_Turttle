package com.example.sara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

public class scorelayout extends AppCompatActivity {
    FirebaseAuth fAuth;
    FirebaseFirestore fstore;
    String userID;
    int s, p;
    TextView sc, sc1,sc2,sc3,sc4,sc5,sc6;
    double per;
    String pw;
    int count=0,counti=0,countf=0,countM=0,countT=0,countV=0,countOS=0;
    ProgressBar pbpos,pbID,pbMOD,pbIF,pbTEN,pbVOC,pbTOS;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scorelayout);
        sc = findViewById(R.id.sc);
        sc1 = findViewById(R.id.sc4);
        sc2 = findViewById(R.id.sc5);
        sc3 = findViewById(R.id.sc6);
        sc4 = findViewById(R.id.sc7);
        sc5 = findViewById(R.id.sc8);
        sc6 = findViewById(R.id.sc2);
        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        userID = fAuth.getCurrentUser().getUid();

        final DecimalFormat df = new DecimalFormat("0.00");
        DocumentReference documentReference = fstore.collection("scores").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc.setText(pw + "%");
                int pr=(int) Math.round(per*100);
                prog(pr);
            }
        });
        DocumentReference dcumentReferen = fstore.collection("scoresM").document(userID);
        dcumentReferen.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                int pr=(int) Math.round(per*100);
                progM(pr);
            }
        });
        DocumentReference dcumentRefere = fstore.collection("scoresIF").document(userID);
        dcumentRefere.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc2.setText(pw + "%");
                int prf=(int) Math.round(per*100);
                progIF(prf);
            }
        });
        DocumentReference dcumentRefer = fstore.collection("scoresT").document(userID);
        dcumentRefer.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc3.setText(pw + "%");
                int pr=(int) Math.round(per*100);
                progT(pr);
            }
        });
        DocumentReference dcumentRefe = fstore.collection("scoresV").document(userID);
        dcumentRefe.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc4.setText(pw + "%");
                int pr=(int) Math.round(per*100);
                progv(pr);
            }
        });
        DocumentReference dcumentRef = fstore.collection("scoresTOS").document(userID);
        dcumentRef.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc5.setText(pw + "%");
                int pr=(int) Math.round(per*100);
                progTOS(pr);
            }
        });
        DocumentReference dcumentReferenc = fstore.collection("scoresi").document(userID);
        dcumentReferenc.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                s = Math.toIntExact(value.getLong("Scores"));
                p = Math.toIntExact(value.getLong("Times"));
                per = (double) s / (p * 10);
                pw = df.format(per * 100);
                sc6.setText(pw + "%");
                sc1.setText(pw + "%");
                int pri=(int) Math.round(per*100);
                progID(pri);
            }
        });
    }
    public void prog(int pr){
        pbpos=(ProgressBar) findViewById(R.id.pbpos);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbpos.setProgress(count);
                if(count==pr)
                    t.cancel();
                count++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progID(int pr){
        pbID=(ProgressBar) findViewById(R.id.pbID);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbID.setProgress(counti);
                if(counti==pr){
                    t.cancel();
                   }
                counti++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progIF(int pr){
        pbIF=(ProgressBar) findViewById(R.id.pbIF);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbIF.setProgress(countf);
                if(countf==pr)
                    t.cancel();
                countf++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progM(int pr){
        pbMOD=(ProgressBar) findViewById(R.id.pbMOD);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbMOD.setProgress(countM);
                if(countM==pr)
                    t.cancel();
                countM++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progT(int pr){
        pbTEN=(ProgressBar) findViewById(R.id.pbTEN);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbTEN.setProgress(countT);
                if(countT==pr)
                    t.cancel();
                countT++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progv(int pr){
        pbVOC=(ProgressBar) findViewById(R.id.pbVOC);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbVOC.setProgress(countV);
                if(countV==pr)
                    t.cancel();
                countV++;
            }
        };
        t.schedule(tt,0,40);
    }
    public void progTOS(int pr){
        pbTOS=(ProgressBar) findViewById(R.id.pbTOS);
        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                pbTOS.setProgress(countOS);
                if(countOS==pr)
                    t.cancel();
                countOS++;
            }
        };
        t.schedule(tt,0,40);
    }
    @Override
    public void onBackPressed() {
        count=0;
        counti=0;
        countf=0;
        countM=0;
        countT=0;
        countV=0;
        countOS=0;
        progTOS(0);
        prog(0);
        progv(0);
        progT(0);
        progID(0);
        progIF(0);
        super.onBackPressed();
    }
}