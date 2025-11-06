package com.example.sistemagestionrutasaced.logico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrafoTransporte {

    private List<Parada> paradas;
    private List<List<Ruta>> adyacencia;
    private Map<String, Integer> identificador;

    public GrafoTransporte() {
        paradas = new ArrayList<>();
        adyacencia = new ArrayList<>();
        identificador = new HashMap<>();
    }

    public List<Parada> getParadas() {

        return paradas;
    }

    public List<List<Ruta>> getAdyacencia() {
        return adyacencia;
    }

    public Map<String, Integer> getIdentificador() {
        return identificador;
    }

    public void agregarParada(String id, String nombre) {

        if (identificador.containsKey(id)) {
            System.out.println("La parada con el ID | " + id + " | ya existe.");
            return;
        }

        paradas.add(new Parada(id, nombre));
        adyacencia.add(new ArrayList<>());
        identificador.put(id, paradas.size() - 1);
    }

    public void agregarRuta(String idOrigen, String idDestino, double tiempoM, double distanciaKm, double costoDOP) {

        Integer origen = identificador.get(idOrigen);
        Integer destino = identificador.get(idDestino);

        if (origen == null || destino == null) {
            System.out.println("Error: parada de origen o destino no existe.");
            return;
        }

        Ruta ruta = new Ruta(paradas.get(origen), paradas.get(destino), tiempoM, distanciaKm, costoDOP);
        adyacencia.get(origen).add(ruta);
    }

    public void imprimirListaAdyacencia() {
        for (int i = 0; i < paradas.size(); i++) {
            System.out.print(paradas.get(i) + " -> ");

            for (Ruta r : adyacencia.get(i)) {
                System.out.print(r.getDestino().getNombre() + " ");
            }
            System.out.println();
        }
    }


}
