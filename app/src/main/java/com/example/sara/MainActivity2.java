package com.example.sara;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    FirebaseUser currentuser;
    public static ArrayList<vocmodelclass> list;
    DatabaseReference databaseReference;
    AnimationDrawable nimo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
      ImageView imageView=(ImageView) findViewById(R.id.nimo);
      imageView.setBackgroundResource(R.drawable.firstanimie);
      nimo=(AnimationDrawable) imageView.getBackground();
        toolbar=findViewById(R.id.mytoolbar);
        fAuth=FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();
        currentuser=fAuth.getCurrentUser();
        drawerLayout=findViewById(R.id.drawer_Layout);
        navigationView=findViewById(R.id.nav_view);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        userup();
        list=new ArrayList<>();
        TextView voc;
        voc=findViewById(R.id.voc);
        voc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,vocsplash.class));
            }
        });
        list=new ArrayList<>();
        databaseReference= FirebaseDatabase.getInstance().getReference("Vocabulary");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot:snapshot.getChildren()){
                    vocmodelclass vocmodelclass=dataSnapshot.getValue(vocmodelclass.class);
                    list.add(vocmodelclass);

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        nimo.start();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView imageView=(ImageView) findViewById(R.id.nimo);
                imageView.setVisibility(View.GONE);

            }
        },3750);

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();


        }
    }

    public void story(View view) {

        startActivity(new Intent(MainActivity2.this,layout2.class));
    }

    public void gram(View view) {
        startActivity(new Intent(MainActivity2.this,GrammerLayout.class));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.nav_home:
                break;
            case R.id.nav_logout:
                startActivity(new Intent(this,loginpage.class));
                fAuth.signOut();
                finish();
                break;
            case R.id.nav_score:
                startActivity( new Intent(MainActivity2.this,scorelayout.class));
                break;
            case R.id.nav_feedback:
                startActivity(new Intent(this,Feedback.class));
                break;



        }
        return true;
    }
    public void userup(){

        NavigationView navigationView = findViewById(R.id.nav_view);
        View headerview = navigationView.getHeaderView(0);
        TextView navuser = headerview.findViewById(R.id.usedid);
        ImageView userimg=headerview.findViewById(R.id.imageView);
        FirebaseUser fuser=fAuth.getCurrentUser();
        String userid=fAuth.getCurrentUser().getUid();
        DocumentReference documentReference=fStore.collection("users").document(userid);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                navuser.setText(value.getString("fname"));
            }
        });

    }
}