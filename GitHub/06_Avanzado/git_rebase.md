# Git Rebase: Reescribiendo el historial

`git rebase` es un comando avanzado de Git que permite mover o "recolocar" una secuencia de commits a una nueva base. Se utiliza comúnmente para mantener un historial de commits más limpio y lineal.

---

## ¿Para qué sirve `git rebase`?

- **Evitar merges innecesarios** en ramas paralelas.
- **Simplificar la historia** del proyecto.
- **Actualizar una rama** con los cambios más recientes de otra rama sin crear un commit de merge.

---

## Diferencia entre `merge` y `rebase`

| Comando   | Resultado |
|-----------|-----------|
| `git merge` | Une ramas y conserva el historial completo (incluye commits de merge). |
| `git rebase` | Reescribe la historia como si los commits hubieran sido creados directamente sobre la nueva base. |

---

## Ejemplo de uso básico

```bash
# Estás en una rama llamada 'feature'
git checkout feature

# Rebasar con los últimos cambios de 'main'
git rebase main
```

Esto "traslada" los commits de `feature` al tope de `main`, como si se hubieran creado sobre ese último estado.

---

## Resultado visual

Antes del rebase:

```
A---B---C feature
     /
D---E---F main
```

Después de `git rebase main`:

```
D---E---F---A'---B'---C' feature
```

(A’, B’ y C’ son nuevas versiones reescritas de los commits.)

---

## Resolución de conflictos

Durante un rebase, si hay conflictos:

1. Git pausa el rebase.
2. Debes resolver los conflictos manualmente.
3. Luego ejecutar:

```bash
git add .
git rebase --continue
```

Para abortar:

```bash
git rebase --abort
```

---

## Rebase interactivo (`-i`)

Permite modificar commits anteriores (reordenar, editar mensajes, combinarlos, etc.).

```bash
git rebase -i HEAD~4
```

Esto abrirá un editor para seleccionar qué hacer con los últimos 4 commits.

Ejemplo del menú:

```
pick 1a2b3c Primer commit
reword 4d5e6f Segundo commit
squash 7g8h9i Tercer commit
```

---

## Cuándo NO usar rebase

- **Nunca reescribas historial público** (commits ya subidos a un repositorio compartido).
- Evítalo si otros ya están trabajando sobre la misma rama.

---

## Conclusión

`git rebase` es útil para mantener un historial ordenado, pero requiere cuidado. Úsalo solo si entiendes sus implicaciones y preferiblemente en ramas locales antes de hacer `push`.
