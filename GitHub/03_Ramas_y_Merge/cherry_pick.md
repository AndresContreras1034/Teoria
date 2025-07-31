# git cherry-pick

## ¿Qué es?

`git cherry-pick` es un comando que permite aplicar uno o varios *commits* específicos de una rama a otra, sin necesidad de hacer un merge completo.

Es muy útil cuando necesitas traer correcciones o cambios puntuales de otra rama sin fusionarla por completo.

---

## ¿Cuándo usarlo?

- Aplicar una corrección de `main` a `develop` o viceversa.
- Traer un commit puntual desde una rama de feature sin fusionar todo el trabajo.
- Mover cambios específicos sin romper el historial o traer commits innecesarios.

---

## Ejemplo básico

Supongamos que estás en la rama `main`, y quieres traer un commit puntual desde `feature/login`:

```bash
git checkout main
git cherry-pick abc1234
```

Donde `abc1234` es el hash del commit que quieres aplicar.

---

## Cómo obtener el hash del commit

Usa:

```bash
git log --oneline
```

Y copia el hash corto del commit que te interesa.

---

## Cherry-pick múltiple

Puedes aplicar varios commits seguidos:

```bash
git cherry-pick abc1234 def5678 7890abc
```

---

## Cherry-pick con conflictos

Si el commit no aplica de forma limpia, Git detendrá el proceso y mostrará conflictos. Para resolverlo:

1. Edita los archivos en conflicto.
2. Luego:

```bash
git add .
git cherry-pick --continue
```

Para abortar el proceso si algo va mal:

```bash
git cherry-pick --abort
```

---

## Cherry-pick por rango

Puedes aplicar un rango de commits:

```bash
git cherry-pick abc1234^..def5678
```

Esto selecciona todos los commits desde **abc1234** (inclusive) hasta **def5678**.

---

## Buenas prácticas

- Evita cherry-pick de commits con muchos cambios o dependencias.
- Documenta bien por qué se cherry-pickeó un commit.
- No abuses: puede desorganizar el historial si se usa sin criterio.

---

## Alternativas

- Si necesitas llevar muchos cambios, evalúa si es mejor un `merge` o `rebase`.
- Si necesitas mantener ramas sincronizadas, considera estrategias como Git Flow o GitHub Flow.

---

## Conclusión

`git cherry-pick` es una herramienta poderosa para llevar commits puntuales entre ramas. Úsala con cuidado y solo cuando tenga sentido aislar cambios específicos.

