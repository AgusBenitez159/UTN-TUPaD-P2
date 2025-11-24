
package ejercicio14uml;


public class Ejercicio14UML {


    public static void main(String[] args) {

         Proyecto proyecto = new Proyecto("Documental Naturaleza", 120);
        
        // EditorVideo crea Render temporalmente (dependencia de creación)
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto);
       
    }
    
}
