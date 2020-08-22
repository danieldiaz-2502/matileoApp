package com.example.matileoapp;

import java.util.ArrayList;

public class Pregunta {
    String pregunta;
    String simbolo;
    ArrayList<Pregunta> preguntas;
    int numero1;
    int numero2;
    int solucion;

    public Pregunta(int numero1, int numero2, String simbolo){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.simbolo = simbolo;
    }

    void formular[]{
        switch (pregunta) {
            case 1:
                simbolo = "x";
                solucion = numero1 * numero2;
                break;
            case 2:
                simbolo = "/";
                solucion = numero1/numero2;
                break;
            case 3:
                simbolo = "+";
                solucion = numero1+numero2;
                break;
            case 4:
                simbolo = "-";
                solucion = numero1-numero2;
                break;
        }
    }

}
