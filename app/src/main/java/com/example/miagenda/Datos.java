package com.example.miagenda;

public class Datos {
    private String nombre;
    private String apellido;
    private String celular;
    private String direccion;

    public Datos(String nombre, String apellido, String celular, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }
}
