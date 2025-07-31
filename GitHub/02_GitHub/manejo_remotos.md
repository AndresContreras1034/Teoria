# Manejo de repositorios remotos en Git

Un repositorio remoto es una versión del proyecto que está alojada en internet (como GitHub). Git permite conectar tu repositorio local con uno o varios repositorios remotos.

---

## 1. Ver los repositorios remotos
```bash
git remote -v
```
Muestra los remotos configurados y sus URLs (fetch/push).

---

## 2. Añadir un repositorio remoto
```bash
git remote add origin https://github.com/usuario/proyecto.git
```
Este comando enlaza tu repositorio local con uno remoto. El nombre más común para el remoto principal es `origin`.

---

## 3. Cambiar la URL de un remoto existente
```bash
git remote set-url origin https://github.com/usuario/nueva-url.git
```

---

## 4. Eliminar un remoto
```bash
git remote remove origin
```

---

## 5. Clonar y trabajar con el remoto
Si clonaste un proyecto con `git clone`, ya estará configurado automáticamente con el remoto `origin`.

---

## 6. Subir cambios al remoto
```bash
git push origin main
```
Envía tus commits locales a la rama `main` del repositorio remoto.

---

## 7. Obtener cambios del remoto
```bash
git pull origin main
```
Descarga y fusiona los cambios del remoto en tu rama actual.

---

## 8. Listar todas las ramas remotas
```bash
git branch -r
```

---

## 9. Ver detalles de un remoto
```bash
git remote show origin
```

---

Con estos comandos puedes gestionar tus conexiones remotas, cambiar de servidor, sincronizar tu trabajo o colaborar con otros sin complicaciones.

