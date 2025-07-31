# Plantillas para Pull Requests e Issues en GitHub

## ¿Qué son?

Las plantillas en GitHub permiten estandarizar la información que los colaboradores deben proporcionar al crear un *Issue* o *Pull Request*. Esto facilita la comunicación, la revisión y el mantenimiento del proyecto.

---

## ¿Dónde se colocan?

Dentro del repositorio, crea una de estas rutas:

```
.github/ISSUE_TEMPLATE/
.github/PULL_REQUEST_TEMPLATE.md
```

---

##  Plantillas para Issues

Puedes crear varios archivos `.md` en `.github/ISSUE_TEMPLATE/`, por ejemplo:

###  `bug_report.md`
```markdown
---
name: Reportar un bug
about: Describe un error encontrado
---

## Descripción del problema
<!-- Explica el bug -->

## Pasos para reproducir
1. Ir a '...'
2. Click en '....'
3. Observar el error

## Resultado esperado
<!-- ¿Qué esperabas que sucediera? -->

## Capturas de pantalla
<!-- Si es posible, añade una imagen -->

## Información adicional
- Sistema operativo:
- Navegador:
```

### 🛠️ `feature_request.md`
```markdown
---
name: Solicitud de funcionalidad
about: Sugiere una nueva característica
---

## ¿Tu propuesta está relacionada con un problema?
<!-- Describe el problema -->

## Describe la funcionalidad que te gustaría
<!-- Explica claramente la solución deseada -->

## Contexto adicional
<!-- Información o ideas adicionales -->
```

---

##  Plantilla para Pull Requests

Ubica un único archivo llamado `PULL_REQUEST_TEMPLATE.md` en `.github/`.

###  `PULL_REQUEST_TEMPLATE.md`
```markdown
## Descripción

<!-- Explica brevemente qué cambios introduce este PR -->

## Cambios realizados
- [ ] Funcionalidad nueva
- [ ] Corrección de bug
- [ ] Documentación actualizada
- [ ] Refactor

## ¿Cómo probarlo?
<!-- Instrucciones para reproducir o validar los cambios -->

## Checklist
- [ ] El código compila sin errores
- [ ] Pasaron todas las pruebas
- [ ] Los cambios están documentados
- [ ] No hay código comentado innecesario
```

---

## Ventajas

- Mejora la claridad y consistencia.
- Ahorra tiempo a los mantenedores.
- Fomenta buenas prácticas de colaboración.

---

## Personalización avanzada

GitHub permite incluir un archivo `config.yml` en `.github/ISSUE_TEMPLATE/` para organizar múltiples templates en un menú visual.

```yaml
blank_issues_enabled: false
contact_links:
  - name: Contacto directo
    url: https://ejemplo.com/contacto
    about: Usa este canal para dudas generales
```

---

## Conclusión

Usar plantillas mejora la colaboración y la calidad del trabajo en proyectos de código abierto o privados. Se recomienda incluirlas desde el inicio del repositorio.

