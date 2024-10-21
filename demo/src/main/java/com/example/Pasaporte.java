package com.example;

import java.time.LocalDate;

public class Pasaporte {
    private String id;
    private String nacionalidad;
    private LocalDate fechaExpiracion;
	private int hojasDisponibles;

    public Pasaporte(String id, String nacionalidad, int hojasDisponibles, LocalDate fechaExpiracion) {
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.fechaExpiracion = fechaExpiracion;
		this.hojasDisponibles = hojasDisponibles;
	}

	public boolean esValido() {
        return hojasDisponibles > 0 && fechaExpiracion.isAfter(LocalDate.now());
    }
	public String getId() {
        return id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }
}
