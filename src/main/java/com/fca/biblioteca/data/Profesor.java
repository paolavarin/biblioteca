package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor extends Persona {

    @Column(length = 64)
    private String departamento;

    protected Profesor() {}
    public Profesor(String id, String apellido, String nombre) {
        super(id, apellido, nombre);
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}


