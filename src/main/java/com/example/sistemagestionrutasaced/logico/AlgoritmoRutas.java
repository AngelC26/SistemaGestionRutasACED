package com.example.sistemagestionrutasaced.logico;

import java.util.*;


public class AlgoritmoRutas {

    public static void Dijkstra(GrafoTransporte grafo, String idOrigen) {

        Map<String, Integer> indices = grafo.getIdentificador();
        List<Parada> paradas = grafo.getParadas();
        List<List<Ruta>> adyacencia = grafo.getAdyacencia();

        int n = paradas.size();
        double[] dist = new double[n];
        String[] prev = new String[n];

        Arrays.fill(dist, Double.MAX_VALUE);
        Arrays.fill(prev, null);

        int origen = indices.get(idOrigen);
        dist[origen] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingDouble(a -> a[1]));
        pq.add(new int[]{origen, 0});

        boolean[] visitado = new boolean[n];

        while (!pq.isEmpty()) {
            int nodoActual = pq.poll()[0];

            if (visitado[nodoActual]) continue;
            visitado[nodoActual] = true;

            for (Ruta r : adyacencia.get(nodoActual)) {
                int destino = indices.get(r.getDestino().getId());
                double nuevoCosto = dist[nodoActual] + r.getTiempoM();

                if (nuevoCosto < dist[destino]) {
                    dist[destino] = nuevoCosto;
                    prev[destino] = paradas.get(nodoActual).getId();
                    pq.add(new int[]{destino, (int) nuevoCosto});
                }
            }
        }

        System.out.println("\nResultados de Dijkstra desde " + idOrigen + ":\n");

        for (int i = 0; i < n; i++) {
            System.out.print(paradas.get(i).getNombre() + " = ");

            if (dist[i] == Double.MAX_VALUE) {
                System.out.println("No hay ruta");
                continue;
            }

            System.out.print(dist[i] + " min | Ruta: ");

            List<String> camino = new ArrayList<>();
            String actual = paradas.get(i).getId();

            while (actual != null) {
                camino.add(actual);
                actual = prev[indices.get(actual)];
            }

            Collections.reverse(camino);
            System.out.println(String.join(" -> ", camino));
        }
    }
}