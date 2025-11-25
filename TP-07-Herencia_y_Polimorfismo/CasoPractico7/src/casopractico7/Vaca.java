package casopractico7;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre, "Vaca");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuu muu!");
    }
}
