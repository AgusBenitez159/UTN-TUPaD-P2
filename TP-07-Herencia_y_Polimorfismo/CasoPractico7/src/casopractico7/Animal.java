package casopractico7;

public class Animal {
    protected String nombre;
    protected String tipo;
    
    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico");
    }
    
    public void describirAnimal() {
        System.out.println("Animal: " + nombre + " | Tipo: " + tipo);
    }
    
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
