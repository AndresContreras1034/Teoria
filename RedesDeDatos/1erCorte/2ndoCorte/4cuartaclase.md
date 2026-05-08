# Clase — 08/05/2026

# Capa de Aplicación

En el modelo OSI, la capa de aplicación suele verse junto con las capas de:

- Aplicación
- Presentación
- Sesión

En la práctica de redes, las capas de **sesión** y **presentación** no suelen tener tanta relevancia operativa.  
Lo más importante es la **capa de aplicación**, especialmente desde el punto de vista de los **protocolos**.

## Idea principal

En redes, no interesa tanto la aplicación visual que usa el usuario, sino el protocolo que permite su funcionamiento.

### Ejemplo

- Usuario: Outlook / Gmail
- Redes: SMTP, POP3, IMAP

Sin protocolos, la aplicación no podría comunicarse.

---

# Protocolos de la capa de aplicación

Algunos protocolos importantes:

- POP3
- DNS
- HTTP
- FTP
- SNMP
- SMTP
- NNTP
- Telnet
- SSH

## Características

Como cualquier protocolo, poseen:

- Cabecera
- Información de control
- Estructura
- Formato

Sin embargo, en capa de aplicación normalmente no se profundiza tanto en la estructura interna del paquete, sino en:

- Configuración
- Funcionamiento
- Servicios que ofrecen

### Ejemplo

Outlook necesita configuración para funcionar, pero realmente depende de protocolos como:

- SMTP
- POP3
- IMAP

---

# Inter-VLAN Routing

## VLAN Legacy

El inter-VLAN routing permite que dispositivos de diferentes VLAN puedan comunicarse entre sí.

---

# Switches de Capa 3 (S3)

Los switches de capa 3 son dispositivos multicapa.

## Características

- Funcionan como switch y router al mismo tiempo
- Son considerados híbridos
- Pueden realizar enrutamiento
- Tienen mayor velocidad de procesamiento
- Son más robustos que un switch de capa 2

### Idea clave

Un switch capa 3 es básicamente:

> Un switch de capa 2 con capacidades de router.

Físicamente suelen parecerse a un switch normal.

---

# Arquitectura básica de redes

Las redes empresariales normalmente se dividen en 3 capas:

1. Acceso
2. Distribución
3. Core

Estas son las capas mínimas de una arquitectura de red tradicional.

---

# Capa de Acceso

## Función

Es la capa donde se conectan los usuarios finales.

### Dispositivos comunes

- Switches de capa 2

---

# Capa Core

## Función

Es el núcleo o corazón de la red.

Aquí suelen encontrarse:

- Servidores
- Bases de datos
- Aplicaciones empresariales
- Servicios críticos

### Ejemplos

- Servidor de correo
- Servidor web
- Servidor de bases de datos

---

# Capa de Distribución

## Función

Es la capa intermedia entre acceso y core.

Aquí normalmente se ubican los:

- Switches de capa 3

## Razones

Los switches capa 3:

- Son rápidos
- Permiten enrutamiento
- Facilitan comunicación entre VLAN
- Mejoran el rendimiento de la red

También suele existir redundancia entre:

- Acceso ↔ Distribución

para mejorar disponibilidad y tolerancia a fallos.

---

# Comunicación entre VLAN

En la capa de acceso se crean VLAN para separar dispositivos.

Sin embargo, eventualmente las VLAN necesitan comunicarse entre sí.

Para eso se utiliza:

- Inter-VLAN Routing
- Switches de capa 3

---

# Idea Final

Los switches de capa 3:

- Integran funciones de switching y routing
- Se utilizan principalmente en distribución
- No suelen colocarse en acceso debido a su costo elevado
- Permiten redes más rápidas y eficientes

  # Legacy Inter-VLAN Routing

En el modelo Legacy Inter-VLAN Routing, cada VLAN necesita un enlace físico independiente hacia el router.

## Funcionamiento

- Cada VLAN utiliza una interfaz física distinta.
- El router necesita una conexión separada por VLAN.
- Cada enlace maneja únicamente el tráfico de una VLAN.

