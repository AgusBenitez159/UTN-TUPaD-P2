
package ejercicio3uml;


public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;        // Asociación unidireccional
    private Editorial editorial; // Agregación
    
    // Asociación unidireccional + Agregación
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;        // Recibe autor ya creado
        this.editorial = editorial; // Recibe editorial ya creada
    }
    
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
}
