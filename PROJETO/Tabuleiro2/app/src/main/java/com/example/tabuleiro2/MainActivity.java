package com.example.tabuleiro2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ImageButton> btnTabuleiro = new ArrayList<>();


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
    }
}
