package com.fca.biblioteca.data;

import java.time.LocalDate;

public class Prestamo {
    private String idPersona;
    private String idLibro;
    private LocalDate fechaPrestamo;
    private int diasPrestamo;

    public Prestamo(String idPersona, String idLibro, LocalDate fechaPrestamo, int diasPrestamo) {
        this.idPersona = idPersona;
        this.idLibro = idLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.diasPrestamo = diasPrestamo;
    }

    public String getIdPersona() { return idPersona; }
    public String getIdLibro() { return idLibro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public int getDiasPrestamo() { return diasPrestamo; }

    public void setFechaPrestamo(LocalDate fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }
    public void setDiasPrestamo(int diasPrestamo) { this.diasPrestamo = diasPrestamo; }
}

