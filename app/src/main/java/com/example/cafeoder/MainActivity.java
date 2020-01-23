package com.example.cafeoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText clientLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clientLogin=findViewById(R.id.editText);
    }

    public void sendTheOder(View view) {
        String clientName=clientLogin.getText().toString().trim();
        if(!clientName.isEmpty()){
            Intent intent= new Intent(this,SelectProduct.class);
            intent.putExtra("name",clientName);
            startActivity(intent);

        }else {
            Toast.makeText(this, getString(R.string.mesg), Toast.LENGTH_LONG).show();
        }



    }
}
