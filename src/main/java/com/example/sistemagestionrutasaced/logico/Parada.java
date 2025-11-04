package com.example.sistemagestionrutasaced.logico;

public class Parada {

    private String codigo;
    private String nombre;

    public Parada(String id, String nombre) {
        this.codigo = id;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo +")";
}

}