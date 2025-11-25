package casopractico2;

public class CasoPractico2 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA 2: BIBLIOTECA Y LIBROS ===");
        probarSistemaBiblioteca();
    }
    
    public static void probarSistemaBiblioteca() {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Central");
        
        // 2. Crear autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentina");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("ISBN003", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("ISBN004", "Crónica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("ISBN005", "Ficciones", 1944, autor2);
        
        // 4. Listar libros
        biblioteca.listarLibros();
        
        // 5. Buscar libro por ISBN
        System.out.println("\n--- Buscar libro ISBN003 ---");
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }
        
        // 6. Filtrar por año
        biblioteca.filtrarLibrosPorAnio(1949);
        
        // 7. Eliminar libro
        biblioteca.eliminarLibro("ISBN001");
        biblioteca.listarLibros();
        
        // 8. Cantidad total
        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        
        // 9. Mostrar autores
        biblioteca.mostrarAutoresDisponibles();
    }
}