package com.example.sara;

import static com.example.sara.TestLay1.list;


import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Collections;
import java.util.List;
public class DashboardActivity extends AppCompatActivity {

    List<Modelclass> allQuestionsList;
    Modelclass modelclass;
    public int index=0;
    TextView card_question, optiona, optionb, optionc, optiond;
    CardView cardOA,cardOB,cardOC,cardOD,qus;
    int correctCount=0;
    int wrongCount=0;
    Button clear;
    CardView nextBtn , submit;
    Dialog dialog;
    public Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Hooks();
        allQuestionsList=list;
        Collections.shuffle(allQuestionsList);
        modelclass=list.get(index);
        setAllData();
        resetColor();
        chronometer.start();

    }
    //ID views and Variables
    private void Hooks() {
        card_question=findViewById(R.id.card_question);
        optiona=findViewById(R.id.card_optiona);
        optionb=findViewById(R.id.card_optionb);
        optionc=findViewById(R.id.card_optionc);
        optiond=findViewById(R.id.card_optiond);

        cardOA=findViewById(R.id.cardA);
        cardOB=findViewById(R.id.cardB);
        cardOC=findViewById(R.id.cardC);
        cardOD=findViewById(R.id.cardD);

        nextBtn= findViewById(R.id.nextBtn);
        submit= findViewById(R.id.sbtBtn);
        qus= findViewById(R.id.qus);
        chronometer = findViewById(R.id.chronometer);
        clear = findViewById(R.id.clr_sec);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();

            }
        });
    }


    //seting next question
    private void setAllData() {
        enableButton();
        nextBtn.setClickable(false);
        clear.setClickable(true);
        card_question.setText(index+1+". "+modelclass.getQuestion());
        optiona.setText(modelclass.getoA());
        optionb.setText(modelclass.getoB());
        optionc.setText(modelclass.getoC());
        optiond.setText(modelclass.getoD());
    }
    //Set as clickable
    public void enableButton(){
        cardOA.setClickable(true);
        cardOB.setClickable(true);
        cardOC.setClickable(true);
        cardOD.setClickable(true);
    }
    //Set as not clickable
    public void disableButton(){
        clear.setClickable(false);
        cardOA.setClickable(false);
        cardOB.setClickable(false);
        cardOC.setClickable(false);
        cardOD.setClickable(false);
    }
    //removing of green and red
    public void resetColor(){
        clear.setClickable(true);
        cardOA.setBackgroundColor(getResources().getColor(R.color.sand));
        cardOB.setBackgroundColor(getResources().getColor(R.color.sand));
        cardOC.setBackgroundColor(getResources().getColor(R.color.sand));
        cardOD.setBackgroundColor(getResources().getColor(R.color.sand));
    }
    public void OptionAClick(View view) {
        resetColor();
        cardOA.setBackgroundColor(getResources().getColor(R.color.gray));
        nextBtn.setClickable(true);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
                if(modelclass.getoA().equals(modelclass.getAns())){
                    //correct
                    cardOA.setBackgroundColor(getResources().getColor(R.color.green));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctCount++;
                            if(index < 10){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
                else{
                    //wrong
                    cardOA.setBackgroundColor(getResources().getColor(R.color.red));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            wrongCount++;
                            if(index < 10 ){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
            }
        });
    }

    public void OptionBClick(View view) {
        resetColor();
        cardOB.setBackgroundColor(getResources().getColor(R.color.gray));
        nextBtn.setClickable(true);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
                if(modelclass.getoB().equals(modelclass.getAns())){
                    //correct
                    cardOB.setBackgroundColor(getResources().getColor(R.color.green));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            correctCount++;
                            if(index < 10){
                                set_set();

                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
                else{

                    //wrong
                    cardOB.setBackgroundColor(getResources().getColor(R.color.red));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            wrongCount++;
                            if(index < 10 ){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
            }
        });
    }
    public void OptionCClick(View view) {
        resetColor();
        cardOC.setBackgroundColor(getResources().getColor(R.color.gray));
        nextBtn.setClickable(true);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
                if(modelclass.getoC().equals(modelclass.getAns())){
                    //correct
                    cardOC.setBackgroundColor(getResources().getColor(R.color.green));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctCount++;
                            if(index < 10){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
                else{
                    //wrong
                    cardOC.setBackgroundColor(getResources().getColor(R.color.red));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            wrongCount++;
                            if(index < 10 ){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
            }
        });
    }
    public void OptionDClick(View view) {
        resetColor();
        cardOD.setBackgroundColor(getResources().getColor(R.color.gray));
        nextBtn.setClickable(true);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disableButton();
                if(modelclass.getoD().equals(modelclass.getAns())){
                    //correct
                    cardOD.setBackgroundColor(getResources().getColor(R.color.green));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            correctCount++;
                            if(index < 10){
                                set_set();

                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
                else{
                    //wrong
                    cardOD.setBackgroundColor(getResources().getColor(R.color.red));
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            wrongCount++;
                            if(index < 10 ){
                                set_set();
                            }else{
                                toast();
                            }
                        }
                    },1500);
                }
            }
        });
    }
    public void set_set(){
        index++;
        modelclass = list.get(index);
        setAllData();
        resetColor();
    }
    public void clear(View view) {
        nextBtn.setClickable(false);
        resetColor();
    }
    public void submit() {
        dialog = new Dialog(DashboardActivity.this);
        dialog.setContentView(R.layout.custome_dialog);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        Button okey = dialog.findViewById(R.id.btn_okey);
        Button submit = dialog.findViewById(R.id.btn_submit);
        dialog.show();
        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,scorestore.class);
                intent.putExtra("correct", correctCount);
                intent.putExtra("wrong" , wrongCount);
                intent.putExtra("Type","POS");
                chronometer.stop();
                long time  = SystemClock.elapsedRealtime() - chronometer.getBase();
                intent.putExtra("time",time);
                dialog.dismiss();
                startActivity(intent);
                finish();
            }
        });
    }
    private void toast() {
        Toast toast = Toast.makeText(
                getApplicationContext(),
                "Simple text",
                Toast.LENGTH_SHORT
        );
        toast.setGravity(Gravity.TOP,0,10);
        toast.setText("You Readout or Answerd all the questions");
        toast.show();
    }
    public void quit(View view) {
        dialog = new Dialog(DashboardActivity.this);
        dialog.setContentView(R.layout.quit_dialogue);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
        dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        dialog.show();
        Button submit = dialog.findViewById(R.id.submit);
        Button quit = dialog.findViewById(R.id.quit);
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,pos.class);
                Toast toast = Toast.makeText(DashboardActivity.this, "You QUIT the text", Toast.LENGTH_SHORT);
                toast.setMargin(50, 50);
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, scorestore.class);
                intent.putExtra("correct", correctCount);
                intent.putExtra("wrong", wrongCount);
                intent.putExtra("Type","POS");
                chronometer.stop();
                long time = SystemClock.elapsedRealtime() - chronometer.getBase();
                intent.putExtra("time", time);
                startActivity(intent);
                finish();
            }
        });
    }
}