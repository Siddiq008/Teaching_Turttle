package com.example.sara;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class checkemailverify extends AppCompatActivity {
    TextView sendemail,verifyemail,notverify;
    FirebaseAuth fAuth;
    String userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkemailverify);
        sendemail=findViewById(R.id.sendmail);
        verifyemail=findViewById(R.id.verified);
        notverify=findViewById(R.id.notverify);
        fAuth=FirebaseAuth.getInstance();
        userid =fAuth.getCurrentUser().getUid();
        FirebaseUser user=fAuth.getCurrentUser();
        if(user.isEmailVerified()){
            verifyemail.setVisibility(View.VISIBLE);
        }
        else{
            notverify.setVisibility(View.VISIBLE);
            sendemail.setVisibility(View.VISIBLE);
            sendemail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FirebaseUser fuser=fAuth.getCurrentUser();
                    fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(checkemailverify.this, "Verification Email has been sent", Toast.LENGTH_SHORT).show();
                            fAuth.signOut();
                            Intent intent=new Intent(checkemailverify.this,loginpage.class);
                            startActivity(intent);
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d(TAG,"Email Not sent"+e.getMessage());
                        }
                    });
                }
            });
        }

    }

    public void signup(View view) {

    }
}