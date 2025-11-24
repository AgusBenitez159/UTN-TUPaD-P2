
package ejercicio2uml;

 
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // AGREGACIÓN
    private Usuario usuario;   // Asociación bidireccional
    
    // AGREGACIÓN: recibe la batería ya creada
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // No la crea, la recibe
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null) {
            usuario.setCelular(this); // Referencia inversa
        }
    }
    
    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
}
