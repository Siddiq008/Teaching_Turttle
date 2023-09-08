package com.example.sara;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText mfullname,mEmail,mPassword;
    TextView loginbtn,regbtn;
    FirebaseAuth fAuth;
    ProgressBar progressBar;
    FirebaseFirestore fstore;
    int score=0,time=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mfullname=findViewById(R.id.name);
        mEmail=findViewById(R.id.mailid);
        mPassword=findViewById(R.id.password);
        regbtn=findViewById(R.id.register);
        loginbtn=findViewById(R.id.login);
        progressBar=findViewById(R.id.progressbar);
        fAuth=FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=mEmail.getText().toString().trim();
                String password=mPassword.getText().toString().trim();
                String fullname=mfullname.getText().toString();
                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is Required");
                    return;
                }
                progressBar.setVisibility(view.VISIBLE);
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser fuser=fAuth.getCurrentUser();
                            fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Toast.makeText(MainActivity.this, "Verification Email has been sent", Toast.LENGTH_SHORT).show();
                                    fAuth.signOut();
                                    finish();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG,"Email Not sent"+e.getMessage());
                                }
                            });
                            Toast.makeText(MainActivity.this, "User Created", Toast.LENGTH_SHORT).show();
                            String userId = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference=fstore.collection("users").document(userId);
                            Map<String,Object> user= new HashMap<>();
                            user.put("fname",fullname);
                            user.put("fmail",email);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Log.d(TAG,"Onsuccess:user profile is created"+userId);

                                }
                            });
                            //firestore
                            DocumentReference documentReferenc = fstore.collection("scores").document(userId);
                            Map<String, Object> Score = new HashMap<>();
                            Score.put("Scores",score);
                            Score.put("Times",time);
                            documentReferenc.set(Score).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            DocumentReference documentReferen = fstore.collection("scoresi").document(userId);
                            Map<String, Object> Scor = new HashMap<>();
                            Scor.put("Scores",score);
                            Scor.put("Times",time);
                            documentReferen.set(Scor).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            DocumentReference documentRefere = fstore.collection("scoresM").document(userId);
                            Map<String, Object> Sco = new HashMap<>();
                            Sco.put("Scores",score);
                            Sco.put("Times",time);
                            documentRefere.set(Sco).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            DocumentReference documentRefer = fstore.collection("scoresIF").document(userId);
                            Map<String, Object> Sc = new HashMap<>();
                            Sc.put("Scores",score);
                            Sc.put("Times", time);
                            documentRefer.set(Sc).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            DocumentReference documentRefe = fstore.collection("scoresT").document(userId);
                            Map<String, Object> ScT = new HashMap<>();
                            ScT.put("Scores",score);
                            ScT.put("Times",time);
                            documentRefe.set(ScT).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Log.d("TAG", "Scores uploaded into databse");
                                }
                            });
                            DocumentReference documentRef = fstore.collection("scoresV").document(userId);
                            Map<String, Object> ScV = new HashMap<>();
                            ScV.put("Scores",score);
                            ScV.put("Times",time);
                            documentRef.set(ScV).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            DocumentReference documentRe = fstore.collection("scoresTOS").document(userId);
                            Map<String, Object> ScTOS = new HashMap<>();
                            ScTOS.put("Scores",score);
                            ScTOS.put("Times",time);
                            documentRe.set(ScTOS).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                }
                            });
                            if(fuser.isEmailVerified()){
                            startActivity(new Intent(MainActivity.this,MainActivity2.class));
                            finish();}
                            else {
                                startActivity(new Intent(MainActivity.this,checkemailverify.class));
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

    }
    public void log(View view) {
        startActivity( new Intent(MainActivity.this,loginpage.class));
    }
}