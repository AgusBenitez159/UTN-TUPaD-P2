package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;

import java.util.Scanner;

public class ActividadDeCierreUnidad03IntroduccionAPOO {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
            
            if(opcion != 0) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
            }
        } while(opcion != 0);
        
        scanner.close();
    }
    
    public static void mostrarMenu() {
        System.out.println("\n=== TRABAJO PRACTICO 3 - POO ===");
        System.out.println("1. Ejercicio 1 - Estudiante");
        System.out.println("2. Ejercicio 2 - Mascota");
        System.out.println("3. Ejercicio 3 - Libros");
        System.out.println("4. Ejercicio 4 - Granja Digital");
        System.out.println("5. Ejercicio 5 - Nave Espacial");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opcion: ");
    }
    
    public static void ejercicio1() {
        System.out.println("=== EJERCICIO 1: ESTUDIANTE ===");
        
        Estudiante estudiante1 = new Estudiante("Ana", "Garcia", "Programacion II", 8.5);
        
        System.out.println("\n--- Informacion inicial ---");
        estudiante1.mostrarInfo();
        
        System.out.println("\n--- Subiendo calificacion en 1 ---");
        estudiante1.subirCalificacion(1.0);
        
        System.out.println("\n--- Bajando calificacion en 0.5 ---");
        estudiante1.bajarCalificacion(0.5);
        
        System.out.println("\n--- Resultado final ---");
        estudiante1.mostrarInfo();
        
        System.out.println("\n--- Probando validaciones ---");
        estudiante1.subirCalificacion(3.0);  // Intentar superar 10
        estudiante1.bajarCalificacion(12.0); // Intentar bajar a negativo
    }
    
    public static void ejercicio2() {
        System.out.println("\n\n=== EJERCICIO 2: MASCOTA ===");
        
        // Crear una mascota
        Mascota mascota1 = new Mascota("Rocky", "Perro", 3);
        
        // Mostrar informacion inicial
        System.out.println("\n--- Informacion inicial ---");
        mascota1.mostrarInfo();
        
        // Simular el paso del tiempo
        System.out.println("\n--- Pasan 2 anios ---");
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        
        // Mostrar estado final
        System.out.println("\n--- Estado final ---");
        mascota1.mostrarInfo();
    }
    
    public static void ejercicio3() {
        System.out.println("\n\n=== EJERCICIO 3: LIBROS===");
        
        Libro libro1 = new Libro ("Harry potter", "JK. Rowlin", 1998);
        
        // Mostrar informacion inicial
        System.out.println("\n--- Informacion inicial ---");
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAnio());
        
        System.out.println("\n--- Intentando anio invalido (-200) ---");
        libro1.cambiarAño(-200);
        
        System.out.println("\n--- Cambiando a anio valido (2007) ---");
        libro1.cambiarAño(2007);
        
        // Mostrar informacion final
        System.out.println("\n--- Informacion final ---");
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getAnio());
    }
    
    public static void ejercicio4() {
        System.out.println("\n\n=== EJERCICIO 4: GRANJA DIGITAL===");       
        
        Gallina gallina1 = new Gallina("G-001", 1, 1);
        Gallina gallina2 = new Gallina("G-002", 2, 3);
        
        System.out.println("\n--- Informacion inicial gallinas ---");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        
        System.out.println("\n--- Simulacion gallina 001 ---");
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        
        System.out.println("\n--- Simulacion gallina 002 ---");
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
         
        System.out.println("\n--- Informacion final gallinas ---");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
    }
    
    public static void ejercicio5() {
        System.out.println("\n\n=== EJERCICIO 5: NAVE ESPACIAL ===");
        
        // Crear una nave con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Halcon Milenario", 50);
        
        // Mostrar estado inicial
        System.out.println("\n--- Estado inicial ---");
        nave1.mostrarEstado();
        
        // Intentar avanzar sin recargar
        System.out.println("\n--- Intentando avanzar sin recargar ---");
        nave1.avanzar(30); // Necesita 60 combustible, solo tiene 50
        
        // Recargar combustible
        System.out.println("\n--- Recargando combustible ---");
        nave1.recargarCombustible(40);
        
        // Intentar superar limite al recargar
        System.out.println("\n--- Intentando superar limite ---");
        nave1.recargarCombustible(30); // Superaria 100
        
        // Avanzar correctamente
        System.out.println("\n--- Avanzando correctamente ---");
        nave1.avanzar(20);
        
        // Despegar
        System.out.println("\n--- Despegando ---");
        nave1.despegar();
        
        // Mostrar estado final
        System.out.println("\n--- Estado final ---");
        nave1.mostrarEstado();
    }
}   
         
         
         
         
         
         
         
         
         
  
    
    
    
    
    
    
    
