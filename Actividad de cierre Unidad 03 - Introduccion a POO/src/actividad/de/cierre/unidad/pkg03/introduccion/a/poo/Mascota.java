package actividad.de.cierre.unidad.pkg03.introduccion.a.poo;


public class Mascota {
    private final String nombre;
    private final String especie;
    private double edad;
    
 
    
   public Mascota(String nombre, String especie, double edad){
   
   this.nombre = nombre;
   this.especie = especie;
   this.edad = edad;
   }
    
       public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
       
       public void cumplirAnios() {
         edad ++;
         System.out.println(nombre+" cumplio " +edad+" anios, felicidades");  
           
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
