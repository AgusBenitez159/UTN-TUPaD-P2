package actividad.de.cierre.unidad.pkg04.programación.orientada.a.objetos.ii;

public class Empleado {
    // Atributos (encapsulados con private)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // CONTADOR ESTATICO
    
    // CONSTRUCTORES SOBRECARGADOS
    
    // Constructor 1: Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador estatico
    }
    
    // Constructor 2: Solo nombre y puesto (id automático, salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // ID automático basado en el contador
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++; // Incrementa el contador estático
    }
    
    // METODOS SOBRECARGADOS actualizarSalario
    
    // Versión 1: Recibe porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        double aumento = this.salario * (porcentaje / 100);
        this.salario += aumento;
    }
    
    // Versión 2: Recibe cantidad fija a aumentar
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }
    
    // MÉTODO toString()
    @Override
    public String toString() {
        return String.format("Empleado [ID: %d, Nombre: %s, Puesto: %s, Salario: $%.2f]", 
                           id, nombre, puesto, salario);
    }
    
    // MÉTODO ESTÁTICO
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // GETTERS Y SETTERS (Encapsulamiento)
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
