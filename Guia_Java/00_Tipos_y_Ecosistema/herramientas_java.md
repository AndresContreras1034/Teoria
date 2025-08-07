# Herramientas de Java y su Ecosistema

Java es un lenguaje de programación robusto, orientado a objetos y con un ecosistema muy amplio. Para trabajar de forma eficiente con Java, es importante conocer las herramientas esenciales que conforman su entorno de desarrollo.

---

## 1. JDK (Java Development Kit)
El **JDK** es el kit de desarrollo oficial para Java. Incluye:
- **Compilador (`javac`)**: Convierte código Java en bytecode.
- **JVM**: Máquina virtual para ejecutar el bytecode.
- **Bibliotecas estándar**.
- Herramientas adicionales como `javadoc` y `jar`.

**Descarga oficial:** [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)

---

## 2. JVM (Java Virtual Machine)
La **JVM** es la encargada de ejecutar el bytecode generado por el compilador Java.  
Características clave:
- Independencia de plataforma (“Write Once, Run Anywhere”).
- Gestión automática de memoria (Garbage Collector).
- Seguridad y aislamiento de procesos.

---

## 3. JRE (Java Runtime Environment)
El **JRE** es el entorno de ejecución para Java, incluye:
- La JVM.
- Bibliotecas estándar.
- Archivos de configuración.

> ⚠️ Desde Java 11, el JRE ya no se distribuye por separado; viene incluido en el JDK.

---

## 4. IDEs para Java
Los **IDEs** (Entornos de Desarrollo Integrado) facilitan la programación con herramientas de autocompletado, depuración y administración de proyectos.

| IDE              | Características destacadas                             | Sitio oficial |
|------------------|--------------------------------------------------------|---------------|
| IntelliJ IDEA    | Potente autocompletado, soporte para múltiples lenguajes| [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/) |
| Eclipse          | Muy usado en empresas, extensible con plugins           | [https://www.eclipse.org/](https://www.eclipse.org/) |
| NetBeans         | Soporte oficial de Oracle, integración con Maven y Ant  | [https://netbeans.apache.org/](https://netbeans.apache.org/) |
| VS Code          | Ligero y extensible, requiere instalar extensión Java   | [https://code.visualstudio.com/](https://code.visualstudio.com/) |

---

## 5. Herramientas de compilación y gestión de dependencias
En proyectos grandes, usar un gestor de dependencias ahorra tiempo y esfuerzo.

| Herramienta | Uso principal                              | Sitio oficial |
|-------------|--------------------------------------------|---------------|
| Maven       | Gestión de dependencias y ciclo de vida    | [https://maven.apache.org/](https://maven.apache.org/) |
| Gradle      | Compilación flexible, soporta Java/Kotlin  | [https://gradle.org/](https://gradle.org/) |
| Ant         | Scripts de compilación personalizables     | [https://ant.apache.org/](https://ant.apache.org/) |

---

## 6. Versiones de Java
Oracle y la comunidad publican nuevas versiones regularmente.  
Las versiones **LTS** (Long Term Support) reciben soporte extendido.

| Versión | Año de lanzamiento | Tipo de soporte |
|---------|--------------------|-----------------|
| Java 8  | 2014               | LTS             |
| Java 11 | 2018               | LTS             |
| Java 17 | 2021               | LTS             |
| Java 21 | 2023               | LTS             |

---

## 7. Repositorios y bibliotecas populares
- **Maven Central** → Repositorio principal de dependencias Java.
- **JitPack** → Permite usar proyectos de GitHub como dependencias.
- **Spring Framework** → Desarrollo rápido de aplicaciones Java empresariales.
- **JUnit** → Pruebas unitarias en Java.

---

