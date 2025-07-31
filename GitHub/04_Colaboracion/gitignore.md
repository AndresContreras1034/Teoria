# ¿Qué es `.gitignore` y cómo se usa?

El archivo `.gitignore` le indica a Git qué archivos o carpetas **no deben incluirse** en el control de versiones. Es útil para evitar subir archivos temporales, configuraciones locales, contraseñas o archivos generados automáticamente.

---

## 1. Crear un archivo `.gitignore`

Simplemente crea un archivo llamado `.gitignore` en la raíz del repositorio:
```bash
touch .gitignore
```

Luego edítalo con los nombres o rutas de los archivos/directorios que deseas ignorar.

---

## 2. Ejemplos comunes

```
# Ignorar archivos de sistema
.DS_Store
Thumbs.db

# Ignorar entornos virtuales
venv/
env/

# Ignorar archivos compilados
*.class
*.o
*.pyc

# Ignorar carpetas de dependencias
node_modules/
__pycache__/

# Ignorar configuraciones personales
*.log
*.env
.idea/
.vscode/
```

---

## 3. Importante: Git solo ignora archivos no rastreados

Si ya añadiste un archivo a Git antes de ponerlo en `.gitignore`, seguirá siendo rastreado. Para dejar de rastrearlo:

```bash
git rm --cached archivo.txt
```

---

## 4. Usar plantillas predefinidas

Puedes encontrar archivos `.gitignore` preconfigurados para distintos lenguajes en:

🔗 https://github.com/github/gitignore

Ejemplo para Node.js, Python, Java, etc.

---

## 5. Ignorar globalmente (opcional)

Puedes configurar un `.gitignore` global que se aplique a todos tus repositorios:

```bash
git config --global core.excludesfile ~/.gitignore_global
```

Luego crea ese archivo:
```bash
touch ~/.gitignore_global
```

---

Usar `.gitignore` es esencial para mantener tu repositorio limpio, seguro y profesional.
