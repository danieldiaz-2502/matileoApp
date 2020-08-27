package com.example.matileoapp;

import java.util.ArrayList;

public class Pregunta {
    int pregunta;
    String simbolo;
    int numero1;
    int numero2;
    int solucion;

    public Pregunta(){
        this.numero1= (int) (Math.random()*20);
        this.numero2 = (int) (Math.random()*20);
        this.pregunta = (int) (Math.random()*4);
        this.solucion = solucion;
    }

    void formular(){
        switch (pregunta) {
            case 0:
                solucion = numero1*numero2;
                break;
            case 1:
                solucion = numero1/numero2;
                break;
            case 2:
                solucion = numero1 + numero2;
                break;
            case 3:
                solucion = numero1 - numero2;
                break;
        }
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
