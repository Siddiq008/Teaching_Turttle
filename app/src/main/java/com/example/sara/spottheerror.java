package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class spottheerror extends AppCompatActivity {
    public static ArrayList<spModelclass> list;
    List<spModelclass> allQuestionsList;
    spModelclass modelclass;
    public int index=0;
    int correctcount , wrongcount;
    Button button;
    int ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    TextView uans1,uans2,uans3,uans4,uans5,uans6,uans7,uans8,uans9,uans10;
    TextView qus1,qus2,qus3,qus4,qus5,qus6,qus7,qus8,qus9,qus10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spottheerror);

        list=new ArrayList<>();
        list.add(new spModelclass("i entered the room for search the documents","I entered the room to search the documents."));
        list.add(new spModelclass("one must not tell lies.He must always obey the elders","One must not tell lies.One must always obey elders."));
        list.add(new spModelclass("The Scissors is missing","The Scissors are missing."));
        list.add(new spModelclass("there is many people in the town","There are many people in the town."));
        list.add(new spModelclass("what is your name.","What is your name?"));
        list.add(new spModelclass("Its a beautiful house.","It's a beautiful house."));
        list.add(new spModelclass("I will be there in a hour.","I will be there in an hour."));
        list.add(new spModelclass("A old man met a young woman. ","An old man met a young woman. "));
        list.add(new spModelclass("He travelled around a world in a ship","He travelled around the world in a ship."));
        list.add(new spModelclass("she was one of the average student in the class","She was one of the average students of the class."));
        list.add(new spModelclass("I asked myself why should I have done so?","I asked myself why I should have done so."));
        list.add(new spModelclass("When I returned back home, I was hungry and tired.","When I returned home, I was hungry and tired."));
        list.add(new spModelclass("I has left home fairly early in life","I left home fairly early in life."));
        list.add(new spModelclass("One of my earliest memory is of eating with my mother.","One of my earliest memories is of eating with my mother."));
        list.add(new spModelclass("Then I was about eight years.","Then I was about eight years old."));



        uans1 = findViewById(R.id.uans1);
        uans2 = findViewById(R.id.uans2);
        uans3 = findViewById(R.id.uans3);
        uans4 = findViewById(R.id.uans4);
        uans5 = findViewById(R.id.uans5);
        uans6 = findViewById(R.id.uans6);
        uans7 = findViewById(R.id.uans7);
        uans8 = findViewById(R.id.uans8);
        uans9 = findViewById(R.id.uans9);
        uans10 = findViewById(R.id.uans10);

        qus1 = findViewById(R.id.qus1);
        qus2 = findViewById(R.id.qus2);
        qus3 = findViewById(R.id.qus3);
        qus4 = findViewById(R.id.qus4);
        qus5 = findViewById(R.id.qus5);
        qus6 = findViewById(R.id.qus6);
        qus7 = findViewById(R.id.qus7);
        qus8 = findViewById(R.id.qus8);
        qus9 = findViewById(R.id.qus9);
        qus10 = findViewById(R.id.qus10);



        allQuestionsList=list;
        Collections.shuffle(allQuestionsList);

        index++;
        modelclass=list.get(index);
        qus1.setText((index)+"."+modelclass.getQuestion());
        ans1 = index;

        index++;
        modelclass=list.get(index);
        qus2.setText((index)+"."+modelclass.getQuestion());
        ans2 = index;

        index++;
        modelclass=list.get(index);
        qus3.setText((index)+"."+modelclass.getQuestion());
        ans3 = index;

        index++;
        modelclass=list.get(index);
        qus4.setText((index)+"."+modelclass.getQuestion());
        ans4 = index;

        index++;
        modelclass=list.get(index);
        qus5.setText((index)+"."+modelclass.getQuestion());
        ans5 = index;

        index++;
        modelclass=list.get(index);
        qus6.setText((index)+"."+modelclass.getQuestion());
        ans6 = index;

        index++;
        modelclass=list.get(index);
        qus7.setText((index)+"."+modelclass.getQuestion());
        ans7 = index;

        index++;
        modelclass=list.get(index);
        qus8.setText((index)+"."+modelclass.getQuestion());
        ans8 = index;

        index++;
        modelclass=list.get(index);
        qus9.setText((index)+"."+modelclass.getQuestion());
        ans9 = index;

        index++;
        modelclass=list.get(index);
        qus10.setText((index)+"."+modelclass.getQuestion());
        ans10 = index;

        button = findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = ans10;
                modelclass=list.get(index);
                if((uans10.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans10.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans10.setTextColor(getResources().getColor(R.color.red));
                }


                index = ans9;
                modelclass=list.get(index);
                if((uans9.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans9.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans9.setTextColor(getResources().getColor(R.color.red));
                }


                index = ans8;
                modelclass=list.get(index);
                if((uans8.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans8.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans8.setTextColor(getResources().getColor(R.color.red));
                }

                index = ans7;
                modelclass=list.get(index);
                if((uans7.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans7.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans7.setTextColor(getResources().getColor(R.color.red));
                }

                index = ans6;
                modelclass=list.get(index);
                if((uans6.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans6.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans6.setTextColor(getResources().getColor(R.color.red));
                }


                index = ans5;
                modelclass=list.get(index);
                if((uans5.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans5.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans5.setTextColor(getResources().getColor(R.color.red));
                }


                index = ans4;
                modelclass=list.get(index);
                if((uans4.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans4.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans4.setTextColor(getResources().getColor(R.color.red));
                }
                index = ans3;
                modelclass=list.get(index);
                if((uans3.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans3.setTextColor(getResources().getColor(R.color.red));
                }else{
                    wrongcount++;
                    uans3.setTextColor(getResources().getColor(R.color.green));
                }
                index = ans2;
                modelclass=list.get(index);
                if((uans2.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans2.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans2.setTextColor(getResources().getColor(R.color.red));
                }
                index = ans1;
                modelclass=list.get(index);


                if((uans1.getText().toString().equals(modelclass.getAnswer()))){
                    correctcount++;
                    uans1.setTextColor(getResources().getColor(R.color.green));
                }else{
                    wrongcount++;
                    uans1.setTextColor(getResources().getColor(R.color.red));
                }
            }
        });



    }


}