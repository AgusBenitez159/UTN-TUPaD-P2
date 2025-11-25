package casopractico2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    // 1. Agregar libro
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }
    
    // 2. Listar todos los libros
    public void listarLibros() {
        System.out.println("\n=== LIBROS DE LA BIBLIOTECA " + nombre.toUpperCase() + " ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    // 3. Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    // 4. Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
            return true;
        }
        System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }
    
    // 5. Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    // 6. Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS DEL AÑO " + anio + " ===");
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay libros publicados en el año " + anio);
        }
    }
    
    // 7. Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES DISPONIBLES ===");
        Set<String> autoresMostrados = new HashSet<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresMostrados.contains(autor.getId())) {
                autor.mostrarInfo();
                autoresMostrados.add(autor.getId());
            }
        }
        if (autoresMostrados.isEmpty()) {
            System.out.println("No hay autores registrados.");
        }
    }
}