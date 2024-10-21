package com.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Aeropuerto {
	private String _nombre;
	private Avion _aviones;
	private List<Avion> aviones;

    public Aeropuerto() {
        this.aviones = new ArrayList<>();
    }

    public void registrarAvion(Avion avion) {
        this.aviones.add(avion);
        System.out.println("Avión registrado en el aeropuerto.");
    }

    public List<Avion> obtenerAviones() {
        return this.aviones;
    }

    public List<Vuelo> buscarVuelosPorFecha(String fecha) {
        List<Vuelo> vuelosEnFecha = new ArrayList<>();
        for (Avion avion : aviones) {
            vuelosEnFecha.addAll(avion.buscarVuelosPorFecha(fecha));
        }
        return vuelosEnFecha;
    }
}