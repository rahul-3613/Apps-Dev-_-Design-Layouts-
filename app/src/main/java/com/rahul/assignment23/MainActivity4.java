package com.rahul.assignment23;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    EditText etNo;
    Button b22, b23, b24, b25, b10; // b10 যোগ করা হয়েছে

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // নিশ্চিত করুন আপনার XML ফাইলটির নাম activity_main3 কিনা
        setContentView(R.layout.activity_main4);

        // ১. ভিউ কানেক্ট করা
        etNo = findViewById(R.id.etNo);
        b22 = findViewById(R.id.b22);
        b23 = findViewById(R.id.b23);
        b24 = findViewById(R.id.b24);
        b25 = findViewById(R.id.b25);
        b10 = findViewById(R.id.b10);

        // ২. কন্টাক্ট ওপেন করা
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));
                startActivity(i);
            }
        });

        // ৩. ব্রাউজার ওপেন করা
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/rahul-3613"));
                startActivity(i);
            }
        });

        // ৪. গ্যালারি ওপেন করা
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(i);
            }
        });

        // ৫. ডায়ালপ্যাড ওপেন করা
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = etNo.getText().toString().trim();
                if (!number.isEmpty()) {
                    Intent i = new Intent(Intent.ACTION_DIAL);
                    i.setData(Uri.parse("tel:" + number));
                    startActivity(i);
                }
            }
        });

        // ৬. ব্যাক হোম (বর্তমান অ্যাক্টিভিটি বন্ধ করা)
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // এটি আপনাকে আগের পেজে নিয়ে যাবে
            }
        });
    }
}