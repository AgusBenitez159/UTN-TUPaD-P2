package casopractico7;

import java.util.ArrayList;

public class CasoPractico7 {
    public static void main(String[] args) {
        System.out.println("=== KATA 1: VEHÍCULOS Y HERENCIA BÁSICA ===");
        probarKata1();
        
        System.out.println("\n=== KATA 2: FIGURAS GEOMÉTRICAS Y MÉTODOS ABSTRACTOS ===");
        probarKata2();
        
        System.out.println("\n=== KATA 3: EMPLEADOS Y POLIMORFISMO ===");
        probarKata3();
        
        System.out.println("\n=== KATA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ===");
        probarKata4();
    }
    
    public static void probarKata1() {
        // Upcasting implícito
        Vehiculo miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo(); // Llama al método sobrescrito de Auto
        
        // También podemos usar el tipo específico
        Auto otroAuto = new Auto("Ford", "Fiesta", 3);
        otroAuto.mostrarInfo();
    }
    
    public static void probarKata2() {
        // Array de Figuras (polimorfismo)
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo A", 5.0);
        figuras[1] = new Rectangulo("Rectángulo B", 4.0, 6.0);
        figuras[2] = new Circulo("Círculo C", 3.5);
        
        // Calcular áreas usando polimorfismo
        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
    
    public static void probarKata3() {
        // Lista de empleados (polimorfismo)
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana García", "EP001", 50000, 5));
        empleados.add(new EmpleadoTemporal("Carlos López", "ET001", 1500, 40));
        empleados.add(new EmpleadoPlanta("María Rodríguez", "EP002", 45000, 2));
        empleados.add(new EmpleadoTemporal("Juan Pérez", "ET002", 1200, 35));
        
        // Calcular sueldos usando polimorfismo
        double totalSueldos = 0;
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            totalSueldos += empleado.calcularSueldo();
            
            // Uso de instanceof
            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
            }
        }
        
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Total empleados planta: " + contadorPlanta);
        System.out.println("Total empleados temporales: " + contadorTemporal);
        System.out.println("Total sueldos: $" + totalSueldos);
        
        // Demostración de downcasting
        System.out.println("\n--- Downcasting ---");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                EmpleadoPlanta planta = (EmpleadoPlanta) empleado; // Downcasting
                System.out.println(planta.getNombre() + " - Años antigüedad: " + planta.getAnosAntiguedad());
            }
        }
    }
    
    public static void probarKata4() {
        // Lista de animales (polimorfismo)
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Mimi"));
        animales.add(new Vaca("Lola"));
        animales.add(new Perro("Fido"));
        animales.add(new Gato("Garfield"));
        
        // Mostrar sonidos usando polimorfismo
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido(); // Llama al método sobrescrito de cada subclase
            System.out.println();
        }
    }
}