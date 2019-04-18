package com.hostal.demo.Modelo;

public class tipo_pago {
    private Long id_pago;
    private String banco;
    private String tipo;
    private Double monto;

    public tipo_pago(Long id_pago, String banco, String tipo, Double monto) {
        this.id_pago = id_pago;
        this.banco = banco;
        this.tipo = tipo;
        this.monto = monto;
    }

    public Long getId_pago() {
        return id_pago;
    }

    public String getBanco() {
        return banco;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getMonto() {
        return monto;
    }
}
