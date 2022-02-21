package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;


    ArrayList<String> arrIDs = new ArrayList<>(  );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);


        //spinner

        arrIDs.add("Aadhaar Card");
        arrIDs.add("Pan Card");
        arrIDs.add("Voter ID Card");
        arrIDs.add("Driving Card");
        arrIDs.add("Ration Card");
        arrIDs.add("Xth Score Card");
        arrIDs.add("XIIth Score Card");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIDs);
        spinner.setAdapter(adapter);


















    }
}