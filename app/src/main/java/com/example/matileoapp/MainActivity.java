package com.example.matileoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText respuestaEdit;
    private Button respuestaBoton;
    private ArrayList<String> preguntas = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
        preguntas.add("4 x 5");
        preguntas.add("15/3");
        preguntas.add("3 x 7");
        preguntas.add("27/9");
    }
}