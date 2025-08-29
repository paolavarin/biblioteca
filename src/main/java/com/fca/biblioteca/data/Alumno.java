package com.fca.biblioteca.data;

public class Alumno extends Persona {
    private String numeroCuenta;

    public Alumno(String id, String apellido, String nombre, String numeroCuenta) {
        super(id, apellido, nombre);
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }
}

