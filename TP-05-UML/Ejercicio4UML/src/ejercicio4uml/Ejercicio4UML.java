
package ejercicio4uml;


public class Ejercicio4UML {

   
    public static void main(String[] args) {
  
                // Crear banco (agregación)
        Banco banco = new Banco("Galicia", "30-12345678-9");
        
        // Crear tarjeta con agregación al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/25", banco);
        
        // Crear cliente
        Cliente cliente = new Cliente("Carlos Lopez", "30123456");
        
        // Establecer relación bidireccional
        tarjeta.setCliente(cliente);
        
        // Verificar
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
        
        
        
        
        
        
        
    }
    
}
