package com.rahul.assignment23;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    EditText etQuantity;
    Button btnProceed, btnBackHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        etQuantity = findViewById(R.id.et_quantity);
        btnProceed = findViewById(R.id.btn_proceed);
        btnBackHome = findViewById(R.id.btn_back_home);



        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qtyStr = etQuantity.getText().toString();

                if (!qtyStr.isEmpty()) {
                    int qty = Integer.parseInt(qtyStr);
                    int pricePerPizza = 41000;
                    int total = qty * pricePerPizza;


                    Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                    intent.putExtra("USER_QTY", qty);
                    intent.putExtra("TOTAL_PRICE", total);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity5.this, "Please enter quantity", Toast.LENGTH_SHORT).show();
                }
            }
        });


        btnBackHome.setOnClickListener(v -> finish());
    }
}