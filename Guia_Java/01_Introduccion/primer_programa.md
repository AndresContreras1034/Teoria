# Tu primer programa en Java

En este apartado crearemos y ejecutaremos un programa simple que muestre un mensaje en pantalla.  
Este ejemplo es fundamental para familiarizarte con la estructura de Java y el proceso de compilación/ejecución.

---

## Código de ejemplo

```java
// HolaMundo.java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, Java!");
    }
}
```

---

## Explicación del código

- **`public class HolaMundo`**: define una clase llamada `HolaMundo`.  
  El nombre debe coincidir exactamente con el nombre del archivo (`HolaMundo.java`).

- **`public static void main(String[] args)`**: método principal donde comienza la ejecución del programa.  
  - `public`: accesible desde cualquier lugar.  
  - `static`: no necesita crear un objeto para llamarse.  
  - `void`: no devuelve valor.  
  - `String[] args`: parámetros que pueden pasarse desde la línea de comandos.

- **`System.out.println("Hola, Java!");`**: imprime el texto `"Hola, Java!"` en la consola seguido de un salto de línea.

---

## Compilar y ejecutar

1. Guarda el archivo como `HolaMundo.java`.
2. Abre una terminal y navega hasta la carpeta donde guardaste el archivo.
3. Compila:
   ```bash
   javac HolaMundo.java
   ```
   Esto generará un archivo `HolaMundo.class`.
4. Ejecuta:
   ```bash
   java HolaMundo
   ```

Deberías ver en pantalla:
```
Hola, Java!
```

---

## Resumen

- Todo programa Java empieza en el método `main`.
- El nombre de la clase pública debe coincidir con el archivo `.java`.
- El ciclo básico es: **escribir → compilar → ejecutar**.
```

