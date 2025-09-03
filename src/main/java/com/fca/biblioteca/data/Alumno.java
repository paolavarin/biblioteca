package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno extends Persona {

    @Column(name = "numero_cuenta", nullable = false, length = 32)
    private String numeroCuenta;

    protected Alumno() {}
    public Alumno(String id, String apellido, String nombre, String numeroCuenta) {
        super(id, apellido, nombre);
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }
}

