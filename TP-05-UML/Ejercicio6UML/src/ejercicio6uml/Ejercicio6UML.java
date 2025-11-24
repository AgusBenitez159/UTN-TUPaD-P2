
package ejercicio6uml;


public class Ejercicio6UML {

 
    public static void main(String[] args) {

         // Crear objetos independientes
        Cliente cliente = new Cliente("Roberto Diaz", "11-2345-6789");
        Mesa mesa = new Mesa(5, 4);
        
        // Reserva recibe los objetos (asociación + agregación)
        Reserva reserva = new Reserva("2024-03-20", "20:30", cliente, mesa);
        
        // Verificar relaciones
        System.out.println("Reserva para: " + reserva.getCliente().getNombre());
        System.out.println("Telefono: " + reserva.getCliente().getTelefono());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva.getMesa().getCapacidad() + " personas");
        
        
        
        
        
    }
    
}
