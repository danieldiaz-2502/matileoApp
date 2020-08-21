package com.example.matileoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText respuestaEdit;
    private Button respuestaBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuestaEdit = findViewById(R.id.respuestaEdit);
        respuestaBoton = findViewById(R.id.respuestaBoton);
    }
}