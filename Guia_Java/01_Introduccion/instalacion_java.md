# Instalación de Java

Para desarrollar y ejecutar programas en Java, es necesario instalar el **Java Development Kit (JDK)**, que incluye el compilador (`javac`), la máquina virtual de Java (JVM) y herramientas necesarias para el desarrollo.

---

## 1. Verificar si Java ya está instalado

Abre una terminal o consola y escribe:

```bash
java -version
```

Si Java está instalado, verás la versión actual.  
Si no lo está, aparecerá un mensaje indicando que el comando no se reconoce.

---

## 2. Descargar el JDK

- Página oficial de Oracle: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)  
- Alternativa de código abierto: [https://adoptium.net/](https://adoptium.net/)  

Asegúrate de descargar la versión apropiada para tu sistema operativo (Windows, macOS, Linux).

---

## 3. Instalar en Windows

1. Ejecuta el instalador descargado.
2. Sigue las instrucciones del asistente.
3. Durante la instalación, selecciona la opción para configurar las variables de entorno automáticamente (si está disponible).

### Configuración manual de variables de entorno en Windows
Si el instalador no las configura:
1. Abre **Panel de control → Sistema y seguridad → Sistema → Configuración avanzada del sistema**.
2. Haz clic en **Variables de entorno**.
3. En "Variables del sistema", busca `Path` y agrega la ruta a la carpeta `bin` de tu instalación de Java.  
   Ejemplo: `C:\Program Files\Java\jdk-21\bin`

---

## 4. Instalar en macOS

1. Descarga el `.dmg` desde la página oficial o usa **Homebrew**:
   ```bash
   brew install openjdk
   ```
2. Sigue las instrucciones en pantalla para enlazar la instalación con tu sistema.

---

## 5. Instalar en Linux

Dependiendo de la distribución:

**Ubuntu/Debian**
```bash
sudo apt update
sudo apt install default-jdk
```

**Fedora/RHEL**
```bash
sudo dnf install java-21-openjdk
```

---

## 6. Verificar la instalación

En cualquier sistema operativo, abre una terminal y ejecuta:

```bash
java -version
javac -version
```

Debes ver la versión instalada tanto de Java como del compilador `javac`.


