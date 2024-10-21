package com.example;

public class Piloto {
    private Vuelo vueloAsignado;

    public Piloto(String nombre) {
        this.vueloAsignado = null;
    }

    public Vuelo getVueloAsignado() {
        return vueloAsignado;
    }
    public void asignarVuelo(Vuelo vuelo) {
        this.vueloAsignado = vuelo;
    }
    public String verificarVuelo() {
        if (vueloAsignado != null) {
            return "El piloto  está asignado al vuelo " + vueloAsignado.getCodigo();
        } else {
            return "El piloto  no tiene un vuelo asignado.";
        }
    }

}
