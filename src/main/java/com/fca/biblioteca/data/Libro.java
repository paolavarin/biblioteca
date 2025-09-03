package com.fca.biblioteca.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")  // la tabla en la BD se llamará "libro"
public class Libro {

    @Id
    @Column(name = "id_libro", length = 32)  // clave primaria
    private String idLibro;

    @Column(nullable = false)
    private String titulo;

    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;

    private String editorial;
    private String edicion;

    @Column(unique = true)
    private String isbn;

    @Column(nullable = false)
    private int existencias;

    // Constructor vacío requerido por JPA
    protected Libro() {}

    // Constructor con parámetros para crear objetos manualmente
    public Libro(String idLibro, String titulo, Integer anioPublicacion,
                 String editorial, String edicion, String isbn, int existencias) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.edicion = edicion;
        this.isbn = isbn;
        this.existencias = existencias;
    }

    // Getters y Setters
    public String getIdLibro() { return idLibro; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Integer getAnioPublicacion() { return anioPublicacion; }
    public void setAnioPublicacion(Integer anioPublicacion) { this.anioPublicacion = anioPublicacion; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public String getEdicion() { return edicion; }
    public void setEdicion(String edicion) { this.edicion = edicion; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getExistencias() { return existencias; }
    public void setExistencias(int existencias) { this.existencias = existencias; }
}



