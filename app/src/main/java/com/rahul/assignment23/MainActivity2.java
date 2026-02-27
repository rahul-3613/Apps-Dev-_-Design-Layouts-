package com.rahul.assignment23;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button b1, b2, b3, b4, b11, b6, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // আইডি কানেক্ট করা
        b1 = findViewById(R.id.btnSem1);
        b2 = findViewById(R.id.btnSem2);
        b3 = findViewById(R.id.btnSem3);
        b4 = findViewById(R.id.btnSem4);
        b11 = findViewById(R.id.btnSem5);
        b6 = findViewById(R.id.btnSem6);
        btnBack = findViewById(R.id.btnBackHome2);

        // ১. প্রথম সেমিস্টার (Sem 1)
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_1"));
                startActivity(i);
            }
        });

        // ২. দ্বিতীয় সেমিস্টার (Sem 2)
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_2"));
                startActivity(i);
            }
        });

        // ৩. তৃতীয় সেমিস্টার (Sem 3)
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_3"));
                startActivity(i);
            }
        });

        // ৪. চতুর্থ সেমিস্টার (Sem 4)
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_4"));
                startActivity(i);
            }
        });

        // ৫. পঞ্চম সেমিস্টার (Sem 5)
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_5"));
                startActivity(i);
            }
        });

        // ৬. ষষ্ঠ সেমিস্টার (Sem 6)
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://drive.google.com/link_for_semester_6"));
                startActivity(i);
            }
        });

        // ব্যাক বাটন
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}