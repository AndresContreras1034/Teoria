# Nombres de ramas (branches) en Git

Dar buenos nombres a las ramas ayuda a identificar fácilmente su propósito y facilita la colaboración en equipo.

---

##  ¿Por qué son importantes los nombres de ramas?

- Facilitan la organización del proyecto.
- Ayudan a identificar rápidamente el tipo de cambio que se está haciendo.
- Mejoran la comunicación entre desarrolladores.
- Evitan errores al fusionar (merge) ramas equivocadas.

---

##  Convención general

Usar el formato:

```
[tipo]/[descripcion-breve-en-kebab-case]
```

Donde:

- `tipo` es la categoría de la rama (ej: feature, bugfix, hotfix, etc.).
- `descripcion-breve` resume lo que hará esa rama, en minúsculas y con guiones.

---

##  Tipos comunes de ramas

| Tipo       | Uso previsto                                        | Ejemplo                             |
|------------|-----------------------------------------------------|-------------------------------------|
| `feature/` | Nueva funcionalidad o módulo                        | `feature/formulario-registro`      |
| `bugfix/`  | Corrección de errores o bugs                        | `bugfix/fix-login-error`           |
| `hotfix/`  | Solución urgente para producción                    | `hotfix/patch-pago-doble`          |
| `docs/`    | Cambios en documentación                            | `docs/update-readme`               |
| `test/`    | Implementación o mejora de pruebas                  | `test/add-unit-tests-login`        |
| `refactor/`| Reestructuración interna sin cambiar funcionalidad | `refactor/simplify-header`         |
| `chore/`   | Tareas menores o de mantenimiento                   | `chore/update-dependencies`        |

---

##  Recomendaciones

- Sé **consistente**: todos deben seguir la misma convención.
- Usa **guiones** en lugar de espacios o underscores.
- Mantén los nombres **breves y descriptivos**.
- Evita ramas muy generales como `nueva-rama` o `prueba`.

---

##  Ejemplo de flujo de trabajo

```bash
git checkout -b feature/pagina-contacto
# trabajar en la nueva funcionalidad...
git add .
git commit -m "feat: crea diseño inicial de página de contacto"
git push origin feature/pagina-contacto
```

---

Tener ramas bien nombradas hace que el trabajo en equipo sea más claro, ordenado y profesional.
