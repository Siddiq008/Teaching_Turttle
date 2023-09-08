package com.example.sara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
public class TestLay1 extends AppCompatActivity {

    public static ArrayList<Modelclass> list;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_lay1);
        list=new ArrayList<>();
        databaseReference= FirebaseDatabase.getInstance().getReference("Question");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
                    Modelclass modelclass=dataSnapshot.getValue(Modelclass.class);
                    list.add(modelclass);
                }
                startActivity(new Intent(TestLay1.this,DashboardActivity.class));
                finish();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}