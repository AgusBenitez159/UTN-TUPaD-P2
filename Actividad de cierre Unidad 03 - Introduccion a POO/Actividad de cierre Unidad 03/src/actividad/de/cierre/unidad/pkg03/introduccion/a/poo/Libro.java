package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;

public class Libro {

    private final String titulo;
    private final String autor;
    private double anioPublicacion;

    public Libro(String titulo, String autor, double anio) {

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anio;
    }

    // GETTERS
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getAnio() {
        return this.anioPublicacion;
    }

    public void cambiarAño(double anio) {
        if (anio > 0 && anio <= 2025) {
            this.anioPublicacion= anio;
        } else {
            System.out.println("Error: El anio debe ser entre 0 y 2025");
        }
    }

}
