package trabajopractico8;

import java.util.Scanner;

public class TrabajoPractico8 {
    public static void main(String[] args) {
        System.out.println("=== PARTE 1: SISTEMA E-COMMERCE CON INTERFACES ===\n");
        probarSistemaEcommerce();
        
        System.out.println("\n=== PARTE 2: MANEJO DE EXCEPCIONES ===\n");
        probarManejoExcepciones();
    }
    
    public static void probarSistemaEcommerce() {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        
        // Crear productos
        Producto producto1 = new Producto("Laptop", 150000);
        Producto producto2 = new Producto("Mouse", 15000);
        Producto producto3 = new Producto("Teclado", 20000);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("\nTotal del pedido: $" + total);
        
        // Procesar pagos
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Perez");
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);
        
        PayPal paypal = new PayPal("juan@email.com");
        paypal.procesarPago(total);
        
        // Cambiar estado del pedido
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
        
        // Demostrar polimorfismo con interfaces
        System.out.println("\n--- Polimorfismo con Interfaces ---");
        Pagable[] pagables = {producto1, pedido};
        for (Pagable pagable : pagables) {
            System.out.println("Total: $" + pagable.calcularTotal());
        }
    }
    
    public static void probarManejoExcepciones() {
        Scanner scanner = new Scanner(System.in);
        
        // 1. División segura
        System.out.println("1. DIVISION SEGURA");
        System.out.println("10 / 2 = " + ManejadorExcepciones.divisionSegura(10, 2));
        System.out.println("10 / 0 = " + ManejadorExcepciones.divisionSegura(10, 0));
        
        // 2. Conversión de cadena a número
        System.out.println("\n2. CONVERSION DE CADENA A NUMERO");
        System.out.println("Convertir '123': " + ManejadorExcepciones.convertirANumero("123"));
        System.out.println("Convertir 'abc': " + ManejadorExcepciones.convertirANumero("abc"));
        
        // 3. Lectura de archivo
        System.out.println("\n3. LECTURA DE ARCHIVO");
        ManejadorExcepciones.leerArchivo("archivo_inexistente.txt");
        
        // 4. Excepción personalizada
        System.out.println("\n4. EXCEPCION PERSONALIZADA - VALIDACION DE EDAD");
        try {
            ManejadorExcepciones.validarEdad(25);
            ManejadorExcepciones.validarEdad(150); // Esto lanzará excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }
        
        // 5. Try-with-resources
        System.out.println("\n5. TRY-WITH-RESOURCES");
        ManejadorExcepciones.leerArchivoConRecursos("archivo_inexistente.txt");
        
        scanner.close();
    }
}
