package com.example.tabuleiro2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<ImageButton> btnTabuleiro = new ArrayList<>();
    private int indexCasaAtual = -1,indexCasaDestino = -1;
    private Tabuleiro[] tabuleiro = new Tabuleiro[32];

    // variáveis auxiliáres
    private int nCasa = 1,idPeca = 1,indiceArray = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.linear);

        pegaInstaciaDosBotoes();
        preencheTabuleiro();
        btnTabuleiro.clear();

        // Setando o onClick das casas
        tabuleiro[0].getBtnCasa().setOnClickListener(this);
        tabuleiro[1].getBtnCasa().setOnClickListener(this);
        tabuleiro[2].getBtnCasa().setOnClickListener(this);
        tabuleiro[3].getBtnCasa().setOnClickListener(this);
        tabuleiro[4].getBtnCasa().setOnClickListener(this);
        tabuleiro[5].getBtnCasa().setOnClickListener(this);
        tabuleiro[6].getBtnCasa().setOnClickListener(this);
        tabuleiro[7].getBtnCasa().setOnClickListener(this);
        tabuleiro[8].getBtnCasa().setOnClickListener(this);
        tabuleiro[9].getBtnCasa().setOnClickListener(this);
        tabuleiro[10].getBtnCasa().setOnClickListener(this);
        tabuleiro[11].getBtnCasa().setOnClickListener(this);
        tabuleiro[12].getBtnCasa().setOnClickListener(this);
        tabuleiro[13].getBtnCasa().setOnClickListener(this);
        tabuleiro[14].getBtnCasa().setOnClickListener(this);
        tabuleiro[15].getBtnCasa().setOnClickListener(this);
        tabuleiro[16].getBtnCasa().setOnClickListener(this);
        tabuleiro[17].getBtnCasa().setOnClickListener(this);
        tabuleiro[18].getBtnCasa().setOnClickListener(this);
        tabuleiro[19].getBtnCasa().setOnClickListener(this);
        tabuleiro[20].getBtnCasa().setOnClickListener(this);
        tabuleiro[21].getBtnCasa().setOnClickListener(this);
        tabuleiro[22].getBtnCasa().setOnClickListener(this);
        tabuleiro[23].getBtnCasa().setOnClickListener(this);
        tabuleiro[24].getBtnCasa().setOnClickListener(this);
        tabuleiro[25].getBtnCasa().setOnClickListener(this);
        tabuleiro[26].getBtnCasa().setOnClickListener(this);
        tabuleiro[27].getBtnCasa().setOnClickListener(this);
        tabuleiro[28].getBtnCasa().setOnClickListener(this);
        tabuleiro[29].getBtnCasa().setOnClickListener(this);
        tabuleiro[30].getBtnCasa().setOnClickListener(this);
        tabuleiro[31].getBtnCasa().setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[0].getNumCasa()+
                        ",possui peca: "+tabuleiro[0].isPossuiPeca()+","+tabuleiro[0].getNumPeca()
                       +" INDICE: "+indiceArray ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(0);

                break;
            case R.id.btn3:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[1].getNumCasa()+
                                ",possui peca: "+tabuleiro[1].isPossuiPeca()+","+tabuleiro[1].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(1);

                break;
            case R.id.btn5:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[2].getNumCasa()+
                                ",possui peca: "+tabuleiro[2].isPossuiPeca()+","+tabuleiro[2].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(2);

                break;
            case R.id.btn7:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[3].getNumCasa()+
                                ",possui peca: "+tabuleiro[3].isPossuiPeca()+","+tabuleiro[3].getNumPeca()
                        ,Toast.LENGTH_LONG).show();

                marcaCasaDoTabuleiro(3);

                break;
            case R.id.btn10:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[4].getNumCasa()+
                                ",possui peca: "+tabuleiro[4].isPossuiPeca()+","+tabuleiro[4].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(4);

                break;
            case R.id.btn12:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[5].getNumCasa()+
                                ",possui peca: "+tabuleiro[5].isPossuiPeca()+","+tabuleiro[5].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(5);

                break;
            case R.id.btn14:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[6].getNumCasa()+
                                ",possui peca: "+tabuleiro[6].isPossuiPeca()+","+tabuleiro[6].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(6);

                break;
            case R.id.btn16:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[7].getNumCasa()+
                                ",possui peca: "+tabuleiro[7].isPossuiPeca()+","+tabuleiro[7].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(7);

                break;
            case R.id.btn17:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[8].getNumCasa()+
                                ",possui peca: "+tabuleiro[8].isPossuiPeca()+","+tabuleiro[8].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(8);

                break;
            case R.id.btn19:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[9].getNumCasa()+
                                ",possui peca: "+tabuleiro[9].isPossuiPeca()+","+tabuleiro[9].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(9);

                break;
            case R.id.btn21:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[10].getNumCasa()+
                                ",possui peca: "+tabuleiro[10].isPossuiPeca()+","+tabuleiro[10].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(10);

                break;
            case R.id.btn23:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[11].getNumCasa()+
                                ",possui peca: "+tabuleiro[11].isPossuiPeca()+","+tabuleiro[11].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(11);

                break;
            case R.id.btn26:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[12].getNumCasa()+
                                ",possui peca: "+tabuleiro[12].isPossuiPeca()+","+tabuleiro[12].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(12);

                break;
            case R.id.btn28:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[13].getNumCasa()+
                                ",possui peca: "+tabuleiro[13].isPossuiPeca()+","+tabuleiro[13].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(13);

                break;
            case R.id.btn30: //18
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[14].getNumCasa()+
                                ",possui peca: "+tabuleiro[14].isPossuiPeca()+","+tabuleiro[14].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(14);

                break;
            case R.id.btn32:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[15].getNumCasa()+
                                ",possui peca: "+tabuleiro[15].isPossuiPeca()+","+tabuleiro[15].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(15);

                break;
            case R.id.btn33:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[16].getNumCasa()+
                                ",possui peca: "+tabuleiro[16].isPossuiPeca()+","+tabuleiro[16].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(16);

                break;
            case R.id.btn35:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[17].getNumCasa()+
                                ",possui peca: "+tabuleiro[17].isPossuiPeca()+","+tabuleiro[17].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(17);

                break;
            case R.id.btn37:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[18].getNumCasa()+
                                ",possui peca: "+tabuleiro[18].isPossuiPeca()+","+tabuleiro[18].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(18);

                break;
            case R.id.btn39:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[19].getNumCasa()+
                                ",possui peca: "+tabuleiro[19].isPossuiPeca()+","+tabuleiro[19].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(19);

                break;
            case R.id.btn42:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[20].getNumCasa()+
                                ",possui peca: "+tabuleiro[20].isPossuiPeca()+","+tabuleiro[20].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(20);

                break;
            case R.id.btn44:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[21].getNumCasa()+
                                ",possui peca: "+tabuleiro[21].isPossuiPeca()+","+tabuleiro[21].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(21);

                break;
            case R.id.btn46:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[22].getNumCasa()+
                                ",possui peca: "+tabuleiro[22].isPossuiPeca()+","+tabuleiro[22].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(22);

                break;
            case R.id.btn48:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[23].getNumCasa()+
                                ",possui peca: "+tabuleiro[23].isPossuiPeca()+","+tabuleiro[23].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(23);

                break;
            case R.id.btn49:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[24].getNumCasa()+
                                ",possui peca: "+tabuleiro[24].isPossuiPeca()+","+tabuleiro[24].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(24);

                break;
            case R.id.btn51:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[25].getNumCasa()+
                                ",possui peca: "+tabuleiro[25].isPossuiPeca()+","+tabuleiro[25].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(25);

                break;
            case R.id.btn53:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[26].getNumCasa()+
                                ",possui peca: "+tabuleiro[26].isPossuiPeca()+","+tabuleiro[26].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(26);

                break;
            case R.id.btn55:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[27].getNumCasa()+
                                ",possui peca: "+tabuleiro[27].isPossuiPeca()+","+tabuleiro[27].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(27);

                break;
            case R.id.btn58:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[28].getNumCasa()+
                                ",possui peca: "+tabuleiro[28].isPossuiPeca()+","+tabuleiro[28].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(28);

                break;
            case R.id.btn60:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[29].getNumCasa()+
                                ",possui peca: "+tabuleiro[29].isPossuiPeca()+","+tabuleiro[29].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(29);

                break;
            case R.id.btn62:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[30].getNumCasa()+
                                ",possui peca: "+tabuleiro[30].isPossuiPeca()+","+tabuleiro[30].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(30);

                break;
            case R.id.btn64:
                Toast.makeText(getBaseContext(),"casa: "+tabuleiro[31].getNumCasa()+
                                ",possui peca: "+tabuleiro[31].isPossuiPeca()+","+tabuleiro[31].getNumPeca()
                        ,Toast.LENGTH_LONG).show();
                marcaCasaDoTabuleiro(31);
                break;
        }
    }


    public void marcaCasaDoTabuleiro( int posArray){
        if (indexCasaAtual == -1){
            tabuleiro[posArray].getBtnCasa().setBackgroundColor(Color.rgb(105,105,105));
            indexCasaAtual = posArray;
        } else if (indexCasaDestino == -1){
            tabuleiro[posArray].getBtnCasa().setBackgroundColor(Color.rgb(105,105,105));
            indexCasaDestino = posArray;
            verificaJogada();
        }
    }

    public void verificaJogada() {
        if ((tabuleiro[indexCasaAtual].getNumCasa()-7) == tabuleiro[indexCasaDestino].getNumCasa()){
            if (!tabuleiro[indexCasaDestino].isPossuiPeca())
                realizaJogada();
            else
                Toast.makeText(this, "Jogada não pode ser efetuada", Toast.LENGTH_SHORT).show();
        } else if ((tabuleiro[indexCasaAtual].getNumCasa()-9) == tabuleiro[indexCasaDestino].getNumCasa()){
            if (!tabuleiro[indexCasaDestino].isPossuiPeca())
                realizaJogada();
            else
                Toast.makeText(this, "Jogada não pode ser efetuada", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "impossivel efetuar jogada", Toast.LENGTH_SHORT).show();
        }

        resetaBackground(tabuleiro);
    }

    public void realizaJogada(){
        int peca = tabuleiro[indexCasaAtual].getNumPeca();
        tabuleiro[indexCasaAtual].setNumPeca(0);
        tabuleiro[indexCasaAtual].setPossuiPeca(false);
        tabuleiro[indexCasaAtual].getBtnCasa().setImageResource(android.R.color.transparent);
        // --------------------------------------------------
        tabuleiro[indexCasaDestino].setPossuiPeca(true);
        tabuleiro[indexCasaDestino].setNumPeca(peca);
        tabuleiro[indexCasaDestino].getBtnCasa().setImageResource(R.drawable.peca_rosa);
    }

    public void resetaBackground(Tabuleiro[] t){
        for (int i = 0; i < t.length;i++){
            t[i].getBtnCasa().setBackgroundColor(Color.rgb(0,0,0));
        }

        indexCasaAtual = -1;
        indexCasaDestino = -1;
    }

    public void preencheTabuleiro(){
        for (int i = 0; i < 32;i++){
            if ( nCasa == 7 || nCasa == 23 || nCasa == 39 || nCasa == 55 ) {
                setaCasa();
                nCasa += 3;
            } else if (nCasa == 16 || nCasa == 32 || nCasa == 48 || nCasa ==64){
                setaCasa();
                nCasa += 1;
            } else{
                setaCasa();
                nCasa += 2;
            }
        }
    }

    public void setaCasa() {
        if (nCasa < 26 || nCasa >= 42) {
            tabuleiro[indiceArray] = new Tabuleiro(nCasa, true, idPeca, btnTabuleiro.get(indiceArray));
            idPeca++;
            indiceArray++;
        } else {
            tabuleiro[indiceArray] = new Tabuleiro(nCasa, false, 0, btnTabuleiro.get(indiceArray));
            indiceArray++;
        }
    }

    public void pegaInstaciaDosBotoes(){
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
    }
}
