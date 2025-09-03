package com.fca.biblioteca.data;

import jakarta.persistence.*;

@Entity
@Table(
        name = "autor_libro",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_autor", "id_libro"})
)
public class AutorLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_libro", referencedColumnName = "id_libro", nullable = false)
    private Libro libro;

    protected AutorLibro() {}
    public AutorLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }

    public Long getId() { return id; }
    public Autor getAutor() { return autor; }
    public Libro getLibro() { return libro; }
}




