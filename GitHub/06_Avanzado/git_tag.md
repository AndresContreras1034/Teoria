# Git Tag: Marcando versiones importantes

Los *tags* (etiquetas) en Git se utilizan para marcar puntos específicos en la historia del repositorio como versiones importantes (por ejemplo, una versión de producción, un release, etc.).

---

## ¿Para qué se usan los tags?

- Para identificar versiones estables (`v1.0`, `v2.1.3`, etc.).
- Para lanzar software.
- Para facilitar rollbacks o revisiones de código.
- Para integración con CI/CD (como GitHub Actions o Releases).

---

## Tipos de tags

### 1. Lightweight tag (etiqueta ligera)
Simplemente apunta a un commit.

```bash
git tag v1.0
```

### 2. Annotated tag (etiqueta anotada)
Incluye mensaje, autor y fecha. Es el más recomendado para releases.

```bash
git tag -a v1.0 -m "Versión 1.0 estable"
```

---

## Listar tags

```bash
git tag
```

Puedes filtrar por patrón:

```bash
git tag -l "v1.*"
```

---

## Ver información de un tag

```bash
git show v1.0
```

---

## Subir tags al repositorio remoto

Los tags no se suben automáticamente. Para subir un tag específico:

```bash
git push origin v1.0
```

Para subir todos los tags:

```bash
git push origin --tags
```

---

## Eliminar un tag

### Local:

```bash
git tag -d v1.0
```

### Remoto:

```bash
git push origin --delete tag v1.0
```

---

## Tag sobre un commit específico

```bash
git tag -a v1.0 9fceb02 -m "Release v1.0"
```

Donde `9fceb02` es el ID del commit.

---

## Buenas prácticas

- Usa *annotated tags* para versiones oficiales.
- Sigue una convención de nombres, como `v1.0.0`, `release-2.3`, etc.
- No sobreescribas un tag ya publicado en producción.

---

## Conclusión

Los tags son una herramienta esencial para el control de versiones profesional. Permiten llevar un seguimiento claro del ciclo de vida del proyecto, integrarse con pipelines de entrega y marcar hitos clave en el desarrollo.
