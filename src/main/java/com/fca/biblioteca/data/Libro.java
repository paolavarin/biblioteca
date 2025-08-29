package com.fca.biblioteca.data;

public class Libro {
    private String idLibro;          // identificador principal (diagrama)
    private String titulo;
    private Integer anioPublicacion;
    private String editorial;
    private String edicion;
    private String isbn;
    private int existencias;

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

    public String getIdLibro() { return idLibro; }
    public String getTitulo() { return titulo; }
    public Integer getAnioPublicacion() { return anioPublicacion; }
    public String getEditorial() { return editorial; }
    public String getEdicion() { return edicion; }
    public String getIsbn() { return isbn; }
    public int getExistencias() { return existencias; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnioPublicacion(Integer anioPublicacion) { this.anioPublicacion = anioPublicacion; }
    public void setEditorial(String editorial) { this.editorial = editorial; }
    public void setEdicion(String edicion) { this.edicion = edicion; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setExistencias(int existencias) { this.existencias = existencias; }
}


