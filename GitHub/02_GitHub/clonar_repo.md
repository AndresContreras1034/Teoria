# Clonar un repositorio de GitHub

Clonar un repositorio significa copiar un proyecto remoto (por ejemplo, desde GitHub) a tu máquina local, incluyendo todo su historial de versiones.

---

## 1. Copiar la URL del repositorio

Ve al repositorio en GitHub y haz clic en el botón **"Code"**. Copia la URL HTTPS o SSH, por ejemplo:

```
https://github.com/usuario/proyecto.git
```

---

## 2. Clonar el repositorio

Abre la terminal y ejecuta:
```bash
git clone https://github.com/usuario/proyecto.git
```

Esto creará una carpeta con el mismo nombre que el repositorio, y descargará todos los archivos y commits.

---

## 3. Entrar a la carpeta clonada
```bash
cd proyecto
```

---

## 4. Verificar la conexión remota
```bash
git remote -v
```

Deberías ver algo como:
```
origin  https://github.com/usuario/proyecto.git (fetch)
origin  https://github.com/usuario/proyecto.git (push)
```

---

## ¿Cuándo usar `git clone`?

- Cuando quieres colaborar en un proyecto ya existente.
- Cuando vas a trabajar en un proyecto propio desde otro computador.
- Cuando solo deseas estudiar el código de un repositorio público.

---

## ¿Qué incluye un clon?

- Todos los archivos del repositorio.
- Todo el historial de commits.
- Las ramas existentes.

---

Con `git clone` puedes empezar a trabajar sobre cualquier proyecto de manera local, sin necesidad de crearlo desde cero.

