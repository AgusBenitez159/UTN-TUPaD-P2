package casopractico3;

import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    // Agregar curso con sincronización bidireccional
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
            System.out.println("Curso " + c.getNombre() + " agregado al profesor " + nombre);
        }
    }
    
    // Eliminar curso con sincronización bidireccional
    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            // Sincronizar el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
            System.out.println("Curso " + c.getNombre() + " eliminado del profesor " + nombre);
        }
    }
    
    // Listar cursos del profesor
    public void listarCursos() {
        System.out.println("\n=== CURSOS DEL PROFESOR " + nombre.toUpperCase() + " ===");
        if (cursos.isEmpty()) {
            System.out.println("No tiene cursos asignados.");
            return;
        }
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getCodigo() + ": " + curso.getNombre());
        }
    }
    
    // Mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | ID: " + id + 
                          " | Especialidad: " + especialidad + " | Cursos: " + cursos.size());
    }
    
    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public ArrayList<Curso> getCursos() { return cursos; }
}
