// EntradaScanner.java
// Ejemplo de lectura de datos desde la consola usando la clase Scanner

import java.util.Scanner; // Importamos la clase Scanner del paquete java.util

public class EntradaScanner {
    public static void main(String[] args) {

        // Crear un objeto Scanner para leer desde la entrada estándar (teclado)
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca su nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine(); // Lee una línea completa de texto

        // Solicitar al usuario que introduzca su edad
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt(); // Lee un número entero

        // Mostrar un mensaje usando los datos introducidos
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // Cerrar el Scanner para liberar recursos
        sc.close();
    }
}
```

