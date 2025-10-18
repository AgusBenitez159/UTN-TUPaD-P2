package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;

public class NaveEspacial {

    private final String nombre;
    private double combustible;

    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void mostrarEstado() {
        System.out.println("Estado de la nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/100");
    }

    public void despegar() {

        if (combustible >= 10) {
            System.out.println("Despegando!!");
            combustible -= 10;
        } else {
            System.out.println("ERROR FATAL: El combustible es insuficiente para despegar");
        }
    }

    public void avanzar(double distancia) {

        if (combustible - distancia * 2 >= 0) {
            System.out.println("Avanzando "+distancia+" unidades");
            combustible -= distancia * 2;
        } else {
            System.out.println("El combustible es insuficiente para despegar");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= 100) {
            combustible+=cantidad;
            System.out.println("Se recargo el tanque correctamente!!");
            System.out.println("La cantidad actual de combustible es: "+combustible+"/100");
        }
        else{
            System.out.println("ERROR FATAL: El combustible no puede superar 100");
        
        }
        
        
    
    }
    
    
}


