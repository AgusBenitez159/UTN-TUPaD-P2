package actividad.de.cierre.unidad.pkg04.programación.orientada.a.objetos.ii;


public class ActividadDeCierreUnidad04ProgramaciónOrientadaAObjetosII {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado(1, "Ana Garcia", "Desarrollador", 2500.0);
        Empleado empleado2 = new Empleado(2, "Carlos Lopez", "Gerente", 4000.0);

         // Constructor solo con nombre y puesto
        Empleado empleado3 = new Empleado("Maria Rodriguez", "Analista");
        Empleado empleado4 = new Empleado("Pedro Sanchez", "Diseniador");
        
        // Aplicar métodos actualizarSalario() sobre distintos empleados
        
        // Aumento por porcentaje
        System.out.println("=== ANTES DEL AUMENTO POR PORCENTAJE ===");
        System.out.println(empleado1);
        empleado1.actualizarSalario(10.0); // 10% de aumento
        System.out.println("=== DESPUES DEL AUMENTO POR PORCENTAJE ===");
        System.out.println(empleado1);
        
        System.out.println();
        
        // Aumento por cantidad fija
        System.out.println("=== ANTES DEL AUMENTO FIJO ===");
        System.out.println(empleado3);
        empleado3.actualizarSalario(500); // $500 de aumento
        System.out.println("=== DESPUES DEL AUMENTO FIJO ===");
        System.out.println(empleado3);
        
        System.out.println();
        
        // Imprimir información de todos los empleados con toString()
        System.out.println("=== LISTA COMPLETA DE EMPLEADOS ===");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        
        System.out.println();
        
        // Mostrar el total de empleados creados
        System.out.println("=== TOTAL DE EMPLEADOS ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probar algunos getters y setters (encapsulamiento)
        System.out.println();
        System.out.println("=== PRUEBA DE ENCAPSULAMIENTO ===");
        System.out.println("Nombre del empleado 2: " + empleado2.getNombre());
        empleado2.setSalario(4500.0);
        System.out.println("Nuevo salario del empleado 2: $" + empleado2.getSalario());
    }
}
        
        
        
        
