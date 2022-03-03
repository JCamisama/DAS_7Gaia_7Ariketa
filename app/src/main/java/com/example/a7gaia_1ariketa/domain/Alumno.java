package com.example.a7gaia_1ariketa.domain;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;

    public Alumno(String pNombre, String pApellido, int pEdad) {
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.edad = pEdad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
