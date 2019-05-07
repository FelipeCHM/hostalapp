package com.hostal.demo.Modelo;

import javax.persistence.*;

@Entity
@Table(name = "tipo_pago")
public class tipo_pago {
    @Id
    @Column(name = "id_pago")
    @JoinColumn(name = "id_pago",referencedColumnName = "id_tipopago",insertable = true,nullable = true)
    private Long id_pago;
    @Column(name = "banco")
    private String banco;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "monto")
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
