package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Avion {
    private String id; 
    private String modelo;
    private int capacidad; 
    private List<Vuelo> vuelos; 

    public Avion(String id, String modelo, int capacidad) {
        this.id = id;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        if (vuelos.size() < capacidad) {
            vuelos.add(vuelo);
        } else {
            System.out.println("El avion ha alcanzado su capacidad máxima de vuelos");
        }
    }

    public List<Vuelo> listarVuelos() {
        return vuelos;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", vuelos=" + vuelos +
                '}';
    }
}