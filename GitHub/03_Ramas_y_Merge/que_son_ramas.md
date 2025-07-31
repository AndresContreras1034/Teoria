# ¿Qué son las ramas en Git?

Las **ramas** (branches) en Git permiten desarrollar funcionalidades, arreglos o ideas de manera aislada del resto del código. Son como una copia del proyecto en la que puedes trabajar sin afectar la rama principal (usualmente llamada `main` o `master`).

---

## ¿Para qué sirven las ramas?

- Desarrollar nuevas funcionalidades sin tocar el código estable.
- Probar ideas sin riesgo.
- Trabajar en paralelo con otros desarrolladores.
- Arreglar bugs urgentes en una rama aparte.

---

## ¿Cómo funcionan?

Git guarda todo el historial del proyecto. Cada vez que haces un commit, se crea un punto en ese historial. Una rama es simplemente un **puntero** a uno de esos puntos (commits).

---

## Ejemplo simple

Tienes este historial en la rama `main`:

```text
A → B → C (main)
```

Ahora creas una nueva rama `login-feature` desde `C`:

```text
A → B → C (main)
           ↘
             D → E (login-feature)
```

Cada rama evoluciona de forma independiente hasta que las unes con un **merge**.

---

## Ventajas de usar ramas

✅ Separación de funcionalidades  
✅ Trabajo colaborativo limpio  
✅ Posibilidad de descartar cambios fácilmente  
✅ Control y organización del flujo de trabajo

---

## Tipos de ramas comunes

- `main` o `master`: rama principal, contiene el código estable.
- `develop`: usada para integrar nuevas funcionalidades (en algunos flujos).
- `feature/*`: para desarrollar nuevas funciones.
- `bugfix/*`: para corregir errores.
- `hotfix/*`: para arreglos urgentes directamente sobre producción.

---

Trabajar con ramas te da control total sobre el desarrollo. Puedes experimentar, fallar y corregir sin miedo a dañar el proyecto principal.

