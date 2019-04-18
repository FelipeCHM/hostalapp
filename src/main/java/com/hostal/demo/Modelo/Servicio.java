package com.hostal.demo.Modelo;

public class Servicio {
    private Long id_servicio;
    private Double Valor;
    private String Nombre;

    public Servicio(Long id_servicio, Double valor, String nombre) {
        this.id_servicio = id_servicio;
        Valor = valor;
        Nombre = nombre;
    }

    public Long getId_servicio() {
        return id_servicio;
    }

    public Double getValor() {
        return Valor;
    }

    public String getNombre() {
        return Nombre;
    }
}
