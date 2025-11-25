package trabajopractico8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ManejadorExcepciones {
    
    // 1. División segura
    public static double divisionSegura(double dividendo, double divisor) {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("No se puede dividir por cero");
            }
            return dividendo / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
    
    // 2. Conversión de cadena a número
    public static int convertirANumero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un numero valido");
            return 0;
        }
    }
    
    // 3. Lectura de archivo
    public static void leerArchivo(String nombreArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    // 4. Excepción personalizada - Validar edad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad " + edad + " no es valida. Debe estar entre 0 y 120");
        }
        System.out.println("Edad valida: " + edad);
    }
    
    // 5. Try-with-resources
    public static void leerArchivoConRecursos(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Leyendo archivo con try-with-resources:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
