package com.example.sistemagestionrutasaced.logico;

import java.util.ArrayList;

public class Ruta {
    private String ruta;
    private int distancia;
    private int costo;
    private ArrayList<Ruta> transbordosRutas;
    private Parada salida;
    private Parada llegada;
}
