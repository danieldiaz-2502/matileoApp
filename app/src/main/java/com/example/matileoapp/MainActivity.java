package com.example.matileoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView enunciado;
    private EditText respuestaEdit;
    private Button respuestaBoton;
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private String ejercicio;
    private int numero1;
    private int numero2;
    private int pregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        enunciado = findViewById(R.id.enunciado);
        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
        respuestaBoton.setOnClickListener(
                (v) -> {
                    String respuesta = respuestaEdit.getText().toString();
                    hacerPregunta();
                }
        );

    }

    public void hacerPregunta(){

        numero1 = (int) (Math.random()*20);
        numero2 = (int) (Math.random()*20);
        pregunta = (int) (Math.random()*4);
        preguntas.add(new Pregunta(numero1,numero2,pregunta));
        for(int i = 0; i < preguntas.size(); i++){
            preguntas.get(i).formular();
            enunciado.setText(preguntas.get(i).retornar() + " ");
        }
    }
}