package com.fca.biblioteca;

import com.fca.biblioteca.data.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class BibliotecaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotecaApplication.class, args);
    }

    @Bean
    CommandLineRunner demo(LibroRepository libroRepo,
                           AutorRepository autorRepo,
                           AutorLibroRepository autorLibroRepo,
                           PersonaRepository personaRepo,
                           PrestamoRepository prestamoRepo) {
        return args -> {
            // Evita duplicar datos si ya corriste antes
            if (libroRepo.count() == 0 && personaRepo.count() == 0 && autorRepo.count() == 0) {
                // 1) Autor y Libro
                Autor autor = autorRepo.save(new Autor("AUT-1", "Gabriel García Márquez"));
                Libro libro = libroRepo.save(new Libro(
                        "LIB-1", "Cien años de soledad", 1967,
                        "Sudamericana", "1a", "9780307474728", 3
                ));

                // 2) Relación Autor–Libro
                autorLibroRepo.save(new AutorLibro(autor, libro));

                // 3) Alumno (Persona) y un préstamo
                Persona alumno = personaRepo.save(new Alumno("ALU-1", "Damián", "Diego", "20231234"));
                prestamoRepo.save(new Prestamo(alumno, libro, LocalDate.now(), 14));

                System.out.println("✅ Datos de ejemplo insertados.");
            }

            // Mostrar lo que hay
            System.out.println("Autores: " + autorRepo.count());
            System.out.println("Libros: " + libroRepo.count());
            System.out.println("Personas: " + personaRepo.count());
            System.out.println("Préstamos: " + prestamoRepo.count());
        };
    }
}

