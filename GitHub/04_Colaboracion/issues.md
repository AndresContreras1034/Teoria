# ¿Qué son los Issues en GitHub?

Los **issues** son herramientas de seguimiento de tareas, errores o ideas dentro de un repositorio de GitHub. Permiten organizar el trabajo, discutir problemas y colaborar con otras personas.

---

## 1. ¿Para qué se usan los issues?

- Reportar **bugs** (errores)
- Sugerir **nuevas funcionalidades**
- Discutir **ideas o mejoras**
- Organizar el **trabajo en equipo**
- Asignar tareas específicas a colaboradores

---

## 2. ¿Cómo crear un issue?

1. Entra al repositorio en GitHub.
2. Ve a la pestaña **"Issues"**.
3. Haz clic en **"New issue"**.
4. Escribe un título claro y una descripción detallada.
5. Puedes asignarlo a alguien, agregar etiquetas (labels) y vincularlo a una rama o pull request.

---

## 3. ¿Cómo se ven los issues?

Cada issue tiene:
- Un número único: `#1`, `#2`, etc.
- Estado: **Open** o **Closed**
- Comentarios y respuestas
- Asignados y etiquetas

---

## 4. Cerrar un issue

Puedes cerrarlo manualmente desde GitHub o automáticamente desde un commit o pull request.

### Cerrar automáticamente con un commit:
```bash
git commit -m "Corrige el error de login. Closes #3"
```

### O en el pull request:
En la descripción:  
> This fixes #3

---

## 5. Etiquetas útiles (labels)

- `bug`: para errores
- `enhancement`: mejoras o nuevas funciones
- `question`: dudas o discusiones
- `documentation`: temas relacionados con docs
- `help wanted`: se necesita ayuda externa

---

## 6. Buenas prácticas al usar issues

✅ Usa títulos claros  
✅ Describe el problema o idea con detalle  
✅ Agrega capturas o ejemplos si es necesario  
✅ Usa etiquetas para clasificar  
✅ Cierra los issues que ya no sean relevantes

---

Los issues ayudan a mantener el proyecto organizado, facilitan la colaboración y documentan el progreso de forma transparente.

