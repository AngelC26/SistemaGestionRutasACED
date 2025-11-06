package com.example.sistemagestionrutasaced.logico;

public class Main {
    public static void main(String[] args) {

        GrafoTransporte g = new GrafoTransporte();

        g.agregarParada("P01", "A1");
        g.agregarParada("P02", "A2");
        g.agregarParada("P03", "A3");
        g.agregarParada("P04", "A4");
        g.agregarParada("P05", "TEP");

        g.agregarRuta("P01", "P02", 10, 3, 30);
        g.agregarRuta("P01", "P03", 8, 2, 25);
        g.agregarRuta("P02", "P04", 6, 1.5, 20);
        g.agregarRuta("P03", "P04", 5, 1, 20);
        g.agregarRuta("P04", "P05", 12, 4, 35);
        g.agregarRuta("P02", "P01", 10, 3, 30);

        g.imprimirListaAdyacencia();

        System.out.println();

        AlgoritmoRutas.Dijkstra(g, "P01");


    }
}
