# Git Flow

**Git Flow** es una estrategia de ramificación (branching model) que define un flujo de trabajo estricto y bien organizado para el desarrollo de software, especialmente útil en proyectos grandes y con equipos múltiples.

---

## ¿Por qué usar Git Flow?

Organiza el desarrollo en ramas con roles específicos, lo que facilita:

- Múltiples versiones en paralelo.
- Integración controlada de nuevas funcionalidades.
- Preparación de versiones y hotfixes de forma clara.

---

## Ramas principales

Git Flow define dos ramas permanentes:

- `main` (o `master`): contiene el código de producción.
- `develop`: contiene el código que será parte de la próxima versión estable.

---

## Ramas de soporte (temporales)

1. **feature/**: para el desarrollo de nuevas funcionalidades.
   - Base: `develop`
   - Ejemplo: `feature/login`, `feature/carrito`

2. **release/**: para preparar una nueva versión.
   - Base: `develop`
   - Destino: `main` y `develop`
   - Ejemplo: `release/1.2.0`

3. **hotfix/**: para corregir errores críticos en producción.
   - Base: `main`
   - Destino: `main` y `develop`
   - Ejemplo: `hotfix/login-bug`

---

## Flujo general

```text
           +--> feature/x
           |
main -----> develop -----------> release/1.2.0 ---------> main
              ↑                      |                        ↑
              |                      ↓                        |
              +------------------- merge -------------------+
                                     |
                                  tag 1.2.0
```

---

## Comandos con la extensión Git Flow

Git Flow no es parte de Git por defecto, pero puedes instalarlo como extensión:

### Instalar Git Flow

```bash
# Debian/Ubuntu
sudo apt install git-flow

# macOS
brew install git-flow
```

### Inicializar Git Flow

```bash
git flow init
```

Sigue las instrucciones para definir nombres de ramas. Se usan por defecto:

- Branch de producción: `main`
- Branch de desarrollo: `develop`

---

## Comandos comunes

### Feature

```bash
git flow feature start login
# crea y se mueve a feature/login

git flow feature finish login
# mergea a develop y elimina la rama
```

### Release

```bash
git flow release start 1.2.0

git flow release finish 1.2.0
# mergea a main y develop, crea tag
```

### Hotfix

```bash
git flow hotfix start login-error

git flow hotfix finish login-error
# mergea a main y develop, crea tag
```

---

## Ventajas

Claridad de roles para cada rama  
Flujo estandarizado para versiones y fixes  
Ideal para proyectos grandes o con entregas planificadas

---

## Desventajas

 Puede ser excesivo para proyectos pequeños  
 Requiere disciplina y coordinación entre ramas  
No se adapta bien a entregas continuas (CI/CD extremo)

---

## ¿Cuándo usarlo?

Git Flow es útil cuando:

- Hay ciclos de lanzamiento definidos.
- Se mantiene más de una versión en paralelo.
- Trabajas con equipos organizados en funciones específicas.

Para proyectos más simples o con despliegue continuo, modelos como GitHub Flow o trunk-based development pueden ser más adecuados.

---

## Conclusión

Git Flow es una metodología madura y estructurada para gestionar el desarrollo en Git, adecuada para equipos que buscan claridad y control sobre versiones y despliegues.

