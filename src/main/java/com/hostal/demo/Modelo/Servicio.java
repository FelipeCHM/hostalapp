package com.hostal.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio {
    @Id
    @Column(name = "id_servicio")
    private Long id_servicio;
    @Column(name = "valor")
    private Double Valor;
    @Column(name = "nombre")
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
