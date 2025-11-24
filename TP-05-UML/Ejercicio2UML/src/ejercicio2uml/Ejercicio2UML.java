
package ejercicio2uml;


public class Ejercicio2UML {

 
    
    public static void main(String[] args) {
 
                // AGREGACIÓN: La batería existe independientemente
        Bateria bateria = new Bateria("Li-ion", 4000);
        
        // Celular recibe la batería (agregación)
        Celular celular = new Celular("123456789", "Samsung", "Galaxy S21", bateria);
        
        // Usuario
        Usuario usuario = new Usuario("Maria Garcia", "87654321");
        
        // Establecer relación bidireccional
        celular.setUsuario(usuario);
        
        // Verificar
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca());
        System.out.println("Bateria: " + celular.getBateria().getModelo());
        
        
        
        
    }
    
}
