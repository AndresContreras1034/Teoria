# Crear y gestionar ramas en Git

Las ramas permiten trabajar en nuevas funcionalidades sin afectar el código principal. La rama por defecto suele llamarse `main` o `master`.

---

## 1. Ver las ramas existentes
```bash
git branch
```

---

## 2. Crear una nueva rama
```bash
git branch nombre-rama
```

Ejemplo:
```bash
git branch login-feature
```

Esto crea la rama pero no te cambia a ella todavía.

---

## 3. Cambiar de rama
```bash
git checkout nombre-rama
```

O bien, crearla y cambiar en un solo paso:
```bash
git checkout -b nombre-rama
```

---

## 4. Confirmar en qué rama estás
```bash
git branch
```

La rama activa aparece con un asterisco `*`.

---

## 5. Subir una nueva rama a GitHub
```bash
git push -u origin nombre-rama
```

---

## 6. Eliminar una rama

### Localmente:
```bash
git branch -d nombre-rama
```

### Remotamente:
```bash
git push origin --delete nombre-rama
```

---

## 7. Renombrar una rama local
```bash
git branch -m nuevo-nombre
```

---

Trabajar con ramas es una buena práctica para mantener el código organizado y evitar conflictos al desarrollar nuevas funcionalidades.

