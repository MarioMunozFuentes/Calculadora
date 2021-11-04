package com.mariomunozmyaplication.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button btsumar;
    public Button btrestar;
    public Button btmultiplicar;
    public Button btdividir;
    public Button btreset;
    public TextView txtresultado;
    public EditText txtn1;
    public EditText txtn2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btsumar= (Button) findViewById(R.id.btsumar);
        btrestar= (Button) findViewById(R.id.btrestar);
        btmultiplicar= (Button) findViewById(R.id.btmultiplicar);
        btdividir= (Button) findViewById(R.id.btdividir);
        btreset= (Button) findViewById(R.id.btreset);

        txtn1= (EditText) findViewById(R.id.etn1);
        txtn2= (EditText) findViewById(R.id.etn2);

        txtresultado= (TextView) findViewById(R.id.tv1);

        btsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1= 0;
                double n2= 0;
                double suma= 0;

                n1= Double.parseDouble(txtn1.getText().toString());
                n2= Double.parseDouble((txtn2.getText().toString()));

                suma= n1 + n2;
                txtresultado.setText(String.valueOf(suma));
            }
        });
        btrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1= 0;
                double n2= 0;
                double resta= 0;

                n1= Double.parseDouble(txtn1.getText().toString());
                n2= Double.parseDouble(txtn2.getText().toString());

                resta= n1 - n2;
                txtresultado.setText(String.valueOf(resta));

            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1= 0;
                double n2= 0;
                double multiplicacion= 0;

                n1= Double.parseDouble(txtn1.getText().toString());
                n2= Double.parseDouble(txtn2.getText().toString());

                multiplicacion= n1 * n2;
                txtresultado.setText(String.valueOf(multiplicacion));
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1= 0;
                double n2= 0;
                double division= 0;

                n1= Double.parseDouble(txtn1.getText().toString());
                n2= Double.parseDouble(txtn2.getText().toString());

                division= n1 / n2;
                txtresultado.setText(String.valueOf(division));
            }
        });

        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1= "";
                String n2= "";
                double reset= 0;

                txtn1.setText(String.valueOf(n1));
                txtn2.setText(String.valueOf(n2));
                txtresultado.setText(String.valueOf(reset));
            }
        });
     }
}