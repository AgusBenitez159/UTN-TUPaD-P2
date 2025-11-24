
package ejercicio13uml;


public class GeneradorQR {
    // DEPENDENCIA DE CREACIÓN: crea CódigoQR pero no lo guarda
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);  // Crea instancia temporal
        qr.mostrarInfo();
        // El objeto qr se destruye después del método
    }
}