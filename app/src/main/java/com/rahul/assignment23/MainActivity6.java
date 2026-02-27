package com.rahul.assignment23;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    TextView tvQty, tvTotal;
    Button btnBackShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        tvQty = findViewById(R.id.tv_receipt_quantity);
        tvTotal = findViewById(R.id.tv_receipt_total);
        btnBackShop = findViewById(R.id.btn_back_shop);

        int receivedQty = getIntent().getIntExtra("USER_QTY", 0);
        int receivedTotal = getIntent().getIntExtra("TOTAL_PRICE", 0);


        tvQty.setText("Quantity: " + receivedQty);
        tvTotal.setText("Total Price: " + receivedTotal);


        btnBackShop.setOnClickListener(v -> finish());
    }
}