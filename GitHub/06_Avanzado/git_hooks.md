# Git Hooks

Los *Git Hooks* son scripts que se ejecutan automáticamente cuando se producen ciertos eventos en un repositorio Git. Permiten automatizar tareas y establecer reglas dentro del flujo de trabajo, como validar código antes de hacer un commit, ejecutar pruebas o prevenir errores.

---

## ¿Dónde se encuentran?

Al inicializar un repositorio con `git init`, Git crea una carpeta oculta:

```
.git/hooks/
```

Dentro encontrarás archivos de ejemplo con extensión `.sample`, que puedes modificar o reemplazar.

---

## Tipos de Git Hooks

Existen dos tipos:

1. **Hooks del lado del cliente**  
   Se ejecutan en el equipo del desarrollador. Ejemplos:
   - `pre-commit`: antes de realizar un commit.
   - `commit-msg`: valida el mensaje del commit.
   - `pre-push`: antes de ejecutar `git push`.

2. **Hooks del lado del servidor**  
   Se ejecutan en el servidor cuando se reciben actualizaciones (más usados en servidores propios, no en GitHub).
   - `pre-receive`
   - `update`
   - `post-receive`

---

## Hooks comunes del lado cliente

| Hook         | Cuándo se ejecuta                         | Ejemplo de uso                           |
|--------------|-------------------------------------------|-------------------------------------------|
| `pre-commit` | Antes de realizar un commit               | Ejecutar tests, formatear código          |
| `commit-msg` | Después de escribir el mensaje del commit | Validar el formato del mensaje            |
| `pre-push`   | Antes de hacer `git push`                 | Ejecutar tests, verificar ramas           |
| `post-merge` | Después de hacer `git merge`              | Instalar dependencias si cambiaron        |

---

## Ejemplo: Validar que el mensaje del commit no esté vacío

Archivo: `.git/hooks/commit-msg`

```bash
#!/bin/sh

msg=$(cat "$1")

if [ -z "$msg" ]; then
  echo "❌ El mensaje del commit no puede estar vacío"
  exit 1
fi
```

> Recuerda dar permisos de ejecución al hook:
```bash
chmod +x .git/hooks/commit-msg
```

---

## Automatización con herramientas

En proyectos modernos se suele usar:

### Husky (JavaScript/Node.js)

Permite gestionar hooks fácilmente desde `package.json`:
```json
{
  "husky": {
    "hooks": {
      "pre-commit": "npm run lint",
      "commit-msg": "commitlint -E HUSKY_GIT_PARAMS"
    }
  }
}
```

### pre-commit (Python)

Permite configurar múltiples hooks en `.pre-commit-config.yaml`:
```yaml
repos:
  - repo: https://github.com/pre-commit/pre-commit-hooks
    rev: v4.3.0
    hooks:
      - id: trailing-whitespace
      - id: end-of-file-fixer
```

---

## Limitaciones

- Los hooks no se comparten al clonar el repositorio. No están versionados por defecto.
- Para compartirlos, puedes:
  - Crear una carpeta como `/hooks` y documentar su instalación.
  - Usar herramientas como **Husky** o **pre-commit**.

---

## Conclusión

Los Git Hooks son una poderosa herramienta para mantener la calidad del código y automatizar tareas en tus proyectos. Aunque requieren configuración manual, ofrecen un control fino sobre el flujo de trabajo en Git.

