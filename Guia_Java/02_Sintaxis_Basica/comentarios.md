# Comentarios en Java

Los comentarios en Java se utilizan para **documentar el código** y hacer que sea más fácil de entender para otros desarrolladores (o para ti mismo en el futuro).  
Java ofrece tres tipos principales de comentarios.

---

## 1. Comentarios de una sola línea

Usan `//` al inicio. Todo el texto después de `//` se ignora por el compilador.

```java
// Esto es un comentario de una sola línea
int numero = 5; // También puede ir al final de una línea de código
```

---

## 2. Comentarios de varias líneas

Usan `/*` para comenzar y `*/` para cerrar. Todo el texto dentro se ignora por el compilador.

```java
/*
   Esto es un comentario
   que abarca
   varias líneas
*/
int numero = 10;
```

---

## 3. Comentarios de documentación (Javadoc)

Usan `/**` para comenzar y `*/` para cerrar.  
Son procesados por la herramienta `javadoc` para generar documentación HTML.

```java
/**
 * Clase que representa un ejemplo de comentarios
 * @author TuNombre
 * @version 1.0
 */
public class Ejemplo {
    /**
     * Método principal que imprime un mensaje.
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        System.out.println("Hola con comentarios!");
    }
}
```

---

## Buenas prácticas

- Comenta **el porqué**, no lo obvio.
- Mantén los comentarios actualizados para evitar confusión.
- Usa **Javadoc** para clases y métodos públicos.

```

