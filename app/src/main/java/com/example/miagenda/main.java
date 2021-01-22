package com.example.miagenda;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Persona guti = new Persona("Diana","Gutierrez","95636525",25);
        Persona klevert = new Persona("klevert","Herrera","4543543",24);

        List<Persona>milista = new ArrayList<>();
        milista.add(guti);
        milista.add(klevert);

        System.out.println("====================================");
        System.out.println("Reportes de Personas");
        for(Persona per : milista){
            System.out.println(per.getNombre()+ " "+ per.getApellido());
        }
        int i = 0;
        while(i<10){

        }
        System.out.println("====================================\n Total de personas: "+milista.size());

    }
}
