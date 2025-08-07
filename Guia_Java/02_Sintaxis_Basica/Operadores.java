// Operadores.java
// Ejemplos de operadores básicos en Java

public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10, b = 3;
        System.out.println("Suma: " + (a + b));       // 13
        System.out.println("Resta: " + (a - b));      // 7
        System.out.println("Multiplicación: " + (a * b)); // 30
        System.out.println("División: " + (a / b));   // 3 (entero)
        System.out.println("Módulo: " + (a % b));     // 1

        // Operadores de asignación
        int c = 5;
        c += 2; // c = c + 2
        System.out.println("Asignación += : " + c);

        // Operadores de comparación
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false

        // Operadores lógicos
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // Operadores de incremento y decremento
        int z = 5;
        System.out.println("z++: " + (z++)); // 5 (luego z = 6)
        System.out.println("++z: " + (++z)); // 7
        System.out.println("z--: " + (z--)); // 7 (luego z = 6)
        System.out.println("--z: " + (--z)); // 5
    }
}

