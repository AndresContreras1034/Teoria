
# Tipos de Java y su Ecosistema

Java no es solo un lenguaje de programación; su ecosistema incluye diferentes **tipos de aplicaciones**, herramientas de construcción y gestión de proyectos como **Maven**, **Ant** y **Gradle**, que permiten trabajar en entornos desde el escritorio hasta la nube.

---

## 1. Tipos de Java según su uso

### 1.1 Java SE (Standard Edition)
- Base del lenguaje Java.
- Contiene las bibliotecas y API estándar.
- Usado para aplicaciones de escritorio, utilidades y aprendizaje.
- Ejemplos: calculadoras, herramientas de línea de comandos.

### 1.2 Java EE / Jakarta EE (Enterprise Edition)
- Orientado a aplicaciones empresariales.
- Incluye APIs para **servlets**, **JSP**, **EJB**, **JPA** y **Web Services**.
- Ideal para sistemas bancarios, ERPs y plataformas web a gran escala.

### 1.3 Java ME (Micro Edition)
- Diseñado para dispositivos con recursos limitados.
- Usado en sistemas embebidos, teléfonos antiguos, IoT.

### 1.4 JavaFX
- Plataforma para crear interfaces gráficas modernas y ricas en multimedia.
- Reemplazo moderno de Swing.
- Compatible con aplicaciones de escritorio y móviles.

---

## 2. Herramientas de construcción y gestión de dependencias
En proyectos Java medianos o grandes, es común usar herramientas que automaticen la compilación, el empaquetado y la gestión de bibliotecas externas.

### 2.1 Maven
- Gestiona dependencias y ciclo de vida del proyecto.
- Usa un archivo `pom.xml` para la configuración.
- Repositorio principal: **Maven Central**.

Ejemplo básico `pom.xml`:
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.ejemplo</groupId>
    <artifactId>mi-app</artifactId>
    <version>1.0</version>
</project>
```

---

### 2.2 Ant
- Sistema de construcción basado en XML.
- Más flexible, pero requiere escribir más configuración manual.
- Ideal para tareas de compilación personalizadas.

Ejemplo básico `build.xml`:
```xml
<project name="MiProyecto" default="compilar">
    <target name="compilar">
        <javac srcdir="src" destdir="bin" />
    </target>
</project>
```

---

### 2.3 Gradle
- Combina lo mejor de Maven y Ant.
- Configuración en Groovy o Kotlin (`build.gradle` o `build.gradle.kts`).
- Rápido y muy personalizable.

Ejemplo básico `build.gradle`:
```groovy
plugins {
    id 'java'
}

group = 'com.ejemplo'
version = '1.0'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'junit:junit:4.13.2'
}
```

---

## 3. Comparativa de herramientas

| Herramienta | Lenguaje de configuración | Enfoque principal | Ventajas | Desventajas |
|-------------|---------------------------|-------------------|----------|-------------|
| Maven       | XML (`pom.xml`)            | Ciclo de vida predefinido | Estándar en empresas, integración con IDEs | Menos flexible que Gradle |
| Ant         | XML (`build.xml`)          | Tareas personalizadas | Muy flexible, simple para scripts | Configuración más extensa |
| Gradle      | Groovy/Kotlin              | Construcción moderna | Rápido, flexible, soporta Maven y Ant | Curva de aprendizaje inicial |

---

```

