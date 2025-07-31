# Merge básico en Git

El comando `git merge` se utiliza para **unir el historial de dos ramas diferentes** en una sola. Es una herramienta clave para integrar cambios desarrollados en paralelo.

---

## ¿Qué es un merge?

Un **merge** (fusión) toma los cambios de una rama y los aplica a otra. Git intentará combinar los historiales de ambas ramas automáticamente.

Ejemplo clásico:
- Estás en la rama `main`
- Has desarrollado una funcionalidad en la rama `feature`
- Usas `git merge feature` para incorporar esos cambios en `main`

---

## 1. Flujo básico de un merge

### Paso 1: Estar en la rama de destino
```bash
git checkout main
```

### Paso 2: Ejecutar el merge
```bash
git merge nombre-rama
```

Ejemplo:
```bash
git merge login-feature
```

---

## 2. Merge exitoso

Si no hay conflictos, Git hará la fusión automáticamente y mostrará algo como:

```
Updating 3a4b5c..8f9e10
Fast-forward
 archivo1.txt | 10 ++++++++--
 archivo2.js  |  5 +++--
```

---

## 3. Merge con conflictos

Si hay conflictos, Git detendrá el proceso y mostrará qué archivos necesitan resolución manual.

Ver: [conflictos_merge.md](./conflictos_merge.md)

---

## 4. Tipos de merge

- **Fast-forward merge**: Git simplemente mueve el puntero de la rama hacia adelante si no hay commits paralelos.  
- **Merge con commit**: Se genera un commit de fusión que une dos historias distintas.

---

## 5. Ver historial con merges
```bash
git log --oneline --graph --all
```

Esto te muestra un gráfico del flujo de ramas y merges.

---

## Consejos

- Antes de hacer un merge, asegúrate de tener el repositorio actualizado:
```bash
git pull origin main
```

- Siempre haz `git status` después del merge para verificar el estado.

---

El merge es una parte esencial del trabajo colaborativo. Permite integrar el trabajo de varias personas sin sobrescribir código.

