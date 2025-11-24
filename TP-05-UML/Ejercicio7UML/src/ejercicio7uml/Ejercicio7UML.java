
package ejercicio7uml;


public class Ejercicio7UML {


    public static void main(String[] args) {

          // Agregación: motor existe independientemente
        Motor motor = new Motor("Nafta", "MTR-12345");
        
        // Vehículo recibe el motor (agregación)
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);
        
        // Conductor
        Conductor conductor = new Conductor("Luis Martinez", "B12345678");
        
        // Establecer relación bidireccional
        vehiculo.setConductor(conductor);
        
        // Verificar
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehiculo del conductor: " + conductor.getVehiculo().getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
        
        
        
        
    }
    
}
