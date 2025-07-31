# Convenciones para nombrar commits

Un buen mensaje de commit facilita la lectura del historial de cambios, ayuda en revisiones de código y mejora la colaboración entre desarrolladores.

---

## Estructura básica de un mensaje de commit

```
<tipo>: <mensaje breve en presente>
```

Ejemplos:

```
feat: agrega formulario de contacto
fix: corrige error en validación de email
docs: actualiza sección de instalación en README
```

---

## Tipos más comunes

| Tipo       | Propósito                                      |
|------------|-----------------------------------------------|
| `feat`     | Nueva funcionalidad                            |
| `fix`      | Corrección de errores                          |
| `docs`     | Cambios en documentación                       |
| `style`    | Cambios de formato (espacios, comas, etc.)     |
| `refactor` | Reestructuración de código sin cambiar lógica  |
| `test`     | Agregado o modificación de pruebas             |
| `chore`    | Tareas menores que no afectan el código fuente |

---

## Buenas prácticas

- Usa el **presente**: `agrega`, `corrige`, `mejora`, no `agregó` o `agregado`.
- Sé **breve y claro**. El título debe resumir el cambio.
- Evita mensajes genéricos como `cambios`, `arreglos`, `actualización`.

---

## Ejemplos correctos

```
feat: implementa sistema de login con JWT
fix: corrige error al guardar usuarios sin correo
refactor: organiza rutas en archivos separados
docs: mejora explicación de flujo de trabajo en README
```

---

## Commits más detallados

Puedes agregar una descripción más extensa debajo del mensaje breve, separada por una línea en blanco:

```
feat: agrega botón para cerrar sesión

Se añadió un botón visible en el menú superior que permite cerrar sesión.
También se agregó lógica para eliminar el token de sesión al hacer clic.
```

---

Utilizar una convención de commits uniforme ayuda a mantener el control del proyecto limpio, ordenado y profesional.
