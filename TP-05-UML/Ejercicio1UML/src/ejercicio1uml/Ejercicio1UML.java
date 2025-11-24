package ejercicio1uml;


public class Ejercicio1UML {


    public static void main(String[] args) {

                // Crear titular
        Titular titular = new Titular("Juan Pérez", "12345678");
        
        // Crear pasaporte - CORREGIDO
        Pasaporte pasaporte = new Pasaporte("AB123456", "2024-01-15", "foto.jpg", "JPEG");
        
        // Establecer relación bidireccional
        pasaporte.setTitular(titular);
        
        // Verificar
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
        System.out.println("Foto formato: " + pasaporte.getFoto().getFormato());
        
        
        
        
        
        
        
        
        
        
    }
    
}
