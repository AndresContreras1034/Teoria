# Flujo básico de trabajo con Git y GitHub

Este es el flujo de trabajo más común al usar Git localmente y sincronizar tu proyecto con GitHub.

---

## 1. Crear el repositorio local
```bash
git init
```
Esto inicializa un nuevo repositorio en la carpeta actual. Se crea una carpeta oculta llamada `.git`.

---

## 2. Crear o modificar archivos
Trabaja normalmente en tus archivos, por ejemplo:
- Crear `index.html`
- Modificar `main.py`
- Borrar `archivo.txt`

---

## 3. Agregar cambios al área de preparación (staging)
```bash
git add archivo.txt     # Agrega un archivo específico
git add .               # Agrega todos los archivos modificados
```

---

## 4. Hacer un commit
```bash
git commit -m "Descripción clara del cambio"
```
Este paso guarda una "foto" del estado actual del proyecto.

---

## 5. Subir a GitHub

### Paso 1: Crear un repositorio en GitHub
- Entra a [https://github.com](https://github.com)
- Crea un nuevo repositorio (sin README si ya tienes archivos locales)

### Paso 2: Conectar tu repositorio local con el remoto
```bash
git remote add origin https://github.com/tu_usuario/tu_repositorio.git
```

---

## 6. Subir los cambios al repositorio remoto
```bash
git push -u origin main
```
Esto envía los commits locales al repositorio remoto por primera vez.

En siguientes ocasiones puedes usar simplemente:
```bash
git push
```

---

## Diagrama del flujo básico

```text
  Modificar archivos
          ↓
     git add archivo
          ↓
 git commit -m "mensaje"
          ↓
 git push origin main
```

---

Este flujo es ideal para comenzar a trabajar con Git de forma sencilla, llevando un control ordenado de tus proyectos y respaldándolos en GitHub.

