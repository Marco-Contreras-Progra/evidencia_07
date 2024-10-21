package com.example;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vuelo {
	private String codigo;
    private Aeropuerto ciudadOrigen;
    private Aeropuerto ciudadDestino;
    private LocalDateTime fecha;
    private List<Pasajero> pasajeros;
    private Piloto piloto;

    public Vuelo(String codigo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, LocalDateTime fechaHora) {
        this.codigo = codigo;
        this.ciudadOrigen = aeropuertoOrigen;
        this.ciudadDestino = aeropuertoDestino;
        this.fecha = fechaHora;
        this.pasajeros = new ArrayList<>();
    }

    public void registrarPasajero(Pasajero pasajero) {
        if (pasajero.obtenerPasaporte().esValido()) {
            pasajeros.add(pasajero);
        } else {
            System.out.println("Pasaporte no válido para el pasajero: " + pasajero.getNombre());
        }
    }
	public List<Pasajero> buscarPasajerosPorFecha(LocalDateTime fecha) {
        List<Pasajero> pasajerosEncontrados = new ArrayList<>();
        if (this.fecha.toLocalDate().equals(fecha.toLocalDate())) {
            pasajerosEncontrados.addAll(pasajeros);
        }
        return pasajerosEncontrados;
    }

    public void asignarPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Pasajero> listarPasajeros() {
        return pasajeros;
    }

    public LocalDateTime getFechaHora() {
        return fecha;
    }

    public String getCodigo() {
        return codigo;
    }
}