# Clase 5 — 13/03/2026  
## Enrutamiento estático y dinámico

## 1. Concepto general

En redes, el **enrutamiento** puede ser **estático** o **dinámico**.  
En la práctica, **no son excluyentes**: normalmente se utilizan **ambos** según las necesidades de la red.

- Se pueden usar **rutas estáticas y protocolos dinámicos al mismo tiempo**.
- Incluso es posible tener **más de un protocolo de enrutamiento dinámico funcionando en la misma red**.
- No existe una regla que obligue a usar **solo un tipo de enrutamiento**.

Por lo tanto, la elección depende del **tamaño de la red, la complejidad y los objetivos de administración**.

---

# 2. Enrutamiento estático

El **enrutamiento estático** consiste en rutas configuradas **manualmente por el administrador** en los routers.

Estas rutas **no cambian automáticamente** si la topología de la red se modifica.

## Características

- Configuración manual.
- Bajo consumo de recursos del router.
- Mayor control por parte del administrador.
- No se adapta automáticamente a cambios en la red.

## Escenarios comunes de uso

Las rutas estáticas se utilizan generalmente en los siguientes casos:

- **Ruta predeterminada (Default Route)**  
  Para reenviar paquetes hacia un **proveedor de servicios (ISP)**.

- **Redes pequeñas**  
  Donde hay **pocos routers** y la topología es simple.

- **Redes con rutas muy estables**  
  Donde los cambios de topología son poco frecuentes.

- **Rutas de respaldo**  
  Como rutas alternativas si falla una ruta dinámica.

---

# 3. Enrutamiento dinámico

El **enrutamiento dinámico** utiliza **protocolos de enrutamiento** que permiten a los routers **aprender automáticamente las rutas disponibles en la red**.

Estos protocolos intercambian información entre routers para **determinar la mejor ruta hacia cada destino**.

## Características

- Aprenden rutas automáticamente.
- Escalan bien en redes grandes.
- Detectan cambios de topología.
- Recalculan rutas cuando ocurre una falla.

Si se produce un **cambio en la topología de red** (por ejemplo, un enlace que se cae), los protocolos dinámicos **actualizan automáticamente las tablas de enrutamiento**.

## Escenarios comunes de uso

Los protocolos de enrutamiento dinámico se utilizan constantemente en:

- **Redes medianas o grandes**
- **Infraestructuras con muchos routers**
- **Redes donde la topología cambia con frecuencia**
- **Entornos donde se necesita alta disponibilidad**
- **Redes empresariales y proveedores de servicios**

---

# 4. Uso combinado

En muchos diseños de red se utiliza un **modelo híbrido**:

- **Rutas estáticas** para conexiones específicas o rutas por defecto.
- **Protocolos dinámicos** para la distribución automática de rutas dentro de la red.

Este enfoque permite **control, estabilidad y escalabilidad al mismo tiempo**.

# Clase 5 — 13/03/2026  
## Enrutamiento estático y dinámico (continuación)

---

# 5. Redes grandes y necesidad de enrutamiento dinámico

En **redes muy grandes**, es común que:

- Aparezcan **nuevos servicios de red**.
- Se **eliminen o desconecten** otros servicios.
- Cambien constantemente las **rutas disponibles**.

Por ejemplo:

Si **se pierde el acceso a una red**, no tiene sentido que los routers **sigan intentando enviar tráfico hacia esa red**.

En estos casos, el **enrutamiento dinámico** permite que:

- Los routers **detecten automáticamente el cambio**.
- **Actualicen las rutas disponibles**.
- Dejen de enviar tráfico a redes que ya **no están accesibles**.

A medida que la red **crece**, los **protocolos de enrutamiento dinámico aprenden automáticamente las rutas** sin intervención manual constante.

---

# 6. No existen recetas universales para diseñar redes

No existen **plantillas ni recetas únicas** para diseñar una red.

Cada red depende de:

- El **tamaño**
- El **tipo de organización**
- Los **servicios utilizados**
- Los **requisitos de seguridad**
- La **infraestructura disponible**

Por esta razón, el diseño de red **siempre debe adaptarse al contexto específico**.

---

# 7. Complejidad de configuración

## Enrutamiento dinámico

El enrutamiento dinámico puede ser **más complejo de configurar inicialmente**, ya que:

- Requiere **configuración del protocolo**
- Definir **parámetros y políticas**
- Ajustar el comportamiento del protocolo

Sin embargo, **no importa el tamaño de la red**, ya que una vez configurado:

