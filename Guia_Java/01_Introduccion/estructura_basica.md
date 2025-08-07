# Estructura básica de un programa en Java

En Java, todo programa comienza con una **clase** y un **método principal** (`main`).  
La estructura mínima de un archivo Java incluye:

1. **Declaración de la clase** (el nombre debe coincidir con el del archivo).
2. **Método `main`** como punto de entrada del programa.
3. **Instrucciones** que se ejecutan dentro del método `main`.

---

## Ejemplo de estructura mínima

```java
public class MiPrograma {
    public static void main(String[] args) {
        System.out.println("Hola, Mundo!");
    }
}
```

---

## Descripción de cada parte

- **`public class MiPrograma`**  
  - `public`: indica que la clase es accesible desde cualquier lugar.  
  - `class`: palabra clave para definir una clase.  
  - `MiPrograma`: nombre de la clase. Debe coincidir con el nombre del archivo `.java`.

- **`public static void main(String[] args)`**  
  - `public`: el método puede ser llamado por cualquier parte del programa.  
  - `static`: no requiere una instancia de la clase para ejecutarse.  
  - `void`: el método no devuelve ningún valor.  
  - `main`: nombre especial del método que la JVM busca como punto de inicio.  
  - `String[] args`: arreglo de cadenas para recibir argumentos desde la línea de comandos.

- **`System.out.println("Hola, Mundo!");`**  
  - Muestra el texto entre comillas en la consola y agrega un salto de línea.

---

## Reglas importantes
- El nombre de la clase pública debe coincidir exactamente con el nombre del archivo.
- Java es **case-sensitive**: `MiPrograma` y `miprograma` son diferentes.
- El archivo debe guardarse con la extensión `.java`.
- El método `main` es obligatorio para que la JVM sepa dónde empezar a ejecutar.

