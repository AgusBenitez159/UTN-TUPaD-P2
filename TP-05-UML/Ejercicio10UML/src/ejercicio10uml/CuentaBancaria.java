
package ejercicio10uml;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;  // Composición
    private Titular titular;       // Asociación bidireccional
    
    // COMPOSICIÓN: crea la clave de seguridad
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaModificacion);
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuenta(this);
        }
    }
    
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }
}
