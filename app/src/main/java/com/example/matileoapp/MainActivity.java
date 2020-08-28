package com.example.matileoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
    private int numero1;
    private int numero2;
    private int pregunta;
    private TextView contador;
    private TextView tiempillo;
    private int numeroXD = 0;
    private int time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        time = 15;
        setContentView(R.layout.activity_main);
        enunciado = findViewById(R.id.enunciado);
        contador = findViewById(R.id.contador);
        tiempillo = findViewById(R.id.tiempillo);
        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
        tiempo();
        hacerPregunta();
        tiempillo.setText(time + " ");
        respuestaBoton.setOnClickListener(
                (v) -> {
                    time = 15;
                    String respuesta = respuestaEdit.getText().toString();
                    hacerPregunta();
                    for(int i = 0; i < preguntas.size(); i++) {
                        if (respuesta.equals(Integer.toString(preguntas.get(i).getSolucion()))) {
                            numeroXD = numeroXD + 1;
                            Log.e("puntaje", "lo hiciste bien");
                        } else if (numeroXD <= 0){
                            numeroXD = 0;
                        }
                        contador.setText(Integer.toString(numeroXD));
                    }
                    Log.e("respuesta", respuesta);

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
    public void tiempo() {
        new Thread(
            () -> {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    time = time - 1;
                    runOnUiThread(
                            () -> {
                                tiempillo.setText(""+ time);
                            }
                    );
                }
            }
            ).start();
        }
    }
