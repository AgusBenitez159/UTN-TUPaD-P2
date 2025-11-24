
package ejercicio6uml;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;     // Asociación unidireccional
    private Mesa mesa;          // Agregación
    
    // Asociación unidireccional + Agregación
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;  // Recibe cliente ya creado
        this.mesa = mesa;        // Recibe mesa ya creada
    }
    
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }
}