- El protocolo **se adapta automáticamente**
- Aprende nuevas rutas
- Reacciona ante **cambios de topología**

---

## Enrutamiento estático

El enrutamiento estático es **simple al inicio**, pero **se vuelve complicado cuando la red crece**.

Problemas principales:

- Cada ruta debe configurarse **manualmente**.
- Requiere **intervención constante del administrador**.
- Cada cambio en la red implica **modificar configuraciones en los routers**.

---

# 8. Adaptación a cambios

### Enrutamiento dinámico

Los protocolos dinámicos **se adaptan automáticamente** a cambios como:

- Caída de enlaces
- Nuevos routers
- Nuevas redes

Los routers **intercambian información entre ellos**, compartiendo datos sobre las rutas disponibles.

En otras palabras, los routers **“hablan entre sí”** para actualizar sus tablas de enrutamiento.

---

# 9. Consideraciones de seguridad

Debido a que los routers **intercambian información constantemente** en protocolos dinámicos:

- Un atacante podría **interceptar información**
- O incluso **suplantar un router**
- Para **inyectar rutas falsas** en la red

Esto puede permitir ataques como:

- Redirección de tráfico
- Intercepción de datos

En cambio, en el **enrutamiento estático**:

- No existe comunicación automática entre routers.
- Las rutas están configuradas manualmente.

Por lo tanto, la única forma de modificar rutas sería **accediendo directamente al router**.

Sin embargo, si un atacante logra acceder al router, **la red ya está comprometida**.

---

# 10. Uso de recursos

Los **protocolos de enrutamiento dinámico** utilizan recursos del router:

- CPU
- Memoria
- Ancho de banda (para intercambio de información)

Esto ocurre porque los routers **deben comunicarse constantemente** para mantener actualizadas sus tablas de rutas.

En contraste, el **enrutamiento estático consume muy pocos recursos**, ya que:

- No hay intercambio de información
- No hay cálculos de rutas

---

# 11. Predicción de rutas

### Enrutamiento dinámico

En el enrutamiento dinámico **no siempre es fácil predecir la ruta exacta** que tomará un paquete.

Esto depende de:

- El **protocolo de enrutamiento**
- Las **métricas utilizadas**
- Las **rutas disponibles en ese momento**

La ruta elegida suele ser **la mejor según el algoritmo del protocolo**, pero puede cambiar si la topología cambia.

---

### Enrutamiento estático

En el enrutamiento estático:

- El **administrador decide exactamente la ruta**.
- El tráfico **siempre seguirá el camino configurado**, a menos que se cambie manualmente.

Esto da **mayor control**, pero **menos flexibilidad**.

---

# 12. Evolución de los protocolos de enrutamiento dinámico

Los protocolos de enrutamiento **no han cambiado mucho en los últimos años**.

El último protocolo importante apareció alrededor de **2008**.

En lugar de crear nuevos protocolos:

- Algunos **han desaparecido**
- Otros **se mantienen porque son suficientemente eficientes**

Esto ocurre porque **los protocolos actuales funcionan bien y cumplen su propósito**.

---

# 13. Protocolos de enrutamiento exterior (EGP)

Originalmente existía un protocolo llamado **EGP (Exterior Gateway Protocol)**, que hoy en día **ya no se utiliza**.

Actualmente, el único protocolo de enrutamiento exterior ampliamente usado es:

- **BGP (Border Gateway Protocol)** — creado en **1995**

---

# 14. Tipos de protocolos de enrutamiento

Existen **dos grandes clases de protocolos de enrutamiento**:

## 1. Protocolos de enrutamiento interior (IGP)

Se utilizan **dentro de una misma organización o red administrativa**.

Ejemplo:

- Dentro de una empresa
- Dentro de una universidad
- Dentro de un proveedor de red

---

## 2. Protocolos de enrutamiento exterior (EGP)

Se utilizan para **interconectar diferentes sistemas autónomos**.

Un **Sistema Autónomo (AS)** es:

> Una red o conjunto de redes administradas por **una misma entidad administrativa**.

---

# 15. Ejemplos de sistemas autónomos

Ejemplo académico:

- Conectar la red de **una universidad** con la red de **otra universidad**.

Ejemplo empresarial:

- Interconectar redes de **diferentes proveedores de internet**.

---

# 16. Ejemplo de integración de redes

Un caso común ocurre cuando **una empresa adquiere o absorbe a otra**.

Por ejemplo:

- La integración de redes entre **Tigo y Movistar**

En estos escenarios es necesario **interconectar los sistemas autónomos** para permitir el intercambio de tráfico entre ambas infraestructuras.
