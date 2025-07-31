# Git Internals

## ¿Qué hay detrás de Git?

Git no es solo una herramienta de control de versiones. Internamente, está diseñado como un sistema de archivos con historial. Entender cómo funciona por dentro te ayuda a usarlo con mayor confianza y a resolver problemas complejos.

---

## 1. Estructura Interna

### Objetos fundamentales:
Git está basado en 4 tipos de objetos:

- **Blob**: Contiene el contenido de un archivo.
- **Tree**: Representa un directorio, puede apuntar a blobs y a otros trees.
- **Commit**: Es una instantánea del proyecto, apunta a un tree y guarda metadatos (autor, mensaje, etc.).
- **Tag**: Marca un commit con un nombre legible.

Estos objetos son almacenados en `.git/objects/`.

---

## 2. SHA-1: El identificador único

Cada objeto es referenciado por un hash SHA-1, un código de 40 caracteres que representa de forma única su contenido.

> Si cambias un solo carácter en un archivo, su hash cambiará completamente.

---

## 3. Zona de staging (`index`)

Cuando haces `git add`, Git no guarda todavía en el repositorio, sino que lo coloca en el "staging area", un área intermedia antes del commit. Este área se encuentra en `.git/index`.

---

## 4. Referencias y ramas

Las ramas no son más que punteros a commits.

- El archivo `.git/HEAD` apunta a la rama activa.
- Las ramas viven en `.git/refs/heads/`.
- Los tags viven en `.git/refs/tags/`.

---

## 5. Historial como grafo

Git modela su historial como un **grafo dirigido acíclico (DAG)** donde cada commit apunta a su commit padre (o padres si es un merge).

Esto permite:

- Revertir cambios fácilmente.
- Navegar entre ramas y commits.
- Detectar diferencias con rapidez.

---

## 6. Archivos importantes en `.git/`

- `.git/HEAD`: Rama activa.
- `.git/config`: Configuración local.
- `.git/index`: Área de staging.
- `.git/refs/`: Contiene referencias a ramas y tags.
- `.git/objects/`: Donde viven los objetos de Git.

---

## 7. ¿Qué pasa cuando haces...?

### `git init`
Crea el directorio `.git/` y la estructura base.

### `git add`
Calcula el hash SHA-1 del archivo, guarda un blob y lo agrega al index.

### `git commit`
Crea un objeto commit que referencia los trees y blobs, y lo guarda en `.git/objects`.

### `git checkout`
Cambia el puntero `HEAD` a otro commit o rama, y actualiza el contenido del working directory.

---

## 8. Inspecciona internamente

Puedes explorar el interior de Git con comandos como:

```bash
git cat-file -p <hash>
git ls-tree <commit>
git log --graph --oneline
```

---

## Conclusión

Git es poderoso porque su diseño interno es simple pero muy eficiente. Comprender cómo funciona detrás de escena te ayuda a dominarlo y a evitar errores graves en entornos colaborativos o profesionales.
