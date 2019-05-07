package com.hostal.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class Huesped {
    @Id
    @Column(name = "Run")
    @JoinColumn(name = "Run",referencedColumnName = "id_huesped",insertable = true)
    private Long run;
    @Column(name = "digitoVerificador")
    private Character digitoVerificador;
    @Column(name = "primerNombre")
    private String primerNombre;
    @Column(name = "SegundoNombre")
    private String segundoNombre;
    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;

    public Huesped(Long run, Character digitoVerificador, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String correo, String telefono) {
        this.run = run;
        this.digitoVerificador = digitoVerificador;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.telefono = telefono;
    }

    public long getRun() {
        return run;
    }

    public char getDigit(){
        return digitoVerificador;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
}
