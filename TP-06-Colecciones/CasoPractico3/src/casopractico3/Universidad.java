package casopractico3;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    // 1. Agregar profesor
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        }
    }
    
    // 2. Agregar curso
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        }
    }
    
    // 3. Asignar profesor a curso
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
            return true;
        }
        return false;
    }
    
    // 4. Listar profesores
    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE LA UNIVERSIDAD ===");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    
    // 5. Listar cursos
    public void listarCursos() {
        System.out.println("\n=== CURSOS DE LA UNIVERSIDAD ===");
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    
    // 6. Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    // 7. Buscar curso por código
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    // 8. Eliminar curso
    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con profesor si existe
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + curso.getNombre());
            return true;
        }
        return false;
    }
    
    // 9. Eliminar profesor
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null en todos sus cursos
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + profesor.getNombre());
            return true;
        }
        return false;
    }
    
    // 10. Reporte: cantidad de cursos por profesor
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CURSOS POR PROFESOR ===");
        for (Profesor profesor : profesores) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
        }
    }
}
