package com.example;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private List<Avion> aviones;
    private List<Vuelo> vuelos;

    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        this.aviones = new ArrayList<>();
        this.vuelos = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public Vuelo crearVuelo(String codigo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, LocalDateTime fechaHora) {
        Vuelo vuelo = new Vuelo(codigo, aeropuertoOrigen, aeropuertoDestino, fechaHora);
        vuelos.add(vuelo);
        return vuelo;
    }

    public void registrarPasajeroEnVuelo(String codigoVuelo, Pasajero pasajero) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getCodigo().equals(codigoVuelo)) {
                vuelo.registrarPasajero(pasajero);
                return;
            }
        }
        System.out.println("Vuelo no encontrado: " + codigoVuelo);
    }

    public void registrarPilotoEnVuelo(String codigoVuelo, Piloto piloto) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getCodigo().equals(codigoVuelo)) {
                vuelo.asignarPiloto(piloto);
                return;
            }
        }
        System.out.println("Vuelo no encontrado: " + codigoVuelo);
    }

    public List<Vuelo> buscarVuelosPorFecha(LocalDateTime fecha) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getFechaHora().toLocalDate().isEqual(fecha.toLocalDate())) {
                vuelosEncontrados.add(vuelo);
            }
        }
        return vuelosEncontrados;
    }

    public List<Pasajero> buscarPasajerosPorVuelo(String codigoVuelo) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getCodigo().equals(codigoVuelo)) {
                return vuelo.listarPasajeros();
            }
        }
        return new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre;
    }
}