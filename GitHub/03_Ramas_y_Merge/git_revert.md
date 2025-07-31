# git revert

## ¿Qué es?

`git revert` es un comando que se utiliza para **deshacer un commit** específico creando un nuevo commit que revierte los cambios introducidos por el anterior, sin alterar el historial del repositorio.

A diferencia de `git reset`, `revert` **no borra historial**, por lo que es ideal para proyectos colaborativos.

---

## ¿Cuándo usarlo?

- Cuando ya hiciste *push* y necesitas revertir un commit sin eliminarlo.
- Para deshacer errores de producción de forma segura.
- Para mantener un historial limpio y trazable.

---

## Sintaxis básica

```bash
git revert <hash_commit>
```

Ejemplo:

```bash
git revert 4a5b6c7
```

Esto generará un nuevo commit que revierte los cambios hechos en el commit `4a5b6c7`.

---

## ¿Cómo obtengo el hash del commit?

Usa:

```bash
git log --oneline
```

Y copia el hash correspondiente.

---

## Revertir múltiples commits

Puedes revertir varios commits en orden inverso:

```bash
git revert HEAD~2..HEAD
```

Esto revierte los últimos 3 commits (de más antiguo a más reciente).

> Nota: El orden es importante. Git revertirá uno por uno.

---

## Revertir sin abrir el editor

Si no quieres editar el mensaje de commit, añade `--no-edit`:

```bash
git revert <hash_commit> --no-edit
```

---

## Revertir un merge commit

Los merge commits requieren un tratamiento especial. Puedes revertirlos así:

```bash
git revert -m 1 <hash_merge>
```

Donde `-m 1` indica qué rama principal mantener (la rama base). Esto es necesario porque Git debe saber cuál fue la "rama ganadora".

---

## ¿Qué pasa si hay conflictos?

Si al hacer `revert` hay conflictos, Git lo detendrá. Para continuar:

```bash
# resolver conflictos manualmente
git add .
git revert --continue
```

Si prefieres cancelar:

```bash
git revert --abort
```

---

## git revert vs git reset

| Comando      | Afecta historial remoto | Seguro para colaboración | Borra commits |
|--------------|--------------------------|---------------------------|----------------|
| `revert`     |  No                   |  Sí                    |  No         |
| `reset`      |  Sí (si haces push)    |  No (rompe historial)   |  Sí         |

---

## Conclusión

`git revert` es la forma recomendada de **deshacer commits en entornos colaborativos** o con historial público. Mantiene la trazabilidad y evita romper el trabajo de otros desarrolladores.

