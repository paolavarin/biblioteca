package com.fca.biblioteca.data;

public class Autor {
    private String id;
    private String nombreCompleto;

    public Autor(String id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    public String getId() { return id; }
    public String getNombreCompleto() { return nombreCompleto; }

    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
}
