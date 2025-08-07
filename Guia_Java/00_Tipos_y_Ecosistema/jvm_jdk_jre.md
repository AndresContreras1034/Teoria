# JVM, JDK y JRE en Java

Java cuenta con un ecosistema compuesto por varias herramientas y entornos que trabajan juntos para compilar, ejecutar y mantener aplicaciones.  
Entre los más importantes están **JVM**, **JDK** y **JRE**.

---

## 1. JVM (Java Virtual Machine)

La **Java Virtual Machine** es la máquina virtual que ejecuta el **bytecode** generado por el compilador de Java.  
Su función principal es **abstraer el hardware y el sistema operativo**, permitiendo que el mismo programa Java pueda correr en cualquier plataforma.

**Características clave:**
- Independencia de plataforma (“Write Once, Run Anywhere”).
- Recolección automática de basura (**Garbage Collector**).
- Seguridad y aislamiento en la ejecución.
- Interpretación y compilación JIT (Just-In-Time).

**Proceso de ejecución:**
1. El código fuente `.java` se compila a **bytecode** (`.class`).
2. La JVM interpreta o compila ese bytecode en instrucciones de máquina.
3. El programa se ejecuta en el hardware.

---

## 2. JDK (Java Development Kit)

El **JDK** es el **kit de desarrollo** de Java, necesario para programar.  
Incluye:
- Compilador (`javac`).
- Herramientas como `javadoc` y `jar`.
- Bibliotecas estándar de Java.
- El JRE incluido.

**Descarga oficial:**  
[https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)

**Componentes del JDK:**
| Componente     | Descripción |
|----------------|-------------|
| `javac`        | Compilador que transforma `.java` en `.class`. |
| `java`         | Ejecuta aplicaciones Java. |
| `javadoc`      | Genera documentación en HTML a partir del código. |
| `jar`          | Empaqueta y comprime archivos `.class` en un solo archivo. |

## 3. JRE (Java Runtime Environment)

El **JRE** es el entorno de ejecución de Java. Contiene:
- La **JVM**.
- Librerías base de Java.
- Archivos de configuración.

> ⚠️ Desde **Java 11**, el JRE ya no se distribuye de forma separada; viene incluido dentro del JDK.

---

## 4. Diferencias clave

| Elemento | Incluye | Uso principal |
|----------|---------|--------------|
| **JVM** | Ejecutor de bytecode | Ejecutar programas Java. |
| **JRE** | JVM + librerías estándar | Ejecutar programas Java sin desarrollar. |
| **JDK** | JRE + compilador y herramientas | Desarrollar y ejecutar programas Java. |

---

## 5. Ejemplo práctico

**Verificar instalación:**
```bash
java -version
javac -version
// HolaMundo.java
```
## 6. Compilar y ejecutar un programa:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, Java!");
    }
}
