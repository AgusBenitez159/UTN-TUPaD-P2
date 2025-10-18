package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;

public class Estudiante {
    private final String nombre;
    private final String apellido;
    private final String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        if (this.calificacion + puntos <= 10) {
            this.calificacion += puntos;
        } else {
            System.out.println("Error: La nota maxima es 10");
        }
    }
    
    public void bajarCalificacion(double puntos) {
        if (this.calificacion - puntos >= 0) {
            this.calificacion -= puntos;
        } else {
            System.out.println("Error: La nota minima es 0");
        }
    }
}