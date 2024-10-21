package com.example;

public class Pasajero {
	private String nombre;
    private Pasaporte pasaporte;

    public Pasajero(String nombre, Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    public String getNombre() {
        return nombre;
    }
    public Pasaporte obtenerPasaporte() {
        return pasaporte;
    }
}