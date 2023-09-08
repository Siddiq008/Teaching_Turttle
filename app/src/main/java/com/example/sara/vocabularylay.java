package com.example.sara;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import static com.example.sara.MainActivity2.list;

public class vocabularylay extends AppCompatActivity {

    List<vocmodelclass> allwords;
    TextView play1,play2,play3,word1,word2,word3,meaning3,meaning1,meaning2,hope;
    TextToSpeech textToSpeech ;
    int i=1;
    int index=0;
    vocmodelclass vocmodelclass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabularylay);
        vocmodelclass= list.get(index);
        play1=findViewById(R.id.play_1);
        play2=findViewById(R.id.play_2);
        play3 = findViewById(R.id.play_3);
        word1=findViewById(R.id.wrd1);
        word2 = findViewById(R.id.word_2);
        word3 = findViewById(R.id.word_3);
        meaning3=findViewById(R.id.meaning_3);
        meaning2=findViewById(R.id.meaning_2);
        meaning1=findViewById(R.id.meaning_1);
        hope=findViewById(R.id.changes);
        allwords = list ;
        Collections.shuffle(allwords);

        setAllData();

        Calendar calendar =Calendar.getInstance();
        int currentday=calendar.get(Calendar.DAY_OF_MONTH);
        SharedPreferences settings=getSharedPreferences("PREFS",0);
        int lastday=settings.getInt("day",0);
        if(lastday != currentday){
            SharedPreferences.Editor editor=settings.edit();
            editor.putInt("day",currentday);
            editor.commit();
            if(index<list.size()-1){
                index++;
                vocmodelclass= list.get(index);
                setAllData();}
            else{
                Toast.makeText(vocabularylay.this, "Limit Of WOrds Reached", Toast.LENGTH_SHORT).show();                }

        }
        hope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<list.size()-1){
                index++;
                vocmodelclass= list.get(index);
                setAllData();}
                else{
                    Toast.makeText(vocabularylay.this, "Limit Of WOrds Reached", Toast.LENGTH_SHORT).show();                }
            }
        });




        textToSpeech = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            int lang=textToSpeech.setLanguage(new Locale("en","UK"));
                            int spead=textToSpeech.setSpeechRate(1);
                        }
                    }
                });

    }

    public void play_1(View view) {

        String s=word1.getText().toString();
        int speech=textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }

    public void play_2(View view) {
        String s=word2.getText().toString();
        int speech=textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }

    public void play_3(View view) {
        String s=word3.getText().toString();
        int speech=textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);
    }
    private void setAllData() {
        String wrd1= this.vocmodelclass.getWord1();
        word1.setText(wrd1);
        meaning1.setText(vocmodelclass.getMeaning1());
        word2.setText(vocmodelclass.getWord2());
        meaning2.setText(vocmodelclass.getMeaning2());
        word3.setText(vocmodelclass.getWord3());
        meaning3.setText(vocmodelclass.getMeaning3());
    }

}