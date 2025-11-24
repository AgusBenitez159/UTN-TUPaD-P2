
package ejercicio11uml;


public class Reproductor {
    // DEPENDENCIA DE USO: usa Canción como parámetro temporal
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Genero: " + cancion.getArtista().getGenero());
    }
}
