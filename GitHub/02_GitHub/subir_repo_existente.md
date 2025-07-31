# Subir un repositorio local existente a GitHub

Si ya tienes un proyecto creado en tu computadora y quieres subirlo a GitHub, sigue estos pasos:

---

## 1. Crear el repositorio en GitHub

1. Ve a [https://github.com](https://github.com)
2. Haz clic en **"New repository"**
3. Escribe el nombre, ponlo como público o privado.
4. **No marques** la opción para crear un README si tu proyecto ya tiene archivos locales.

---

## 2. Inicializar Git en tu proyecto (si no lo has hecho)
```bash
git init
```

---

## 3. Agregar todos los archivos
```bash
git add .
```

---

## 4. Hacer el primer commit
```bash
git commit -m "Primer commit"
```

---

## 5. Agregar el repositorio remoto
```bash
git remote add origin https://github.com/usuario/nombre-repo.git
```

---

## 6. Subir los archivos a GitHub
```bash
git push -u origin main
```
> Si tu rama principal se llama `master`, cambia `main` por `master`.

---

## Problema común: conflicto por historial diferente

Si el repositorio remoto ya tiene un historial (por ejemplo, un README creado en GitHub), puedes forzar el push:

```bash
git push -u origin main --force
```

** CUIDADO **: `--force` sobrescribe el historial remoto. Úsalo solo si estás seguro.

---

## Resumen del flujo completo
```bash
git init
git add .
git commit -m "Primer commit"
git remote add origin https://github.com/usuario/nombre-repo.git
git push -u origin main
```

---

Con esto tu proyecto estará disponible en GitHub y podrás seguir trabajando de forma sincronizada.

