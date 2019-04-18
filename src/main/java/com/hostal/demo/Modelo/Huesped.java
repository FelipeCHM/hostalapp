package com.hostal.demo.Modelo;

public class Huesped {
    private Long run;
    private Character digitoVerificador;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
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
