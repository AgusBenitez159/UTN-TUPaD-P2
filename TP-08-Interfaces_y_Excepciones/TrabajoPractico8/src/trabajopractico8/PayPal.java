package trabajopractico8;

public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal (" + email + ") - Monto: $" + monto);
        // Simulación de procesamiento exitoso
        return true;
    }
    
    // Getter
    public String getEmail() { return email; }
}
