# Instalación de Git

## Windows
1. Ve a [https://git-scm.com](https://git-scm.com) y descarga el instalador para Windows.
2. Ejecuta el instalador y deja las opciones por defecto (puedes seleccionar Git Bash como terminal preferida).
3. Verifica la instalación abriendo la terminal (CMD, PowerShell o Git Bash) y ejecutando:
```bash
git --version
```

## Linux (Debian/Ubuntu)
Abre una terminal y ejecuta:
```bash
sudo apt update
sudo apt install git
```
Verifica la instalación:
```bash
git --version
```

## macOS

### Opción 1: con Homebrew
```bash
brew install git
```

### Opción 2: usando Xcode Command Line Tools
Al ejecutar `git` por primera vez desde la terminal, macOS te preguntará si deseas instalar las herramientas. Acepta y se instalará automáticamente.

Verifica la instalación:
```bash
git --version
```

---

## Configurar tu nombre y correo (obligatorio para hacer commits)
```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu@correo.com"
```

---

## Comprobar configuración
```bash
git config --list
```

