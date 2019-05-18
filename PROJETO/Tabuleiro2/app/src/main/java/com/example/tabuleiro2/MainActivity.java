package com.example.tabuleiro2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<ImageButton> btnTabuleiro = new ArrayList<>();
    private int casaAtual = -1,casaDestino = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout l = findViewById(R.id.linear);

        // Toast.makeText(getBaseContext(),"RESULT: "+l.getChildAt(2).getId(),Toast.LENGTH_LONG).show();

        /* Instancia provisória */
        ImageButton btn = findViewById(R.id.btn1);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn3);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn5);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn7);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn10);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn12);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn14);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn16);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn17);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn19);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn21);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn23);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn26);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn28);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn30);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn32);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn33);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn35);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn37);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn39);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn42);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn44);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn46);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn48);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn49);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn51);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn53);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn55);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn58);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn60);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn62);
        btnTabuleiro.add(btn);
        btn = findViewById(R.id.btn64);
        btnTabuleiro.add(btn);


        btnTabuleiro.get(0).setOnClickListener(this);
        btnTabuleiro.get(1).setOnClickListener(this);
        btnTabuleiro.get(2).setOnClickListener(this);
        btnTabuleiro.get(3).setOnClickListener(this);
        btnTabuleiro.get(4).setOnClickListener(this);
        btnTabuleiro.get(5).setOnClickListener(this);
        btnTabuleiro.get(6).setOnClickListener(this);
        btnTabuleiro.get(7).setOnClickListener(this);
        btnTabuleiro.get(8).setOnClickListener(this);
        btnTabuleiro.get(9).setOnClickListener(this);
        btnTabuleiro.get(10).setOnClickListener(this);
        btnTabuleiro.get(11).setOnClickListener(this);
        btnTabuleiro.get(12).setOnClickListener(this);
        btnTabuleiro.get(13).setOnClickListener(this);
        btnTabuleiro.get(14).setOnClickListener(this);
        btnTabuleiro.get(15).setOnClickListener(this);
        btnTabuleiro.get(16).setOnClickListener(this);
        btnTabuleiro.get(17).setOnClickListener(this);
        btnTabuleiro.get(18).setOnClickListener(this);
        btnTabuleiro.get(19).setOnClickListener(this);
        btnTabuleiro.get(20).setOnClickListener(this);
        btnTabuleiro.get(21).setOnClickListener(this);
        btnTabuleiro.get(22).setOnClickListener(this);
        btnTabuleiro.get(23).setOnClickListener(this);
        btnTabuleiro.get(24).setOnClickListener(this);
        btnTabuleiro.get(25).setOnClickListener(this);
        btnTabuleiro.get(26).setOnClickListener(this);
        btnTabuleiro.get(27).setOnClickListener(this);
        btnTabuleiro.get(28).setOnClickListener(this);
        btnTabuleiro.get(29).setOnClickListener(this);
        btnTabuleiro.get(30).setOnClickListener(this);
        btnTabuleiro.get(31).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(getBaseContext(),"Teclando na casa1",Toast.LENGTH_LONG).show();
                if (casaAtual == -1){
                    btnTabuleiro.get(0).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 1;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(0).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 1;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn3:
                Toast.makeText(getBaseContext(),"Teclando na casa3",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(1).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 3;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(1).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 3;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn5:
                Toast.makeText(getBaseContext(),"Teclando na casa5",Toast.LENGTH_LONG).show();
                btnTabuleiro.get(2).setBackgroundColor(Color.rgb(105,105,105));

                if (casaAtual == -1){
                    btnTabuleiro.get(2).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 5;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(2).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 5;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn7:
                Toast.makeText(getBaseContext(),"Teclando na casa7",Toast.LENGTH_LONG).show();


                if (casaAtual == -1){
                    btnTabuleiro.get(3).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 7;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(3).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 7;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn10:
                Toast.makeText(getBaseContext(),"Teclando na casa10",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(4).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 10;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(4).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 10;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn12:
                Toast.makeText(getBaseContext(),"Teclando na casa12",Toast.LENGTH_LONG).show();
                if (casaAtual == -1){
                    btnTabuleiro.get(5).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 12;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(5).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 12;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn14:
                Toast.makeText(getBaseContext(),"Teclando na casa14",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(6).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 14;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(6).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 14;
                } else
                    resetaBackground(btnTabuleiro);


                break;
            case R.id.btn16:
                Toast.makeText(getBaseContext(),"Teclando na casa116",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(7).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 16;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(7).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 16;
                } else
                    resetaBackground(btnTabuleiro);


                break;
            case R.id.btn17:
                Toast.makeText(getBaseContext(),"Teclando na casa17",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(8).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 17;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(8).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 17;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn19:
                Toast.makeText(getBaseContext(),"Teclando na casa19",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(9).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 19;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(9).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 19;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn21:
                Toast.makeText(getBaseContext(),"Teclando na casa21",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(10).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 21;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(10).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 21;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn23:
                Toast.makeText(getBaseContext(),"Teclando na casa23",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(11).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 23;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(11).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 23;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn26:
                Toast.makeText(getBaseContext(),"Teclando na casa26",Toast.LENGTH_LONG).show();
                if (casaAtual == -1){
                    btnTabuleiro.get(12).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 26;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(12).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 26;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn28:
                Toast.makeText(getBaseContext(),"Teclando na casa28",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(13).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 28;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(13).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 28;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn30: //18
                Toast.makeText(getBaseContext(),"Teclando na casa30",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(14).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 30;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(14).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 20;
                } else
                    resetaBackground(btnTabuleiro);


                break;
            case R.id.btn32:
                Toast.makeText(getBaseContext(),"Teclando na casa32",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(15).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 32;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(15).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 32;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn33:
                Toast.makeText(getBaseContext(),"Teclando na casa33",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(16).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 33;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(16).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 33;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn35:
                Toast.makeText(getBaseContext(),"Teclando na casa38",Toast.LENGTH_LONG).show();
                if (casaAtual == -1){
                    btnTabuleiro.get(17).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 35;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(17).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 35;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn37:
                Toast.makeText(getBaseContext(),"Teclando na casa37",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(18).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 37;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(18).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 37;
                } else
                    resetaBackground(btnTabuleiro);



                break;
            case R.id.btn39:
                Toast.makeText(getBaseContext(),"Teclando na casa39",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(19).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 39;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(19).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 39;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn42:
                Toast.makeText(getBaseContext(),"Teclando na casa42",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(20).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 42;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(20).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 42;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn44:
                Toast.makeText(getBaseContext(),"Teclando na casa44",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(21).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 44;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(21).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 44;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn46:
                Toast.makeText(getBaseContext(),"Teclando na casa46",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(22).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 46;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(22).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 46;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn48:
                Toast.makeText(getBaseContext(),"Teclando na casa48",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(23).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 48;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(23).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 48;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn49:
                Toast.makeText(getBaseContext(),"Teclando na casa49",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(24).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 49;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(24).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 49;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn51:
                Toast.makeText(getBaseContext(),"Teclando na casa51",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(25).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 51;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(25).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 51;
                } else
                    resetaBackground(btnTabuleiro);
                break;
            case R.id.btn53:
                Toast.makeText(getBaseContext(),"Teclando na casa53",Toast.LENGTH_LONG).show();
                if (casaAtual == -1){
                    btnTabuleiro.get(26).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 53;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(26).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 53;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn55:
                Toast.makeText(getBaseContext(),"Teclando na casa55",Toast.LENGTH_LONG).show();
                btnTabuleiro.get(27).setBackgroundColor(Color.rgb(105,105,105));
                if (casaAtual == -1){
                    btnTabuleiro.get(27).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 55;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(27).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 55;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn58:
                Toast.makeText(getBaseContext(),"Teclando na casa58",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(28).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 58;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(28).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 58;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn60:
                Toast.makeText(getBaseContext(),"Teclando na casa60",Toast.LENGTH_LONG).show();
                btnTabuleiro.get(29).setBackgroundColor(Color.rgb(105,105,105));

                if (casaAtual == -1){
                    btnTabuleiro.get(29).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 60;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(29).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 60;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn62:
                Toast.makeText(getBaseContext(),"Teclando na casa62",Toast.LENGTH_LONG).show();

                if (casaAtual == -1){
                    btnTabuleiro.get(30).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 62;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(30).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 62;
                } else
                    resetaBackground(btnTabuleiro);

                break;
            case R.id.btn64:
                Toast.makeText(getBaseContext(),"Teclando na casa64",Toast.LENGTH_LONG).show();
                btnTabuleiro.get(31).setBackgroundColor(Color.rgb(105,105,105));

                if (casaAtual == -1){
                    btnTabuleiro.get(31).setBackgroundColor(Color.rgb(105,105,105));
                    casaAtual = 64;
                } else if (casaDestino == -1){
                    btnTabuleiro.get(31).setBackgroundColor(Color.rgb(105,105,105));
                    casaDestino = 64;
                } else
                    resetaBackground(btnTabuleiro);

                break;
        }
    }



    public void resetaBackground(ArrayList<ImageButton> img){
        for (int i = 0; i < img.size();i++){
            img.get(i).setBackgroundColor(Color.rgb(0,0,0));
        }
        casaAtual = -1;
        casaDestino = -1;
    }
}
