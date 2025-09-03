package com.fca.biblioteca.domain;

import com.fca.biblioteca.data.Libro;
import java.util.List;

public class LibroDomain {
    public Libro buscarLibro(String idLibro, List<Libro> catalogo) {
        for (Libro l : catalogo) {
            if (l.getIdLibro().equals(idLibro)) return l;
        }
        return null;
    }
    public void actualizarExistencias(Libro libro, int nuevasExistencias) {
        libro.setExistencias(nuevasExistencias);
    }
}




