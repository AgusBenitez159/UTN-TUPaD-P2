package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;

public class Gallina {

    private final String idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(String idGallina, int edad, int huevos) {

        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevos;
    }

    public void mostrarEstado() {

        System.out.println("La gallina con id: "+ idGallina);
        System.out.println("Tiene: " + edad + " anios de edad");
        System.out.println("Y puso " + huevosPuestos + " huevos en total");
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println( idGallina + " puso un huevo mas, puso " + huevosPuestos + " en total");
    }

    public void envejecer() {
        edad++;
        System.out.println(idGallina + " cumplio un anio mas y tiene " + edad + " anios en total");
    }

}
