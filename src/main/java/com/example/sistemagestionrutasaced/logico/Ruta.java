package com.example.sistemagestionrutasaced.logico;

public class Ruta {

    private Parada origen;
    private Parada destino;
    private double tiempoM;
    private double distanciaKm;
    private double costoDOP;

    public Ruta(Parada origen, Parada destino, float tiempoM, float distanciaKm, float costoDOP) {
        this.origen = origen;
        this.destino = destino;
        this.tiempoM = tiempoM;
        this.distanciaKm = distanciaKm;
        this.costoDOP = costoDOP;
    }

    public Parada getOrigen() {
        return origen;
    }

    public Parada getDestino() {
        return destino;
    }

    public double getTiempoM() {
        return tiempoM;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getCostoDOP() {
        return costoDOP;
    }

    @Override
    public String toString() {
        return origen.getNombre() + " -> " + destino.getNombre() + " | Tiempo: " + tiempoM + " min, Distancia: " + distanciaKm + " km, Costo: " + costoDOP + " DOP";
    }

}
