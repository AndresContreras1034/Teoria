# Resolución de conflictos avanzada en Git

## ¿Qué es un conflicto?

Un conflicto ocurre cuando Git no puede fusionar automáticamente dos ramas porque los mismos archivos fueron modificados en ambos lados y no sabe cuál cambio conservar.

---

## ¿Cuándo aparecen los conflictos?

- Al hacer `git merge`
- Al hacer `git rebase`
- Al aplicar un `stash`
- Al usar `cherry-pick`
- Al hacer `pull` con cambios locales

---

## Cómo identificar un conflicto

Git pausará la operación y verás algo como:

```bash
CONFLICT (content): Merge conflict in archivo.txt
Automatic merge failed; fix conflicts and then commit the result.
```

En el archivo en conflicto verás algo así:

```diff
<<<<<<< HEAD
Versión de la rama actual
=======
Versión de la rama que se está fusionando
>>>>>>> feature-rama
```

---

## Pasos para resolver un conflicto

1. **Abre el archivo en conflicto**
2. **Edita manualmente el contenido**
   - Elige qué conservar o mezcla ambas partes
3. **Guarda el archivo**
4. **Marca como resuelto**

```bash
git add archivo.txt
```

5. **Finaliza la operación** (según el caso):

- Si es merge:

```bash
git commit
```

- Si es rebase:

```bash
git rebase --continue
```

---

## Abortando la operación

- Si no quieres continuar:

```bash
git merge --abort
```

```bash
git rebase --abort
```

---

## Herramientas gráficas útiles

- **VS Code**: Detecta conflictos automáticamente y ofrece una UI para aceptarlos o descartarlos.
- **GitKraken**, **Sourcetree**: Interfaz gráfica para resolver conflictos visualmente.
- `git mergetool`: Herramienta configurable para usar meld, kdiff3, etc.

---

## Buenas prácticas

- Realiza `pull` con frecuencia para evitar grandes conflictos
- Usa ramas pequeñas y concretas
- Comunica cambios críticos al equipo
- Revisa `git status` para verificar archivos pendientes

---

## Caso especial: Conflictos en archivos binarios

Git no puede fusionar binarios automáticamente. La solución es:

- Conservar uno de los archivos
- Reemplazar manualmente
- Confirmar el cambio con `git add`

---

## Comando útil: Visualizar conflictos

```bash
git diff
```

Para ver solo los archivos en conflicto:

```bash
git diff --name-only --diff-filter=U
```

---

## Conclusión

La resolución de conflictos es parte natural del trabajo con Git. Lo importante no es evitarlos a toda costa, sino aprender a gestionarlos de forma clara, limpia y segura.

