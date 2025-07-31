# Primeros comandos de Git

Estos son los comandos esenciales para empezar a trabajar con Git desde la terminal.

---

## 1. Inicializar un repositorio
```bash
git init
```
Crea un repositorio local en la carpeta actual. Git comenzará a rastrear los cambios.

---

## 2. Ver el estado de los archivos
```bash
git status
```
Muestra qué archivos han sido modificados, agregados o eliminados desde el último commit.

---

## 3. Añadir archivos al área de preparación (staging)
```bash
git add archivo.txt     # Añade un archivo específico
git add .               # Añade todos los archivos modificados
```
Este paso prepara los archivos para ser incluidos en el próximo commit.

---

## 4. Confirmar cambios con un commit
```bash
git commit -m "Mensaje descriptivo del cambio"
```
Crea un nuevo punto de control en la historia del repositorio.

---

## 5. Ver historial de commits
```bash
git log
```
Muestra los commits realizados en el repositorio con detalles como autor, fecha y mensaje.

---

## 6. Ver la configuración actual
```bash
git config --list
```
Muestra la configuración actual del usuario y del repositorio.

---

## 7. Configurar nombre y correo (si no lo has hecho)
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@correo.com"
```

---

## 8. Ver diferencias entre archivos modificados
```bash
git diff
```
Muestra línea por línea los cambios que aún no han sido agregados al staging.

---

Con estos comandos puedes iniciar y gestionar proyectos Git básicos de forma eficiente. A medida que avances, irás aprendiendo más herramientas como ramas, merges y conflictos.

