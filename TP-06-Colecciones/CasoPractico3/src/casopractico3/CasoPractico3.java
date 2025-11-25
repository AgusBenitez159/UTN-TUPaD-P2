package casopractico3;

public class CasoPractico3 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA 3: UNIVERSIDAD (Bidireccional 1 a N) ===");
        probarSistemaUniversidad();
    }
    
    public static void probarSistemaUniversidad() {
        // 1. Crear universidad
        Universidad universidad = new Universidad("UTN");
        
        // 2. Crear profesores
        Profesor prof1 = new Profesor("PR001", "Ana García", "Programación");
        Profesor prof2 = new Profesor("PR002", "Carlos López", "Base de Datos");
        Profesor prof3 = new Profesor("PR003", "María Rodríguez", "Matemáticas");
        
        // 3. Crear cursos
        Curso curso1 = new Curso("C001", "Programación I");
        Curso curso2 = new Curso("C002", "Base de Datos");
        Curso curso3 = new Curso("C003", "Matemática Discreta");
        Curso curso4 = new Curso("C004", "Programación II");
        Curso curso5 = new Curso("C005", "Algoritmos");
        
        // 4. Agregar a universidad
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        // 5. Asignar profesores a cursos
        System.out.println("\n--- Asignando profesores a cursos ---");
        universidad.asignarProfesorACurso("C001", "PR001");
        universidad.asignarProfesorACurso("C002", "PR002");
        universidad.asignarProfesorACurso("C003", "PR003");
        universidad.asignarProfesorACurso("C004", "PR001");
        universidad.asignarProfesorACurso("C005", "PR001");
        
        // 6. Listar cursos y profesores
        universidad.listarCursos();
        universidad.listarProfesores();
        
        // 7. Mostrar cursos de cada profesor
        prof1.listarCursos();
        prof2.listarCursos();
        prof3.listarCursos();
        
        // 8. Cambiar profesor de un curso
        System.out.println("\n--- Cambiar profesor del curso C005 ---");
        universidad.asignarProfesorACurso("C005", "PR002");
        universidad.listarCursos();
        
        // 9. Eliminar curso
        System.out.println("\n--- Eliminar curso C003 ---");
        universidad.eliminarCurso("C003");
        
        // 10. Eliminar profesor
        System.out.println("\n--- Eliminar profesor PR003 ---");
        universidad.eliminarProfesor("PR003");
        
        // 11. Reporte final
        System.out.println("\n--- ESTADO FINAL ---");
        universidad.listarCursos();
        universidad.listarProfesores();
        universidad.mostrarReporteCursosPorProfesor();
    }
}
