
package casopractico1;


public class CasoPractico1 {

  
    public static void main(String[] args) {

         System.out.println("=== SISTEMA 1: INVENTARIO DE PRODUCTOS ===");
        probarSistemaInventario();
    }
    
    public static void probarSistemaInventario() {
        Inventario inventario = new Inventario();
        
        // 1. Crear productos
        Producto p1 = new Producto("P001", "Arroz", 500, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Smartphone", 25000, 50, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Camisa", 1500, 200, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sillón", 28000, 20, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 300, 150, CategoriaProducto.ALIMENTOS);
        
        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar productos
        inventario.listarProductos();
        
        // 3. Buscar producto por ID
        System.out.println("\n--- Buscar producto P003 ---");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        
        // 4. Filtrar por categoría
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        
        // 5. Eliminar producto
        inventario.eliminarProducto("P001");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        inventario.actualizarStock("P002", 75);
        
        // 7. Total de stock
        System.out.println("\nTotal de stock: " + inventario.obtenerTotalStock());
        
        // 8. Producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.print("Producto con mayor stock: ");
            mayorStock.mostrarInfo();
        }
        
        // 9. Filtrar por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
    }
        
        
        
        
        
        
        
    }
