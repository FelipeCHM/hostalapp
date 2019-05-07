package com.hostal.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "temporada")
public class temporada {
    @Id
    @Column(name = "id_temporada")
    private Long id_temporada;
    @Column(name = "tipo")
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
