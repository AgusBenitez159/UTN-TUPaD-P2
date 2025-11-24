
package ejercicio12uml;


public class Contribuyente {
    private String nombre;
    private String cuit;
    
    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }
    
    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }
}
