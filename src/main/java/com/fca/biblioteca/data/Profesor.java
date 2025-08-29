package com.fca.biblioteca.data;

public class Profesor extends Persona {
    private String numeroTrabajador;

    public Profesor(String id, String apellido, String nombre, String numeroTrabajador) {
        super(id, apellido, nombre);
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNumeroTrabajador() { return numeroTrabajador; }
    public void setNumeroTrabajador(String numeroTrabajador) { this.numeroTrabajador = numeroTrabajador; }
}
