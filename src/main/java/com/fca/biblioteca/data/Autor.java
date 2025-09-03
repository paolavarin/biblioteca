package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @Column(length = 32)
    private String id;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    protected Autor() {}
    public Autor(String id, String nombreCompleto) {
        this.id = id; this.nombreCompleto = nombreCompleto;
    }

    public String getId() { return id; }
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }
}
