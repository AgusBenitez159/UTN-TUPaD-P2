package trabajopractico8;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de " + titular + " - Monto: $" + monto);
        // Simulación de procesamiento exitoso
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento para tarjeta de crédito
        double descuento = monto * 0.05;
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }
    
    // Getters
    public String getNumeroTarjeta() { return numeroTarjeta; }
    public String getTitular() { return titular; }
}