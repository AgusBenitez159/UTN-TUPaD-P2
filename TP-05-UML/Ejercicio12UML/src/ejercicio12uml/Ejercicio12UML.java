
package ejercicio12uml;


public class Ejercicio12UML {

 
    public static void main(String[] args) {

                // Crear contribuyente e impuesto
        Contribuyente contribuyente = new Contribuyente("Empresa S.A.", "30-12345678-9");
        Impuesto impuesto = new Impuesto(10000.0, contribuyente);
        
        // Calculadora usa Impuesto temporalmente (dependencia)
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);  // Solo uso temporal

    }
    
}
