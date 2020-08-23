package com.example.matileoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText respuestaEdit;
    private Button respuestaBoton;
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private int random1;
    private int random2;
    private int random3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
        hacerPregunta();

    }

    protected void hacerPregunta(){

        for(int i = 0; i < 20; i++){
            random1= (int) (Math.random()*(10 - 1) + 1);
            random2 = (int) (Math.random()*(10 - 1) + 1);
            random3 = (int) (Math.random()*3 + 1);
            preguntas.add(new Pregunta(random3,random1,random2));
        }
    }
}