package com.example.a7gaia_1ariketa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a7gaia_1ariketa.domain.Alumno;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Alumno> alumnos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Alumno firstStudent = new Alumno("Adrián", "Sánchez", 21);
        Alumno secondStudent = new Alumno("Ander", "Eiros", 21);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}