
package ejercicio7uml;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;        // Agregación
    private Conductor conductor; // Asociación bidireccional
    
    // Agregación: recibe motor ya creado
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }
}
