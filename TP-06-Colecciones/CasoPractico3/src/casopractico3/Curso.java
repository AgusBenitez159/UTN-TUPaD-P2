package casopractico3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    // Set profesor con sincronización bidireccional
    public void setProfesor(Profesor nuevoProfesor) {
        // Remover de la lista del profesor anterior
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar nuevo profesor
        this.profesor = nuevoProfesor;
        
        // Agregar a la lista del nuevo profesor
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.agregarCurso(this);
        }
    }
    
    // Mostrar información del curso
    public void mostrarInfo() {
        String profesorNombre = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Profesor: " + profesorNombre);
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
}