package com.example.matileoapp;

import java.util.ArrayList;

public class Pregunta {
    int pregunta;
    String simbolo;
    int numero1;
    int numero2;
    int solucion;

    public Pregunta(int pregunta, int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.pregunta = pregunta;
    }

    void formular(){
        switch (pregunta) {
            case 0:
                simbolo = "x";
                solucion = numero1 * numero2;
                break;
            case 1:
                simbolo = "/";
                solucion = numero1/numero2;
                break;
            case 2:
                simbolo = "+";
                solucion = numero1+numero2;
                break;
            case 3:
                simbolo = "-";
                solucion = numero1-numero2;
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
