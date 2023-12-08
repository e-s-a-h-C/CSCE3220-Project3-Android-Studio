package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find Button
        Button linked = findViewById(R.id.linkedIn);
        Button git = findViewById(R.id.GitHub);
        Button mystery = findViewById(R.id.surprise);
        //Set button behavior
        linked.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goLink("https://www.linkedin.com/in/chaseneumann/");
            }
        });

        git.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goLink("https://github.com/e-s-a-h-C");
            }
        });

        mystery.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                goLink("https://www.youtube.com/watch?v=s1TsnnqgkoY");
            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}