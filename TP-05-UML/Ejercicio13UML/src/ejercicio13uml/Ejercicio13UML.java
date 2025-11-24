
package ejercicio13uml;


public class Ejercicio13UML {


    public static void main(String[] args) {

                // Crear usuario
        Usuario usuario = new Usuario("Ana Garcia", "ana@email.com");
        
        // GeneradorQR crea CódigoQR temporalmente (dependencia de creación)
        GeneradorQR generador = new GeneradorQR();
        generador.generar("https://www.ejemplo.com", usuario);
        

    }
    
}
