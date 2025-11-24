
package ejercicio8uml;


public class Ejercicio8UML {

   
    public static void main(String[] args) {
 
         // Crear usuario (para la agregación de FirmaDigital)
        Usuario usuario = new Usuario("Dr. Carlos Ruiz", "carlos.ruiz@email.com");
        
        // Documento crea FirmaDigital (composición) que usa Usuario (agregación)
        Documento documento = new Documento(
            "Contrato de Servicios", 
            "Este documento establece los términos del servicio...",
            "a1b2c3d4e5f6",
            "2024-03-20",
            usuario
        );
        
        // Verificar relaciones
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + documento.getFirma().getCodigoHash());
        System.out.println("Email: " + documento.getFirma().getUsuario().getEmail());
        
        
        
    }
    
}
