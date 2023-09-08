package com.example.sara;

import static android.content.ContentValues.TAG;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.BreakIterator;
import java.util.Locale;

public class romancelay_2 extends AppCompatActivity {

    TextView einput,topic;
    Button bt_play,fav;
    ProgressDialog progressDialog;
    TextToSpeech textToSpeech;
    int i=1;
    AnimationDrawable nimo;
    Dialog dialog;
    DBhelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romancelay2);
        ImageView imageView=(ImageView) findViewById(R.id.nimo);
        imageView.setBackgroundResource(R.drawable.storyanime);
        nimo=(AnimationDrawable) imageView.getBackground();
        String story=getIntent().getStringExtra("story");
        String storytopic=getIntent().getStringExtra("topic");
        einput=findViewById(R.id.story);
        topic=findViewById(R.id.storytopic);
        bt_play=findViewById(R.id.button);
        progressDialog = new ProgressDialog(this);
        einput.setText(story);
        fav=findViewById(R.id.favwrds);
        topic.setText(storytopic);
        dialog=new Dialog(romancelay_2.this);
        dialog.setContentView(R.layout.meaning_dialog);
        init();
        db= new DBhelper(this);

        textToSpeech = new TextToSpeech(getApplicationContext(),
                new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if(i==TextToSpeech.SUCCESS){
                            int lang=textToSpeech.setLanguage(Locale.ENGLISH);
                            }
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
        },5000);

    }




    public void play(View view) {
        i++;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(i%2==0){
                    String s=einput.getText().toString();

                    int speech=textToSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null);

                }else if(i%2!=0){
                    int speech=textToSpeech.stop();

                };

            }
        },100);

    }

    @Override
    public void onBackPressed() {
        int speech=textToSpeech.stop();

        super.onBackPressed();
    }
    private void init() {
        TextView definitionView = (TextView) findViewById(R.id.story);
        String definition = definitionView.getText().toString().trim();

        definitionView.setMovementMethod(LinkMovementMethod.getInstance());
        definitionView.setText(definition, TextView.BufferType.SPANNABLE);
        Spannable spans = (Spannable) definitionView.getText();
        BreakIterator iterator = BreakIterator.getWordInstance(Locale.US);
        iterator.setText(definition);
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator
                .next()) {
            String possibleWord = definition.substring(start, end);
            if (Character.isLetterOrDigit(possibleWord.charAt(0))) {
                ClickableSpan clickSpan = getClickableSpan(possibleWord);
                spans.setSpan(clickSpan, start, end,
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
    }

    private ClickableSpan getClickableSpan(final String word) {
        return new ClickableSpan() {
            final String mWord;
            {
                mWord = word;

            }

            @Override
            public void onClick(View widget) {
                getMeaning(mWord);
            }

            public void updateDrawState(TextPaint ds) {

                super.updateDrawState(ds);
            }
        };
    }
    private void getMeaning(String Main_word){

        String URL="https://api.dictionaryapi.dev/api/v2/entries/en/"+Main_word;
        JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.GET, URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    JSONObject jsonObject= response.getJSONObject(0);
                    String word=jsonObject.getString("word");
                    String mean=jsonObject.getString("meanings");
                    JSONArray jsonArray=jsonObject.getJSONArray("meanings");
                    JSONObject jsonObject1=jsonArray.getJSONObject(0);
                    JSONArray jsonArray1=jsonObject1.getJSONArray("definitions");
                    JSONObject jsonObject2=jsonArray1.getJSONObject(0);
                    String Mean=jsonObject2.getString("definition");
                    Button ok=dialog.findViewById(R.id.button4);
                    Button add=dialog.findViewById(R.id.button5);
                    TextView meaning=dialog.findViewById(R.id.textView133);

                    meaning.setText(Mean);
                    dialog.show();
                    ok.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    add.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent=new Intent(romancelay_2.this,wordlist.class);
                            intent.putExtra("word",word);
                            Boolean checkadddata=db.insertdata(word,Mean);
                            if(checkadddata==true){
                                Toast.makeText(romancelay_2.this,"WORD ADDED",Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(romancelay_2.this, "ALREADY ADDED", Toast.LENGTH_SHORT).show();

                            }  }
                    });

                }catch (Exception e){
                    Toast.makeText(romancelay_2.this,""+e,Toast.LENGTH_SHORT).show();

                }

            }
        },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(this).addToRequestQueue(jsonArrayRequest);


    }


    public void fav(View view) {
        startActivity(new Intent(this,favoriteswords.class));

    }
}
