package com.example.tabuleiro2;

import android.widget.ImageButton;

import java.util.ArrayList;

public class Tabuleiro {
    private int numCasa;
    private boolean possuiPeca;
    private int numPeca;
    private ImageButton btnCasa;


    public Tabuleiro(int numCasa, boolean possuiPeca, int numPeca, ImageButton btnCasa) {
        this.numCasa = numCasa;
        this.possuiPeca = possuiPeca;
        this.numPeca = numPeca;
        this.btnCasa = btnCasa;
    }

    public ImageButton getBtnCasa() {
        return btnCasa;
    }

    public void setBtnCasa(ImageButton btnCasa) {
        this.btnCasa = btnCasa;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public boolean isPossuiPeca() {
        return possuiPeca;
    }

    public int getNumPeca() {
        return numPeca;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public void setPossuiPeca(boolean possuiPeca) {
        this.possuiPeca = possuiPeca;
    }

    public void setNumPeca(int numPeca) {
        this.numPeca = numPeca;
    }
}
