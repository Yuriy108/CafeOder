package com.example.cafeoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FullOder extends AppCompatActivity {
    private TextView displeyOder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_oder);
        displeyOder=findViewById(R.id.textViewOder);
        Intent intent=getIntent();
        String oder=intent.getStringExtra("oder");
        displeyOder.setText(oder);

    }
}
