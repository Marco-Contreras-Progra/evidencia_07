package com.example;
import java.util.Vector;

public class Avion {
    private String id; // Identificador único del avión
    private String modelo; // Modelo del avión
    private int capacidad; // Capacidad máxima de pasajeros
    private List<Vuelo> vuelos; // Lista de vuelos asociados al avión

    // Constructor
    public Avion(String id, String modelo, int capacidad) {
        this.id = id;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.vuelos = new ArrayList<>();
    }

    // Métodos para gestionar los vuelos
    public void agregarVuelo(Vuelo vuelo) {
        if (vuelos.size() < capacidad) {
            vuelos.add(vuelo);
        } else {
            System.out.println("El avión ha alcanzado su capacidad máxima de vuelos.");
        }
    }

    public List<Vuelo> getVuelos() {
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