package trabajopractico8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable, Notificable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;
    
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        notificar("Producto agregado: " + producto.getNombre());
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar("Estado del pedido cambiado a: " + nuevoEstado);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    @Override
    public void notificar(String mensaje) {
        cliente.notificar(mensaje);
    }
    
    // Getters
    public List<Producto> getProductos() { return productos; }
    public Cliente getCliente() { return cliente; }
    public String getEstado() { return estado; }
}