### Ejemplo

Si existen:

- 2 VLAN → se necesitan 2 enlaces físicos
- 10 VLAN → se necesitan 10 enlaces físicos

---

# Problemas del Legacy Inter-VLAN Routing

## Desventajas

- No es escalable
- Requiere demasiadas interfaces físicas
- Incrementa el costo
- Complica la administración
- Consume mucho hardware

## Conclusión

Funciona en escenarios pequeños, pero en redes medianas o grandes deja de ser práctico.

Actualmente:

- Es poco común
- Es costoso
- Ya no es una solución óptima

---

# Router-on-a-Stick (ROAS)

El Router-on-a-Stick mejora el modelo anterior utilizando:

- Un solo enlace físico
- VLAN Trunking
- Subinterfaces

---

# Concepto de Trunk

En este modelo:

- El switch y el router se conectan mediante un enlace troncal (trunk).
- El trunk transporta tráfico de múltiples VLAN simultáneamente.
- Se utiliza el protocolo:

## IEEE 802.1Q

Este protocolo agrega etiquetas VLAN a los frames para identificar a qué VLAN pertenece cada uno.

---

# Funcionamiento del Router-on-a-Stick

## Idea principal

Solo se necesita:

- Un router
- Una interfaz física
- Un enlace trunk hacia el switch capa 2

Sobre esa única interfaz física se crean:

- Subinterfaces lógicas

Cada subinterfaz representa una VLAN distinta.

---

# Subinterfaces

Las subinterfaces permiten dividir una interfaz física en múltiples interfaces lógicas.

## Características

- Cada subinterfaz pertenece a una VLAN
- Cada una tiene su propia IP
- Permiten el enrutamiento entre VLAN

### Concepto importante

La interfaz física actúa como un:

> Multiplexor de tráfico VLAN

---

# Ventajas del Router-on-a-Stick

## Comparado con Legacy

- Reduce cantidad de enlaces físicos
- Disminuye costos
- Mejora escalabilidad
- Facilita administración

## Uso actual

Aunque no es el mejor escenario moderno, todavía funciona bien en:

- Redes medianas
- Laboratorios
- Entornos pequeños

---

# Switches de Capa 3 (S3)

Un switch de capa 3 combina:

- Funciones de switching
- Funciones de routing

Por eso suele verse como:

> “Una caja con un switch y un router juntos”.

---

# SVI (Switch Virtual Interface)

En switches capa 3 se utilizan las:

## SVI — Switch Virtual Interfaces

Son interfaces virtuales configuradas directamente en el switch.

Cada VLAN puede tener:

- Una SVI
- Una dirección IP
- Capacidad de enrutamiento

---

# Diferencias con Router-on-a-Stick

## Router tradicional

Los routers normalmente tienen:

- Pocas interfaces físicas

No es común ver routers con:

- 20
- 40
- o más interfaces físicas

---

## Switch capa 3

Los switches capa 3 poseen:

- Muchos puertos
- Mayor capacidad de tráfico
- Mejor rendimiento

Además:

- Están diseñados específicamente para manejar tráfico interno de VLAN
- Realizan enrutamiento de forma más eficiente

---

# Ventajas de los Switches de Capa 3

## Beneficios

- Mayor velocidad
- Mejor manejo de tráfico
- Más escalabilidad
- Menor congestión
- Menor necesidad de interfaces adicionales

Hoy en día es la solución más utilizada para inter-VLAN routing.

---

# Procesamiento en Routers y Switches

## Router

El router toma decisiones:

- Basadas en enrutamiento
- Principalmente lógicas

---

## Switch

El switch toma decisiones:

- Basadas principalmente en hardware

---

## Switch Capa 3

El switch capa 3 combina ambos enfoques:

- Hardware
- Software

Por eso logra:

- Mayor velocidad
- Mejor rendimiento
- Mayor eficiencia

---

# Idea Final

En la práctica:

- Un router es un dispositivo orientado a comunicación y enrutamiento.
- Un switch capa 3 es un dispositivo optimizado para manejo eficiente de datos y tráfico interno de red.
