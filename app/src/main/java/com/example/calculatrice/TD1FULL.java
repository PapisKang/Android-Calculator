package com.example.calculatrice;

import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TD1FULL extends AppCompatActivity {

    private TextView operande;
    private TextView tvResult1;
    private int ops = 1;
    private String textV = "";
    private int etGauch;
    private int etDroit;
    double sum = 0;
    public void calcul ()
    {
        if(textV=="") textV ="0";
        Expression e = new Expression(textV);
         sum = e.calculate();

        tvResult1.setText(Double.toString(sum)) ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_td1_full);

        operande = (TextView) findViewById(R.id.editText2);
        tvResult1 = (TextView) findViewById(R.id.tvResult1);

        Button b0 = (Button) findViewById(R.id.zero);
        Button b1 = (Button) findViewById(R.id.un);
        Button b2 = (Button) findViewById(R.id.deux);
        Button b3 = (Button) findViewById(R.id.trois);
        Button b4 = (Button) findViewById(R.id.quatre);
        Button b5 = (Button) findViewById(R.id.cinq);
        Button b6 = (Button) findViewById(R.id.six);
        Button b7 = (Button) findViewById(R.id.sept);
        Button b8 = (Button) findViewById(R.id.huit);
        Button b9 = (Button) findViewById(R.id.neuf);
        Button bparG = (Button) findViewById(R.id.parG);
        Button bparD = (Button) findViewById(R.id.parD);
        Button bpoint = (Button) findViewById(R.id.point);
        Button bundo = (Button) findViewById(R.id.undo);
        operande.setText("0");

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"0";
                operande.setText(textV);
                calcul();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"1";
                operande.setText(textV);
                calcul();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"2";
                operande.setText(textV);
                calcul();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"3";
                operande.setText(textV);
                calcul();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"4";
                operande.setText(textV);
                calcul();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"5";
                operande.setText(textV);
                calcul();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"6";
                operande.setText(textV);
                calcul();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"7";
                operande.setText(textV);
                calcul();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"8";
                operande.setText(textV);
                calcul();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"9";
                operande.setText(textV);
                calcul();
            }
        });

        bparG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +"(";
                operande.setText(textV);
            }
        });

        bparD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +")";
                operande.setText(textV);
            }
        });

        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = textV +".";
                operande.setText(textV);
            }
        });
        Button ce = (Button) findViewById(R.id.CE);
        Button egal = (Button) findViewById(R.id.egal);

        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operande.setText("0");
                textV="";
            }
        });

        bundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(textV.length()>0)
                textV=textV.substring(0,textV.length()-1);
                operande.setText(textV);
                calcul();
            }
        });

        egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textV = Double.toString(sum);
                operande.setText(textV);
            }
        });



        Button plus = (Button) findViewById(R.id.button2);
        Button moins = (Button) findViewById(R.id.button3);
        Button fois = (Button) findViewById(R.id.button4);
        Button div = (Button) findViewById(R.id.button5);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ops= 1;
                /*etGauch= Integer.parseInt(operande.getText().toString() );
                etDroit=0;
                textV="";*/

                textV = textV +"+";
                operande.setText(textV);
            }
        });
        moins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ops= 2;
                /*etGauch= Integer.parseInt(operande.getText().toString() );
                etDroit=0;
                textV="";*/

                textV = textV +"-";
                operande.setText(textV);
            }

        });
        fois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ops= 3;
                /*etGauch= Integer.parseInt(operande.getText().toString() );
                etDroit=0;
                textV="";*/

                textV = textV +"*";
                operande.setText(textV);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ops= 4;
               /* etGauch= Integer.parseInt(operande.getText().toString() );
                etDroit=0;
                textV="";*/

                textV = textV +"/";
                operande.setText(textV);
            }
        });


    }
}
