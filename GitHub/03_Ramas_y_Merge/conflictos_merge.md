# Conflictos de merge en Git

Un **conflicto de merge** ocurre cuando Git no puede decidir automáticamente qué cambios conservar al unir dos ramas porque se han modificado las mismas líneas en los mismos archivos.

---

## ¿Cuándo ocurren?

Ejemplo típico:
- Tienes dos ramas: `main` y `feature`
- Ambos modifican la misma línea de un archivo.
- Intentas hacer `git merge feature` desde `main`

---

## Cómo identificar un conflicto

Cuando haces un merge y hay conflicto, Git lo indica así:

```bash
Auto-merging archivo.txt
CONFLICT (content): Merge conflict in archivo.txt
Automatic merge failed; fix conflicts and then commit the result.
```

---

## Cómo resolver un conflicto

1. Abre el archivo que tiene conflicto. Verás marcas especiales como:

```text
<<<<<<< HEAD
Línea desde la rama actual (main)
=======
Línea desde la rama que estás fusionando (feature)
>>>>>>> feature
```

2. Edita el archivo manualmente para dejar solo la versión correcta.

3. Guarda los cambios.

4. Marca el conflicto como resuelto:
```bash
git add archivo.txt
```

5. Realiza un commit del merge:
```bash
git commit
```

---

## Ver los archivos en conflicto

```bash
git status
```

Verás los archivos marcados como `unmerged`.

---

## Abortar el merge (si no quieres continuar)

```bash
git merge --abort
```

Esto revierte al estado anterior al merge (solo funciona si no has hecho cambios después).

---

## Consejos para evitar conflictos

- Haz `git pull` frecuentemente.
- Comunícate con tu equipo.
- Trabaja en ramas diferentes para cada funcionalidad.
- Usa `git diff` antes de hacer un merge para comparar los cambios.

---

Los conflictos de merge son comunes, especialmente al trabajar en equipo. Lo importante es saber cómo resolverlos con calma y claridad.

