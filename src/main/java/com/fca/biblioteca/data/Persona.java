package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persona")
public abstract class Persona {

    @Id
    @Column(length = 32)
    private String id;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String nombre;

    protected Persona() {}

    public Persona(String id, String apellido, String nombre) {
        this.id = id; this.apellido = apellido; this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}


