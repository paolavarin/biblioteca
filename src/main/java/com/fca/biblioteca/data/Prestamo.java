package com.fca.biblioteca.data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_libro", referencedColumnName = "id_libro", nullable = false)
    private Libro libro;

    @Column(name = "fecha_prestamo", nullable = false)
    private LocalDate fechaPrestamo = LocalDate.now();

    @Column(name = "fecha_devolucion")
    private LocalDate fechaDevolucion;

    @Column(name = "dias", nullable = false)
    private int dias = 14;

    protected Prestamo() {}

    public Prestamo(Persona persona, Libro libro, LocalDate fechaPrestamo, int dias) {
        this.persona = persona; this.libro = libro;
        this.fechaPrestamo = fechaPrestamo; this.dias = dias;
    }

    public Long getId() { return id; }
    public Persona getPersona() { return persona; }
    public Libro getLibro() { return libro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(LocalDate fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }
    public int getDias() { return dias; }
    public void setDias(int dias) { this.dias = dias; }
}


