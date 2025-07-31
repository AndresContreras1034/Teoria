# Git Stash: Guardar cambios temporalmente

`git stash` es una herramienta de Git que permite guardar temporalmente los cambios que aún no deseas comprometer (commitear) para poder cambiar de rama o realizar otra tarea sin perder ese trabajo.

---

## ¿Cuándo usar `git stash`?

- Estás trabajando en algo, pero necesitas cambiar a otra rama.
- No quieres hacer commit aún, pero necesitas dejar el área de trabajo limpia.
- Quieres guardar cambios rápidos sin comprometer la historia del repositorio.

---

## Guardar cambios con `stash`

```bash
git stash
```

Esto guarda todos los cambios en staging y en el área de trabajo.

También puedes añadir un mensaje:

```bash
git stash save "Cambios en formulario de login"
```

> Nota: En versiones modernas de Git, se recomienda usar `git stash push -m "mensaje"`.

---

## Ver los cambios almacenados

```bash
git stash list
```

Ejemplo de salida:

```
stash@{0}: On main: Cambios en formulario de login
stash@{1}: On main: Refactor en dashboard
```

---

## Aplicar el último stash

```bash
git stash apply
```

Esto aplica el último stash, pero **no lo elimina** de la lista.

---

## Aplicar un stash específico

```bash
git stash apply stash@{1}
```

---

## Aplicar y eliminar (pop)

```bash
git stash pop
```

Esto aplica el stash más reciente **y lo elimina**.

---

## Eliminar un stash específico

```bash
git stash drop stash@{1}
```

---

## Eliminar todos los stashes

```bash
git stash clear
```

---

## Stash de archivos no seguidos (untracked)

Por defecto, `git stash` no guarda archivos no seguidos. Para incluirlos:

```bash
git stash -u
```

También puedes usar:

```bash
git stash push -u -m "Incluyendo archivos untracked"
```

---

## Ver cambios dentro de un stash

```bash
git stash show
```

Para ver todos los detalles:

```bash
git stash show -p stash@{0}
```

---

## Conclusión

`git stash` es muy útil para mantener tu área de trabajo limpia sin perder tu progreso. Úsalo cuando necesites cambiar de contexto sin comprometer cambios incompletos.
