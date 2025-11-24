
package ejercicio4uml;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;     // Asociación bidireccional
    private Banco banco;         // Agregación
    
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;      // Agregación: recibe banco ya creado
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjeta(this); // Referencia inversa
        }
    }
    
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
}
