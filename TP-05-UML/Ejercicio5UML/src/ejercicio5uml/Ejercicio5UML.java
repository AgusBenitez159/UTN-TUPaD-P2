package ejercicio5uml;


public class Ejercicio5UML {


    
    public static void main(String[] args) {

         // Crear computadora con composición (crea placa madre)
        Computadora compu = new Computadora("Exo", "SN123456", "B450", "AMD");
        
        // Crear propietario
        Propietario propietario = new Propietario("Ana Torres", "34123456");
        
        // Establecer relación bidireccional
        compu.setPropietario(propietario);
        
        // Verificar
        System.out.println("Propietario: " + compu.getPropietario().getNombre());
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
        System.out.println("Placa madre: " + compu.getPlacaMadre().getModelo());
        
        
        
        
        
        
    }
    
}
