package com.example.sistemagestionrutasaced.logico;

public class Parada {

    private String id;
    private String nombre;


    public Parada(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }

}
