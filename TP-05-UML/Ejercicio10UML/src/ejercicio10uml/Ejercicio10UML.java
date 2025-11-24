package ejercicio10uml;

public class Ejercicio10UML {

 
    public static void main(String[] args) {
     
        // Crear cuenta con composición (crea clave seguridad)
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 50000.0, "1234", "2024-03-20");
        
        // Crear titular
        Titular titular = new Titular("Laura Fernandez", "35123456");
        
        // Establecer relación bidireccional
        cuenta.setTitular(titular);
        
        // Verificar
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Clave creada: " + cuenta.getClave().getUltimaModificacion());

  
    }

}
    

