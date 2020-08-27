package com.example.matileoapp;

import java.util.ArrayList;

public class Pregunta {

    int pregunta;
    String simbolo;
    int numero1;
    int numero2;
    int solucion;

    public Pregunta(int numero1, int numero2, int pregunta){
        this.numero1= numero1;
        this.numero2 = numero2;
        this.pregunta = pregunta;
    }

    void formular(){
        switch (pregunta) {
            case 0:
                simbolo = numero1 + "x" + numero2;
                solucion = numero1*numero2;
                break;
            case 1:
                simbolo = numero1 + "/" + numero2;
                solucion = numero1/numero2;
                break;
            case 2:
                simbolo = numero1 + "+" + numero2;
                solucion = numero1 + numero2;
                break;
            case 3:
                simbolo = numero1 + "-" + numero2;
                solucion = numero1 - numero2;
                break;
        }
    }
    String retornar (){
        return simbolo;
    }

    public int getSolucion() {
        return solucion;
    }

    public void setSolucion(int solucion) {
        this.solucion = solucion;
    }

    public int getPregunta() {
        return pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
