package com.example.sara;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class loginpage extends AppCompatActivity {
    TextView regbtn, loginbtn, forgetlink;
    EditText mname, mpassword;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        regbtn = findViewById(R.id.registerbtn);
        mname = findViewById(R.id.username);
        forgetlink = findViewById(R.id.forgetpass);
        mpassword = findViewById(R.id.password);
        progressBar = findViewById(R.id.progressbar);
        fAuth = FirebaseAuth.getInstance();
        loginbtn = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mname.getText().toString().trim();
                String password = mpassword.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {
                    mname.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    mpassword.setError("Password is Required");
                    return;
                }
                progressBar.setVisibility(view.VISIBLE);
                fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = fAuth.getCurrentUser();
                            if (user.isEmailVerified()) {
                                startActivity(new Intent(loginpage.this, MainActivity2.class));
                                Toast.makeText(loginpage.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                                finish();
                            } else {
                                startActivity(new Intent(loginpage.this, checkemailverify.class));
                                Toast.makeText(loginpage.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                                finish();

                            }
                        } else {
                            Toast.makeText(loginpage.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });

            }
        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        forgetlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText resetMail = new EditText(view.getContext());
                AlertDialog.Builder passwordResetDialog = new AlertDialog.Builder(view.getContext());
                passwordResetDialog.setTitle("Reset Password");
                passwordResetDialog.setMessage("Enter Your Email To Recieve Reset Link");
                passwordResetDialog.setView(resetMail);
                passwordResetDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String mail = resetMail.getText().toString().trim();
                        fAuth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(loginpage.this, "Reset link Has been send to Your Mail", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(loginpage.this, "link not sent" + e.getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        });
                    }
                });
                passwordResetDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                passwordResetDialog.create().show();
            }
        });
    }

}