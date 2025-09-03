package com.fca.biblioteca.domain;

import com.fca.biblioteca.data.*;
import java.time.LocalDate;

public class PrestamoDomain {
    // Resta 1 existencia y crea el préstamo por 14 días
    public Prestamo registrarPrestamo(Libro libro, Persona persona) {
        libro.setExistencias(libro.getExistencias() - 1);
        return new Prestamo(persona, libro, LocalDate.now(), 14);
    }
}


