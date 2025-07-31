# GitHub Pages

## ¿Qué es GitHub Pages?

**GitHub Pages** es un servicio gratuito ofrecido por GitHub que permite alojar sitios web directamente desde un repositorio. Es muy utilizado para portafolios personales, documentación de proyectos, blogs o páginas estáticas de presentación.

---

## Características

- Alojamiento gratuito con certificado SSL.
- Compatible con HTML, CSS, JavaScript y frameworks estáticos como Jekyll.
- Puedes usar dominios personalizados.
- Cada repositorio puede tener una página asociada.
- Se puede publicar desde la rama `main`, `docs/`, o una carpeta `/gh-pages`.

---

## Tipos de sitios

| Tipo                     | Descripción                                             |
|--------------------------|---------------------------------------------------------|
| Usuario/Organización     | Publicado desde el repositorio `nombreusuario.github.io`. Ideal para portafolios. |
| Sitio del proyecto       | Asociado a un repositorio específico, como `github.com/usuario/proyecto`.         |

---

## ¿Cómo activar GitHub Pages?

1. Crea o entra a tu repositorio en GitHub.
2. Ve a `Settings > Pages`.
3. En la sección **Source**, elige la rama desde donde quieres publicar (`main`, por ejemplo).
4. Selecciona la carpeta (`/root` o `/docs`).
5. Haz clic en “Save”.
6. GitHub generará la URL de tu sitio:  
   `https://<usuario>.github.io/<nombre-repo>/`  
   *(o sin `<nombre-repo>` si es un sitio de usuario)*

---

## Estructura básica de un sitio

Puedes subir directamente archivos `.html`, `.css` y `.js`, o usar generadores estáticos como Jekyll.  
Ejemplo de archivo básico `index.html`:

```html
<!DOCTYPE html>
<html>
<head>
  <title>Mi Sitio en GitHub Pages</title>
</head>
<body>
  <h1>Hola Mundo</h1>
  <p>Este es mi primer sitio con GitHub Pages.</p>
</body>
</html>
```

---

## Usar dominio personalizado

1. Compra un dominio (por ejemplo, en Namecheap, Google Domains, etc.).
2. Crea un archivo llamado `CNAME` en la raíz de tu repositorio con tu dominio personalizado (ej: `www.miweb.com`).
3. En el panel DNS del dominio, crea un registro tipo A apuntando a las IPs de GitHub:

```
185.199.108.153  
185.199.109.153  
185.199.110.153  
185.199.111.153
```

Y un registro CNAME para `www` apuntando a `tuusuario.github.io`.

---

## Consideraciones

- Ideal para proyectos estáticos, no backend.
- No permite usar bases de datos ni lenguajes como PHP o Python.
- Se puede integrar con GitHub Actions para despliegue automático.
- Puedes usar frameworks como React, Angular o Vue si haces el build previamente.

---

## Recursos útiles

- Sitio oficial: [https://pages.github.com](https://pages.github.com)
- Guía oficial para Jekyll: [https://jekyllrb.com/docs/github-pages/](https://jekyllrb.com/docs/github-pages/)

