package com.hostal.demo.Modelo;

import java.util.Date;

public class Reserva {
    private Long id_Reserva;
    private Long id_tipopago;
    private Long id_habitacion;
    private Long id_huesped;
    private Date fecha_Entrada;
    private Date fecha_Salida;

    public Reserva(Long id_Reserva, Long id_tipopago, Long id_habitacion, Long id_huesped, Date fecha_Entrada, Date fecha_Salida) {
        this.id_Reserva = id_Reserva;
        this.id_tipopago = id_tipopago;
        this.id_habitacion = id_habitacion;
        this.id_huesped = id_huesped;
        this.fecha_Entrada = fecha_Entrada;
        this.fecha_Salida = fecha_Salida;
    }

    public Long getId_Reserva() {
        return id_Reserva;
    }

    public Long getId_tipopago() {
        return id_tipopago;
    }

    public Long getId_habitacion() {
        return id_habitacion;
    }

    public Long getId_huesped() {
        return id_huesped;
    }

    public Date getFecha_Entrada() {
        return fecha_Entrada;
    }

    public Date getFecha_Salida() {
        return fecha_Salida;
    }
}
