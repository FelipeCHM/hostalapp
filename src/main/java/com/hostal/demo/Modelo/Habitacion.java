package com.hostal.demo.Modelo;

import javax.persistence.*;

@Entity
@Table(name = "habitacion")
public class Habitacion {
    @Id
    @Column(name = "id_habitacion")
    @JoinColumn(name = "id_habitacion",referencedColumnName = "id_habitacion",insertable = true,nullable = true)
    private Long id_habitacion;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "capacidad")
    private Long capacidad;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "id_temporada")
    @JoinColumn(name = "id_temporada", referencedColumnName = "id_temporada",insertable = true,nullable = true)
    private Long id_Temporada;
    @Column(name = "estado")
    private Boolean estado;

    public Habitacion(Long id_habitacion, Long numero, String tipo, Long capacidad, Double precio, Long id_Temporada,Boolean estado) {
        this.id_habitacion = id_habitacion;
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precio = precio;
        this.id_Temporada = id_Temporada;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Long getId_habitacion() {
        return id_habitacion;
    }

    public Long getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public Long getCapacidad() {
        return capacidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public Long getId_Temporada() {
        return id_Temporada;
    }
}
