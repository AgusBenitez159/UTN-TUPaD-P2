package ejercicio1uml;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    // CONSTRUCTOR CORREGIDO - recibe datos para crear la Foto
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // COMPOSICIÓN
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    public String getNumero() { 
        return numero; 
    }
    
    public String getFechaEmision() { 
        return fechaEmision; 
    }
    
    public Foto getFoto() { 
        return foto; 
    }
    
    public Titular getTitular() { 
        return titular; 
    }
}
