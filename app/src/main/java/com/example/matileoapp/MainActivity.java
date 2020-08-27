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
    int random1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
        respuestaBoton.setOnClickListener(
                (v) -> {
                    hacerPregunta();
                    String respuesta = respuestaEdit.getText().toString();
                    hacerPregunta();
                    Toast.makeText(this, random1 + " ", Toast.LENGTH_LONG).show();
                    enunciado.setText( "random2" + " ");
                }
        );

    }

    protected void hacerPregunta(){

        for(int i = 0; i < preguntas.size(); i++){
            preguntas.add(new Pregunta());
            preguntas.get(i).formular();
        }
    }
}