package com.example.complaint;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[] city, planets, language;
    AutoCompleteTextView auto, auto1, auto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto=findViewById(R.id.autoCompleteTextView);
        auto1=findViewById(R.id.autoCompleteTextView1);
        auto2=findViewById(R.id.autoCompleteTextView2);


        //getting resource from sting xml and showing
        city = getResources().getStringArray(R.array.City);
        ArrayAdapter<String> arrayString = new ArrayAdapter<>(this,R.layout.drop_down,city);
        auto.setAdapter(arrayString);

        //getting resource from sting xml and showing using adapter
        language = getResources().getStringArray(R.array.Language);
        ArrayAdapter<String> arrayString1 = new ArrayAdapter<>(this,R.layout.drop_down,language);
        auto1.setAdapter(arrayString1);

        //getting resource from sting xml and showing
        planets = getResources().getStringArray(R.array.PLanets);
        ArrayAdapter<String> arrayString2 = new ArrayAdapter<>(this,R.layout.drop_down,planets);
        auto2.setAdapter(arrayString2);

    }
}