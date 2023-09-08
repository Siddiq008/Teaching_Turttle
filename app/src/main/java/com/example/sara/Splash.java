package com.example.sara;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Splash extends AppCompatActivity {
    FirebaseAuth fAuth;
    TextView textView;
    CharSequence charSequence;
    Handler handler=new Handler();
    int index;
    long delay =100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        fAuth = FirebaseAuth.getInstance();
        FirebaseUser user=fAuth.getCurrentUser();
        textView=findViewById(R.id.textView13);
        animatText("Teaching Turtle");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if((fAuth.getCurrentUser()!= null)&&(user.isEmailVerified())){
                    startActivity(new Intent(Splash.this,MainActivity2.class));
                    finish();
                }
                else if((fAuth.getCurrentUser()!= null)&&(!user.isEmailVerified())){
                    startActivity(new Intent(Splash.this,checkemailverify.class));
                    finish();
                }
                else {
                    startActivity(new Intent(Splash.this,loginpage.class));
                    finish();
                }
            }
    },2000);

    }
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            textView.setText(charSequence.subSequence(0,index++));
            if(index<=charSequence.length()){
                handler.postDelayed(runnable,delay);
            }
        }
    };
    public void  animatText(CharSequence cs){
        charSequence =cs;
        index=0;
        textView.setText("");
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable,delay);
    }
}










