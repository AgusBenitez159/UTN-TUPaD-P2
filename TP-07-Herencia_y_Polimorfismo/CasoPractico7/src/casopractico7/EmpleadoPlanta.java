package casopractico7;

public class EmpleadoPlanta extends Empleado {
    private double salarioBase;
    private int anosAntiguedad;
    
    public EmpleadoPlanta(String nombre, String id, double salarioBase, int anosAntiguedad) {
        super(nombre, id);
        this.salarioBase = salarioBase;
        this.anosAntiguedad = anosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioBase + (anosAntiguedad * 1000);
    }
    
    public double getSalarioBase() { return salarioBase; }
    public int getAnosAntiguedad() { return anosAntiguedad; }
}
