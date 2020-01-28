package com.example.cafeoder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class SelectProduct extends AppCompatActivity {

    private  Spinner spinnerSup;
    private CheckBox selectGreek;
    private CheckBox selectLeto;
    private CheckBox selectZima;
    private CheckBox selectSpring;
    private CheckBox selectOlivie;
    private RadioButton selectDrink;
    private Spinner spinnerTea;
    private Spinner spinnerCoffe;
    private String nameDrinks;
    private String clientName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_product);
        nameDrinks=getString(R.string.Tea);
        spinnerSup=findViewById(R.id.spinnerSup);
        selectGreek=findViewById(R.id.checkGreeck);
        selectLeto=findViewById(R.id.checkLeto);
        selectZima=findViewById(R.id.checkZima);
        selectSpring=findViewById(R.id.checkSpring);
        selectOlivie=findViewById(R.id.checkOlivie);
        spinnerCoffe=findViewById(R.id.coffeList);
        spinnerTea=findViewById(R.id.teaList);
        Intent intent=getIntent();
        clientName=intent.getStringExtra("name");

    }

    public void chooseDrink(View view) {
        selectDrink=(RadioButton)view;
        int id=selectDrink.getId();
        if (id==R.id.radiobtcoffe){
            nameDrinks="Coffe";
            spinnerCoffe.setVisibility(View.VISIBLE);
            spinnerTea.setVisibility(View.INVISIBLE);
        }
        else if(id==R.id.radiobttea){
            nameDrinks="Tea";
            spinnerCoffe.setVisibility(View.INVISIBLE);
            spinnerTea.setVisibility(View.VISIBLE);

        }


    }
}
