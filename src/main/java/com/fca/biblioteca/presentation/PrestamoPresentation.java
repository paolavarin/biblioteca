package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.*;
import com.fca.biblioteca.domain.*;

import java.util.ArrayList;
import java.util.List;

public class PrestamoPresentation {
    public static void main(String[] args) {
        // Datos simples
        Autor autor = new Autor("AUT-1", "Gabriel García Márquez");
        Libro libro1 = new Libro("LIB-1", "Cien años de soledad", 1967, "Sudamericana", "1a", "978-0307474728", 2);

        List<Libro> catalogo = new ArrayList<>();
        catalogo.add(libro1);

        Alumno alumno = new Alumno("ALU-1", "Damián", "Diego", "20231234");

        // Dominios
        LibroDomain libroDomain = new LibroDomain();
        PrestamoDomain prestamoDomain = new PrestamoDomain();

        // Buscar y prestar
        Libro encontrado = libroDomain.buscarLibro("LIB-1", catalogo);

        if (encontrado != null && encontrado.getExistencias() > 0) {
            Prestamo p = prestamoDomain.registrarPrestamo(encontrado, alumno);
            System.out.println("Préstamo hecho del libro: " + p.getIdLibro());
            System.out.println("Existencias ahora: " + encontrado.getExistencias());
        } else {
            System.out.println("Libro no disponible");
        }
    }
}





