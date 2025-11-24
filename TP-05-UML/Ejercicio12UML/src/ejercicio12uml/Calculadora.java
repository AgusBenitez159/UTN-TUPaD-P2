
package ejercicio12uml;


public class Calculadora {
    // DEPENDENCIA DE USO: usa Impuesto como parámetro temporal
    public void calcular(Impuesto impuesto) {
        double total = impuesto.getMonto() * 1.21; // + IVA
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIT: " + impuesto.getContribuyente().getCuit());
        System.out.println("Monto base: $" + impuesto.getMonto());
        System.out.println("Total con IVA: $" + total);
    }
}