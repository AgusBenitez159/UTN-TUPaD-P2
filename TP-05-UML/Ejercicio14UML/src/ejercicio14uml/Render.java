
package ejercicio14uml;


public class Render {
    private String formato;
    private Proyecto proyecto;  // Asociación unidireccional
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
    
    public void procesar() {
        System.out.println("Renderizando proyecto: " + proyecto.getNombre());
        System.out.println("Duracion: " + proyecto.getDuracionMin() + " min");
        System.out.println("Formato: " + formato);
    }

}
