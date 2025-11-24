
package ejercicio11uml;


public class Ejercicio11UML {

 
    public static void main(String[] args) {

        // Crear artista y canción
        Artista artista = new Artista("The Beatles", "Rock");
        Cancion cancion = new Cancion("Hey Jude", artista);
        
        // Reproductor usa Canción temporalmente (dependencia)
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);  // Solo uso temporal, no guarda la canción
   
    }
    
}
