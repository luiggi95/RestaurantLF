package com.facci.restaurantlr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityLR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_lr);
    }

    public void click1(View v){
        Toast.makeText(MainActivityLR.this,"Pescado Apanado",Toast.LENGTH_SHORT).show();

    }
    public void click2(View v){
        Toast.makeText(MainActivityLR.this,"ceviche Mixto",Toast.LENGTH_SHORT).show();


    }
    public void click3(View v){
        Toast.makeText(MainActivityLR.this,"Camotillo Frito",Toast.LENGTH_SHORT).show();


    }
    public void click4(View v){
        Toast.makeText(MainActivityLR.this,"Encebollado",Toast.LENGTH_SHORT).show();


    }
    public void click5(View v){
        Toast.makeText(MainActivityLR.this,"Arroz Marinero",Toast.LENGTH_SHORT).show();


    }
    public void click6(View v){
        Toast.makeText(MainActivityLR.this,"Estofado de Pollo",Toast.LENGTH_SHORT).show();


    }
    public void click7(View v){
        Toast.makeText(MainActivityLR.this,"Cangrejos Criollos",Toast.LENGTH_SHORT).show();


    }
}
