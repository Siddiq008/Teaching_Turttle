package com.example.sara;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class wordlist extends AppCompatActivity {
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordlist);
        String word=getIntent().getStringExtra("word");
        dialog=new Dialog(wordlist.this);
        dialog.setContentView(R.layout.listmean);
        ListView listView=findViewById(R.id.Listview);
        List<String> list= new ArrayList<>();
        list.add(word);
        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String word=list.get(position);
                getMeaning(word);
            }
        });
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

                        }
                    });

                }catch (Exception e){
                    Toast.makeText(wordlist.this,""+e,Toast.LENGTH_SHORT).show();

                }

            }
        },new Response.ErrorListener(){

            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(this).addToRequestQueue(jsonArrayRequest);


    }
}