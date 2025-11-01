package com.example.sistemagestionrutasaced.logico;

public class Ruta {

    private Parada origen;
    private Parada destino;
    private double tiempo;     // en minutos
    private double distancia;  // en kilometros
    private double costo;      // pesos dominicanos (DOP)

    public Ruta(Parada origen, Parada destino, double tiempo, double distancia, double costo) {
        this.origen = origen;
        this.destino = destino;
        this.tiempo = tiempo;
        this.distancia = distancia;
        this.costo = costo;
    }

    public Parada getOrigen() {
        return origen;
    }
    public Parada getDestino() {
        return destino;
    }
    public double getTiempo() {
        return tiempo;
    }
    public double getDistancia() {
        return distancia;
    }
    public double getCosto() {
        return costo;
    }


}
