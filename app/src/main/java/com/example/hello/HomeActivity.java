package com.example.hello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

     Button cxCon , cxEco , cxRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cxCon = (Button) findViewById(R.id.cxCons);
        cxCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Botão Consumo! Clicado",Toast.LENGTH_SHORT).show();

            }
        });
        cxEco = (Button) findViewById(R.id.cxEco);
        cxEco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Economia!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Economia.class);
                startActivity(intent);
            }
        });
        cxRes = (Button) findViewById(R.id.cxRes);
        cxRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Botão Reservatorio Clicado",Toast.LENGTH_SHORT).show();
            }
        });

    }

}