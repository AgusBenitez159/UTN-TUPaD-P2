
package ejercicio14uml;


public class EditorVideo {
    // DEPENDENCIA DE CREACIÓN: crea Render pero no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);  // Crea instancia temporal
        render.procesar();
        // El objeto render se destruye después del método
    }
}
