
package ejercicio8uml;


public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;  // Agregación
    
    // Agregación: recibe usuario ya creado
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }
    
    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }
}