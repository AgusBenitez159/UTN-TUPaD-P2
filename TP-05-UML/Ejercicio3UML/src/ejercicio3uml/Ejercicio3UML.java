
package ejercicio3uml;


public class Ejercicio3UML {

   
    public static void main(String[] args) {

        
        // Crear objetos independientes
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Av. Corrientes 1234");
        
        // Libro recibe los objetos (asociación + agregación)
        Libro libro = new Libro("Cien anios de soledad", "978-8437604947", autor, editorial);
        
        // Verificar relaciones
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
        
        
    }
    
}
