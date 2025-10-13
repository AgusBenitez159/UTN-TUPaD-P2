package actividad.de.cierre.unidad.pkg02.programacion.estructurada;

import java.util.Scanner;

public class ActividadDeCierreUnidad02ProgramacionEstructurada {

    private static final double DESCUENTO_ESPECIAL = 0.10; // EJERCICIO 11, DECLARANDO UNA VARIABLE GLOBAL

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ejercicios - elige el ejercicio (1 al 13)");
        int opcion = Integer.parseInt(input.nextLine());

        while (opcion < 1 || opcion > 13) {
            System.out.println("ERROR: ELIGE UN EJERCICIO DEL 1 AL 13");
            opcion = Integer.parseInt(input.nextLine());
        }

        switch (opcion) {
            case 1 ->
                ejercicio1();
            case 2 ->
                ejercicio2();
            case 3 ->
                ejercicio3();
            case 4 ->
                ejercicio4();
            case 5 ->
                ejercicio5();
            case 6 ->
                ejercicio6();
            case 7 ->
                ejercicio7();
            case 8 ->
                ejercicio8();
            case 9 ->
                ejercicio9();
            case 10 ->
                ejercicio10();
            case 11 ->
                ejercicio11();
            case 12 ->
                ejercicio12();
            case 13 ->
                ejercicio13();
            default ->
                System.out.println("Opcion invalida");
        }

    }

    /*Ejercicio 01. Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.*/
    private static void ejercicio1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int año = Integer.parseInt(input.nextLine());

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {

            System.out.println(año + " no es un año bisiesto.");
        }
    }

    /*Ejercicio 02. Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor*/
    private static void ejercicio2() {
        Scanner input = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            int numero = Integer.parseInt(input.nextLine());
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El mayor numero ingresado fue: " + mayor);
    }

    /*Ejercicio 03. Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"*/
    private static void ejercicio3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if (edad >= 1 && edad <= 12) {
            System.out.println("Eres un adolecente");
        } else if (edad <= 17) {
            System.out.println("Eres un adolecente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un adulto");
        } else if (edad >= 60) {
            System.out.println("Eres un adulto mayor");
        } else {
            System.out.println("Edad ingresada incorrecta");
        }

    }

    /*4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final*/
    private static void ejercicio4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese su categoria (A, B, C): ");
        char caracter = Character.toUpperCase(input.next().charAt(0));
        switch (caracter) {
            case 'A' ->
                System.out.println("El precio del producto es " + precio + " y el descuento es de 10%, dando un total de " + (precio - precio * 0.10));
            case 'B' ->
                System.out.println("El precio del producto es " + precio + " y el descuento es de 15%, dando un total de " + (precio - precio * 0.15));
            case 'C' ->
                System.out.println("El precio del producto es " + precio + " y el descuento es de 20%, dando un total de " + (precio - precio * 0.20));
        }

    }

    /*5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados
     */
    private static void ejercicio5() {
        Scanner input = new Scanner(System.in);
        int bandera = 0;
        int contadorPares = 0;
        while (bandera == 0) {
            System.out.println("Ingrese un número (0 para terminar): ");
            int numero = Integer.parseInt(input.nextLine());

            if (numero == 0) {
                bandera += 1;
            } else if (numero % 2 == 0) {
                contadorPares += numero;
            }

        }
        System.out.println("La suma de los numeros pares es: " + contadorPares);
    }

    /*6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.*/
    private static void ejercicio6() {
        Scanner input = new Scanner(System.in);
        int negativos = 0;
        int ceros = 0;
        int positivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            int numero = Integer.parseInt(input.nextLine());
            if (numero < 0) {
                negativos += 1;
            } else if (numero > 0) {
                positivos += 1;
            } else {
                ceros += 1;
            }
        }
        System.out.println("La cantidad de positivos es: " + positivos);
        System.out.println("La cantidad de negativos es: " + negativos);
        System.out.println("La cantidad de ceros es: " + ceros);
    }

    /*7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.*/
    private static void ejercicio7() {
        Scanner input = new Scanner(System.in);
        int nota = 0;
        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es: " + nota);

    }

    /*8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce.
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final. */
    private static void ejercicio8() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(input.nextLine());

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }
// FUNCION QUE ES PARTE DEL EJERCICIO 8

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }

    /* 9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.*/
    private static void ejercicio9() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el peso del paquete: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona del envio (nacional o internacional): ");
        String zona = input.nextLine();

        double precioEnvio = calcularCostoEnvio(peso, zona);
        double precioTotal = calcularTotalCompra(precio, precioEnvio);

        System.out.println("El costo de envio es: " + precioEnvio);
        System.out.println("El costo total es: " + precioTotal);

    }

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("NACIONAL")) {
            return peso * 5;
        } else if ((zona.equalsIgnoreCase("INTERNACIONAL"))) {
            return peso * 10;
        } else {
            System.out.println("Zona no reconocida. Usando tarifa Nacional.");
            return peso * 5;
        }
    }

    public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }

    /* 10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.*/
    private static void ejercicio10() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el stock actual: ");
        int stock = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantVendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibidal: ");
        int cantRecibida = Integer.parseInt(input.nextLine());

        System.out.println("El stock actualizado es: " + actualizarStock(stock, cantVendida, cantRecibida));
    }

    public static double actualizarStock(int stock, int cantVendida, int cantRecibida) {
        return stock - cantVendida + cantRecibida;
    }

    /* 11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. 
Luego, crea un método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.*/
    private static void ejercicio11() {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = Integer.parseInt(input.nextLine());

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {

        double descuento = precio * DESCUENTO_ESPECIAL;
        descuentoAplicado(precio, descuento);
    }

    private static void descuentoAplicado(double precio, double descuento) {

        System.out.println("El descuento aplicado es: " + descuento);
        System.out.println("El precio final es: " + (precio - descuento));
    }

    /* 12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
     */
    private static void ejercicio12() {

        double[] precios = {199.9, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++) {
            double producto = precios[i];
            System.out.println("Precio " + (i + 1) + ": $" + producto);
        }
        precios[2] = 129.99;

        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++) {
            double producto = precios[i];
            System.out.println("Precio " + (i + 1) + ": $" + producto);

        }
    }
    
        /* 13. Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
     */
    
    
  
private static void ejercicio13() {
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
    System.out.println("Precios originales:");
    mostrarPreciosRecursivo(precios, 0);  
    
    // Modificar un producto
    precios[2] = 129.99;
    
    System.out.println("Precios modificados:");
    mostrarPreciosRecursivo(precios, 0);  
}

public static void mostrarPreciosRecursivo(double[] precios, int indice) {
    // CASO BASE
    if (indice >= precios.length) {
        return;
    }
    System.out.println("Precio: $" + precios[indice]);
    
    mostrarPreciosRecursivo(precios, indice + 1);
}
    
    
    
}
