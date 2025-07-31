# GitHub Actions: Automatización de flujos de trabajo

GitHub Actions permite automatizar tareas dentro del ciclo de vida de desarrollo directamente desde tu repositorio. Se usa principalmente para integración continua (CI) y entrega continua (CD).

---

## ¿Qué puedes hacer con GitHub Actions?

- Ejecutar pruebas automáticamente al hacer un push.
- Desplegar tu aplicación a servidores o servicios como Vercel, Netlify o Heroku.
- Formatear el código automáticamente.
- Ejecutar tareas programadas (cron).
- Validar commits, linting, etc.

---

## Estructura básica de un workflow

Los workflows se definen en archivos YAML dentro del directorio `.github/workflows/`. Ejemplo:

```yaml
name: CI

on:
  push:
    branches: [main]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Clonar repositorio
        uses: actions/checkout@v3

      - name: Instalar Node.js
        uses: actions/setup-node@v4
        with:
          node-version: 18

      - name: Instalar dependencias
        run: npm install

      - name: Ejecutar tests
        run: npm test
```

---

## Explicación de componentes

- `name`: Nombre del workflow.
- `on`: Eventos que lo activan (`push`, `pull_request`, `schedule`, etc.).
- `jobs`: Tareas que se ejecutan.
- `runs-on`: Sistema operativo usado (Linux, Windows, macOS).
- `steps`: Pasos individuales del job.

---

## Ejemplos comunes

### Desplegar a Vercel o Netlify

Usando secrets y tokens, puedes configurar despliegues automáticos después de un push.

### Linting o formato de código

```yaml
- name: Run Prettier
  run: npx prettier --check .
```

### Ejecutar scripts personalizados

```yaml
- name: Script de mantenimiento
  run: bash scripts/limpiar_cache.sh
```

---

## Uso de Secrets

Puedes guardar tokens, claves de API o contraseñas en la sección **Settings > Secrets** de tu repositorio y usarlos así:

```yaml
env:
  TOKEN: ${{ secrets.MI_TOKEN }}
```

---

## Consejos

- Nombra los archivos YAML descriptivamente (`ci.yml`, `deploy.yml`).
- Usa `matrix` para probar en múltiples versiones o entornos.
- Combina múltiples jobs si lo necesitas.

---

GitHub Actions es una poderosa herramienta para automatizar tu flujo de trabajo sin salir de GitHub.
