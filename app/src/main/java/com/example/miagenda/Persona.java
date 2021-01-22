package com.example.miagenda;

public class Persona {
    private String nombre;
    private String apellido;
    private String celular;
    private int edad;

    public Persona(String nombre, String apellido, String celular, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }
}
