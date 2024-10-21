package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TestAeropuerto {
    public static void main(String[] args) {
        // Creacion de aeropuerto
        Aeropuerto aeropuerto = new Aeropuerto("Aeropuerto de Temuco");

        // Creacion de aviones
        Avion avion1 = new Avion("777", "LAN", 120);
        Avion avion2 = new Avion("123", "Skylines", 200);
        aeropuerto.agregarAvion(avion1);
        aeropuerto.agregarAvion(avion2);

        // Creacion de  vuelos
        Vuelo vuelo1 = aeropuerto.crearVuelo("V1", aeropuerto, aeropuerto, LocalDateTime.of(2024, 10, 30, 10, 0));
        Vuelo vuelo2 = aeropuerto.crearVuelo("V2", aeropuerto, aeropuerto, LocalDateTime.of(2024, 10, 29, 10, 0));

        // Creacion de pasajeros con pasaporte
        Pasaporte pasaporte1 = new Pasaporte("123456", "Chileno", 2, LocalDate.of(2025, 12, 31));
        Pasaporte pasaporte2 = new Pasaporte("789", "Chileno", 2, LocalDate.of(2025, 12, 31));
        Pasajero pasajero1 = new Pasajero("Marco", pasaporte1);
        Pasajero pasajero2 = new Pasajero("Marq", pasaporte2);
        aeropuerto.registrarPasajeroEnVuelo("V1", pasajero1);
        aeropuerto.registrarPasajeroEnVuelo("V1", pasajero2);
       
        // creacion de pilotos
        Piloto piloto1 = new Piloto("Marcos");
        Piloto piloto2 = new Piloto("Paola");
        aeropuerto.registrarPilotoEnVuelo("V1", piloto1);
        aeropuerto.registrarPilotoEnVuelo("V2", piloto2);

        // Buscar pasajeros en el vuelo
        System.out.println("Pasajeros en el vuelo " + vuelo1.getCodigo() + ":");
        for (Pasajero pasajero : vuelo1.listarPasajeros()) {
            System.out.println("- " + pasajero.getNombre());
        }

        System.out.println("Vuelos el 30 de octubre de 2024:");
        for (Vuelo vuelo : aeropuerto.buscarVuelosPorFecha(LocalDateTime.of(2024, 10, 30, 0, 0))) {
            System.out.println("- " + vuelo.getCodigo());
        }

        //Buscar pasajeros por fecha
           List<Pasajero> pasajerosEl30 = vuelo1.buscarPasajerosPorFecha(LocalDateTime.of(2024, 10, 30, 0, 0));
        System.out.println("Pasajeros en el vuelo el 30 de octubre de 2024:");
        for (Pasajero pasajero : pasajerosEl30) {
            System.out.println("- " + pasajero.getNombre());
        }
    }
}
