package com.fca.biblioteca.data;

public abstract class Persona {
    private String id;
    private String apellido;
    private String nombre;

    public Persona(String id, String apellido, String nombre) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getApellido() { return apellido; }
    public String getNombre() { return nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}

