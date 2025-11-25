package casopractico7;

public abstract class Figura {
    protected String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea() {
        System.out.println(nombre + " - Área: " + calcularArea());
    }
    
    public String getNombre() { return nombre; }
}