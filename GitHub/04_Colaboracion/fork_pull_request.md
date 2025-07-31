# Fork y Pull Request en GitHub

Cuando no tienes acceso directo para editar un repositorio (por ejemplo, un proyecto open source), puedes usar un **fork** y un **pull request** para proponer cambios.

---

## ¿Qué es un fork?

Un **fork** es una copia del repositorio original, pero en tu cuenta de GitHub. Esta copia es totalmente independiente y te permite experimentar libremente.

---

## ¿Qué es un pull request?

Un **pull request (PR)** es una solicitud para que los dueños del repositorio original revisen y consideren tus cambios. Si los aceptan, tu código se integrará al repositorio original.

---

## Flujo completo: fork + pull request

### 1. Hacer fork del repositorio
- Ve al repositorio original en GitHub.
- Haz clic en el botón **"Fork"** (arriba a la derecha).
- GitHub creará una copia en tu cuenta.

### 2. Clonar tu fork a tu PC
```bash
git clone https://github.com/tu_usuario/repositorio-forkeado.git
cd repositorio-forkeado
```

### 3. Crear una nueva rama para trabajar
```bash
git checkout -b nombre-de-tu-rama
```

### 4. Hacer cambios y commitearlos
```bash
# Editas archivos
git add .
git commit -m "Agrego nueva funcionalidad X"
```

### 5. Subir la rama a tu fork en GitHub
```bash
git push origin nombre-de-tu-rama
```

### 6. Crear el pull request
- Ve a tu repositorio en GitHub.
- Te aparecerá un mensaje para crear un **Pull Request** hacia el repositorio original.
- Agrega un título claro y explica qué hiciste.

---

## Mantener actualizado tu fork (opcional pero recomendado)

### 1. Agrega el repositorio original como remoto
```bash
git remote add upstream https://github.com/autor_original/repositorio.git
```

### 2. Obtener cambios nuevos del original
```bash
git fetch upstream
git checkout main
git merge upstream/main
```

---

## ¿Cuándo usar este flujo?

- Para colaborar en proyectos open source.
- Cuando no tienes permiso de escritura en un repositorio.
- Para mantener tu historial separado y limpio.

---

Usar forks y pull requests es una práctica estándar para contribuir con comunidades y colaborar sin necesidad de acceso directo al repositorio original.

