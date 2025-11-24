
package ejercicio8uml;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;  // Composición
    
    // COMPOSICIÓN: crea la firma digital
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Composición: crea la firma (que a su vez tiene agregación con usuario)
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }
}
