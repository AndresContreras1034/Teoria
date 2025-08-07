// FlujoControl.java
// Ejemplos básicos de estructuras de control en Java

public class FlujoControl {
    public static void main(String[] args) {

        // Estructura condicional if-else
        int numero = 10;
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Estructura switch
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
        }

        // Bucle for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración " + i);
        }

        // Bucle while
        int contador = 3;
        while (contador > 0) {
            System.out.println("Cuenta regresiva: " + contador);
            contador--;
        }

        // Bucle do-while
        int x = 0;
        do {
            System.out.println("Valor de x: " + x);
            x++;
        } while (x < 3);
    }
}

