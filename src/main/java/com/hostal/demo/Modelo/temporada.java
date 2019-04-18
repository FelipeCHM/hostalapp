package com.hostal.demo.Modelo;

public class temporada {
    private Long id_temporada;
    private String tipo;

    public temporada(Long id_temporada, String tipo) {
        this.id_temporada = id_temporada;
        this.tipo = tipo;
    }

    public Long getId_temporada() {
        return id_temporada;
    }

    public String getTipo() {
        return tipo;
    }
}
