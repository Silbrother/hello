package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Economia extends AppCompatActivity {

    private TextView campoVMin,campoV654, campoV1120, campo2130, campoV3150 , campoVTotal;;
    private EditText EntradaC;
    private Button Calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economia);
        campoVMin = (TextView) findViewById(R.id.campoMin);
        campoV654 =(TextView) findViewById(R.id.campoV654);
        campoV1120 =(TextView) findViewById(R.id.campoV1120);
        campo2130 =(TextView) findViewById(R.id.campoV2130);
        campoV3150 =(TextView) findViewById(R.id.campoV3150);
        campoVTotal =(TextView) findViewById(R.id.campoTotal);

        EntradaC = (EditText) findViewById(R.id.EntradaCM);
        Calcular = (Button) findViewById(R.id.btn_Calcular);
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.parseInt(EntradaC.getText().toString());
                double a = 50.20;
                double b = 65.40;
                double c = 142.80;
                double d = 154.20;

                if (x <= 10) {
                    campoVMin.setText(String.valueOf(a));
                    campoVTotal.setText(String.valueOf(a * 2));

                }
                if (( x >= 11 ) && ( x <= 20 )) {

                    double b1 = ( x - 10 ) * 6.54;
                    double z = (a + b1) * 2;
                    campoVMin.setText(String.valueOf(a));
                    campoVTotal.setText(String.valueOf(z));

                }
                if (( x >= 21 ) && ( x <= 30 )) {

                    double c1 = ( x - 20 ) * 14.28;
                    double z = (a + b + c1) * 2;

                    campoVMin.setText(String.valueOf(a));
                    campoV654.setText(String.valueOf(b));
                    campoV1120.setText(String.valueOf(c));
                    campo2130.setText(String.valueOf(c1));
                    campoVTotal.setText(String.valueOf(z));
                }
                if (( x >= 31 ) && ( x <= 40 )) {

                    double d1 = ( x - 30 ) * 15.42;
                    double z = (a + b + c + d1) * 2;

                    campoVMin.setText(String.valueOf(a));
                    campoV654.setText(String.valueOf(b));
                    campoV1120.setText(String.valueOf(c));
                    campo2130.setText(String.valueOf(d));
                    campoV3150.setText(String.valueOf(d1));
                    campoVTotal.setText(String.valueOf(z));

                }if  ((x >=41)  && (x <=50)) {

                    double d1 = ( x - 40 ) * 15.42;
                    double z = (a + b + c + d1)*2;

                    campoVMin.setText(String.valueOf(a));
                    campoV654.setText(String.valueOf(b));
                    campoV1120.setText(String.valueOf(c));
                    campo2130.setText(String.valueOf(d));
                    campoV3150.setText(String.valueOf(d1));
                    campoVTotal.setText(String.valueOf(z));

                } if  (x >= 51) {

                    double e = ( x - 40 ) * 15.42; //154.20
                    double z = (a + b + c + d + e)* 2;
                    campoVMin.setText(String.valueOf(a));
                    campoV654.setText(String.valueOf(b));
                    campoV1120.setText(String.valueOf(c));
                    campo2130.setText(String.valueOf(d));
                    campoV3150.setText(String.valueOf(e));
                    campoVTotal.setText(String.valueOf(z));
                }
                }

                });
    }
}
