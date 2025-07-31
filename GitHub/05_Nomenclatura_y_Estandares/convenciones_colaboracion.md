# Convenciones para la colaboración en proyectos Git y GitHub

Establecer convenciones claras en un proyecto colaborativo ayuda a mantener un flujo de trabajo ordenado, evita conflictos y mejora la comunicación entre los miembros del equipo.

---

## 1. Convenciones para nombres de ramas

Usa nombres descriptivos y estructurados. Ejemplos:

```
feature/login-form
bugfix/registro-incompleto
hotfix/error-produccion
docs/actualizar-readme
```

Formato recomendado:  
`[tipo]/[descripción-breve-en-kebab-case]`

Tipos comunes:
- `feature/` – nueva funcionalidad
- `bugfix/` – corrección de errores
- `hotfix/` – solución urgente
- `docs/` – documentación
- `test/` – pruebas

---

## 2. Convenciones para mensajes de commit

Un buen mensaje de commit debe ser breve pero claro.

### Formato sugerido:

```
[Tipo]: Descripción breve en presente

Descripción opcional más extensa
```

### Ejemplos:
```
feat: agrega validación al formulario de registro
fix: corrige error en lógica de autenticación
docs: actualiza sección de instalación en README
```

Tipos más usados:
- `feat`: nueva funcionalidad
- `fix`: corrección de bug
- `docs`: cambios en documentación
- `refactor`: reestructuración interna del código
- `test`: agregar o mejorar pruebas
- `chore`: tareas menores (ej. actualizar dependencias)

---

## 3. Uso de Pull Requests

- Siempre crear un **PR** para que otros revisen antes de fusionar cambios.
- Asociar cada PR a un **issue** si existe.
- Explicar claramente qué se cambió y por qué.
- Esperar aprobación (review) antes de hacer el merge, especialmente en equipos grandes.

---

## 4. Revisión de código (code review)

- Comentar código confuso o poco claro.
- Asegurarse de que los commits estén organizados y tengan sentido.
- Sugerir mejoras, no imponerlas.
- Ser respetuoso y constructivo.

---

## 5. Resolución de conflictos

- Actualizar tu rama antes de hacer el merge (`git pull origin main`)
- Resolver los conflictos localmente.
- No usar `--force` salvo que sea estrictamente necesario y con aprobación del equipo.

---

## 6. Otras recomendaciones

✅ Mantén ramas pequeñas y enfocadas  
✅ Haz commits frecuentes y temáticos  
✅ Borra ramas que ya no se usen  
✅ Documenta todo lo relevante en los issues o README

---

Tener estas convenciones claras desde el inicio evita malentendidos y hace que el proyecto crezca de forma profesional y organizada.
