# BGP (Border Gateway Protocol)

## Descripción
BGP es un **protocolo de Internet** utilizado para el enrutamiento entre sistemas autónomos (AS).  
Permite que el tráfico de una red viaje de una a otra a través de Internet.

## Sistemas Autónomos (AS)
Un sistema autónomo es un conjunto de redes conectadas que:
- Se encuentran bajo el dominio de uno o más operadores de red.
- Comparten políticas de enrutamiento comunes hacia el exterior.

## Características de BGP
- Opera entre diferentes sistemas autónomos.
- Permite el intercambio de información de rutas.
- Gestiona el tráfico entre redes mediante políticas de enrutamiento.

## ASN (Autonomous System Number)
- Cada sistema autónomo posee un **ASN único**.
- Este número identifica al sistema dentro de Internet.
- Los ASN son asignados por la **IANA (Internet Assigned Numbers Authority)**.

## Función principal
- Manejar un conjunto de prefijos IP.
- Aplicar políticas de enrutamiento para determinar cómo se enruta el tráfico hacia otras redes.

  # BGP (Border Gateway Protocol) - Detalles Avanzados

## Versiones de BGP
Existen varias versiones de BGP (1, 2, 3 y 4), siendo **BGP-4** la versión actual.

### BGP-4
- Permite anunciar conjuntos de destinos como **prefijos IP** de manera flexible.
- Corrige errores y ambigüedades de versiones anteriores.

---

## Mensajes BGP

BGP utiliza mensajes para intercambiar información entre routers.

### Características generales
- Existen **4 tipos de mensajes**.
- Funcionan dentro de una máquina de estados finitos (FSM) con **6 estados**.
- Todos los mensajes incluyen un **encabezado estándar de 16 bits**.
- Tamaño máximo del mensaje: **4000 bits**.

### Tipos de mensajes

#### 1. OPEN
- Negocia los parámetros de la sesión.
- Incluye:
  - Versión de BGP
  - ASN
  - Temporizador (Hold Time)
  - Identificador BGP

#### 2. UPDATE
- Anuncia nuevas rutas.
- Actualiza atributos de rutas existentes.

#### 3. KEEPALIVE
- Tamaño típico: **19 bits**.
- Se envía aproximadamente cada **60 segundos**.
- Reinicia el temporizador (Hold Time).
- Mantiene la sesión activa.
- Si el temporizador llega a 0, la sesión se cae.

#### 4. NOTIFICATION
- Se envía cuando ocurre un error en la sesión BGP.
- Ejemplos de errores:
  - Encabezado inválido
  - Mensaje incompleto
  - Temporizador expirado

---

## FSM (Finite State Machine)

BGP utiliza una **máquina de estados finitos (FSM)** para controlar la sesión entre routers.

### Características
- Define el comportamiento de la conexión.
- Depende de:
  - Mensajes intercambiados
  - Temporizadores
  - Eventos de red
- Usa **TCP puerto 179**, lo que garantiza una conexión más confiable.

---

## Estados del FSM (6 estados)

### 1. Idle
- Estado inicial.
- No hay conexión activa.

### 2. Connect
- Intenta establecer conexión TCP con el vecino.
- Si tiene éxito → pasa a **OpenSent**.
- Si falla → pasa a **Active**.

### 3. Active
- Reintenta establecer la conexión.
- Si lo logra → envía mensaje **OPEN**.

### 4. OpenSent
- Espera recibir el mensaje **OPEN** del vecino.
- Se negocian parámetros.
- Si todo es compatible → pasa a **OpenConfirm**.

### 5. OpenConfirm
- Espera recibir mensaje **KEEPALIVE**.
- Si lo recibe → la conexión se considera válida.

### 6. Established
- Sesión completamente operativa.
- Se intercambian:
  - Mensajes **UPDATE**
  - Mensajes **KEEPALIVE** de forma continua

  # BGP - Sesiones, Route Reflector y Selección de Rutas

## Sesiones BGP

### eBGP vs iBGP

#### eBGP (External BGP)
- Intercambia información de enrutamiento entre **diferentes sistemas autónomos (AS)**.
- Se establece entre routers de distintos AS.
- **Modifica el atributo AS_PATH** agregando su propio ASN.
- Las rutas aprendidas se pueden redistribuir a:
  - iBGP
  - otros vecinos eBGP
- Generalmente usa:
  - Conexión punto a punto
  - **TTL = 1**

---

#### iBGP (Internal BGP)
- Se usa dentro del **mismo sistema autónomo**.
- Permite comunicación entre routers internos.
- **No modifica el AS_PATH**.
- Restricción:
  - No se pueden propagar rutas aprendidas de iBGP a otros vecinos iBGP.
- Distancia administrativa: **200**
- Selecciona rutas con **mejor preferencia (menor métrica interna)**.

---

## Ejemplo de AS_PATH

Para la red: `12.0.0.0/24`

- ASN100 → `(100)`
- ASN200 → `(100, 200)`
- ASN300 → `(300, 200, 100)`

---

## Problema: Full Mesh en iBGP

En iBGP, todos los routers deben conectarse entre sí:

- Fórmula:
- sesiones = n(n - 1) / 2

- Ejemplos:
- 10 routers → 45 sesiones
- 100 routers → 4950 sesiones

⚠️ Problema:  
- Alta complejidad
- Consumo de recursos

---

## Solución: Route Reflector (RR)

- Router con autoridad para **reflejar rutas iBGP**.
- Reduce la necesidad de full mesh.

### Roles

- **Route Reflector (RR)**: nodo central
- **Clients**: reciben rutas del RR
- **Non-clients**: mantienen comportamiento tradicional

### Funcionamiento
- Un cliente anuncia rutas al RR.
- El RR las refleja a otros clientes.
- Evita la necesidad de conexiones directas entre todos.

### Cluster
- Grupo de routers con un RR.
- Usa **Cluster ID** para evitar bucles.
- Mantiene una lista (Cluster List) para control.

### Ventaja
- Pasa de crecimiento:
- ❌ Cuadrático  
- ✅ Lineal

---

## PATH Vector

- Mecanismo usado por BGP para construir rutas.
- Transporta la secuencia de AS recorridos (**AS_PATH**).

---

## Atributos BGP

### Tipos

#### Well-known
- Obligatorios.
- Todos los routers los reconocen.
- Si faltan → la ruta se descarta.

#### Optional
- No obligatorios.
- Pueden ser ignorados si no se reconocen.

---

## Fase 0 - Validación de rutas

Antes de elegir la mejor ruta, BGP descarta:

- Rutas **no sincronizadas**.
- Rutas sin coincidencia en la tabla de enrutamiento.
- **Next-hop inalcanzable**.
- Presencia del AS local en el AS_PATH (evita loops).

---

## Fase 1 - Best Path Algorithm

BGP selecciona la mejor ruta comparando atributos en orden:

### Criterios de selección

1. **Weight (Cisco)**
 - Mayor valor = mayor prioridad.

2. **Local Preference**
 - Mayor valor = mejor salida del AS.

3. **Ruta local**
 - Preferencia por rutas originadas en el router.

4. **AS_PATH**
 - Se prefiere el más corto.

5. **Origin**
 - IGP > EGP > Incomplete

6. **MED (Multi-Exit Discriminator)**
 - Menor valor = mejor.
 - Solo se compara dentro del mismo AS.

7. **eBGP vs iBGP**
 - Se prefieren rutas eBGP.

8. **Métrica hacia el next-hop**
 - Menor costo interno (IGP).

9. **Multipath**
 - Permite balanceo si está habilitado.

10. **Antigüedad de la ruta**
- Se prefiere la más antigua (estabilidad).

11. **Router ID**
- Se elige el menor valor.

12. **Cluster List**
- Se prefiere la lista más corta.

13. **Dirección IP del vecino**
- Se elige la más baja en caso de empate final.

---

## Notas adicionales

- BGP usa **TCP puerto 179**.
- Mantiene sesiones mediante mensajes **KEEPALIVE**.
- Evita bucles usando:
- AS_PATH
- Cluster ID
- Router ID

# BGP - Políticas y Peering

## Políticas en BGP

Las políticas en BGP permiten controlar:
- Qué rutas se anuncian
- A quién se anuncian
- Qué rutas se aceptan
- Cómo se prioriza el tráfico

Son fundamentales para la toma de decisiones en el enrutamiento entre sistemas autónomos.

---

## Peering

### Definición
- Relación **horizontal** entre sistemas autónomos (AS).
- Se intercambian rutas **sin intención comercial directa**.

### Características
- Un AS anuncia:
  - ✅ Rutas de sus **clientes**
  - ❌ No anuncia rutas de sus **proveedores**
- Reduce:
  - Latencia
  - Costos
- Evita intermediarios en el tráfico.

---

## Puntos de Intercambio (IXP)

- Infraestructura física donde múltiples AS se conectan.
- Permiten establecer sesiones de peering de forma eficiente.
- Mejoran:
  - Velocidad
  - Conectividad
  - Reducción de costos

---

## Relación Cliente - Proveedor

### Ejemplo
- Una universidad contrata a un ISP (ej: Claro).
- El proveedor:
  - Proporciona acceso a Internet.
  - Comparte rutas globales.
- El cliente:
  - Se vuelve visible en Internet.
  - Anuncia sus propias redes.

---

## Tipos de Relaciones en BGP

| Relación           | Tipo        | Intercambio de rutas                         |
|-------------------|------------|---------------------------------------------|
| Cliente-Proveedor | Vertical   | Cliente recibe Internet completo            |
| Peering           | Horizontal | Intercambio limitado (sin tránsito global)  |

---

## Ideas Clave de Políticas BGP

- Controlar qué tráfico entra y sale del AS.
- Priorizar rutas según:
  - Costos
  - Latencia
  - Acuerdos comerciales
- Aplicar filtros de rutas para seguridad.
- Evitar:
  - Bucles
  - Rutas no deseadas

---

## Diferencias clave (Resumen)

- **Peering**:
  - Relación entre iguales
  - No hay pago directo
  - No se ofrece tránsito completo

- **Proveedor**:
  - Relación jerárquica
  - Se paga por acceso a Internet
  - Se reciben todas las rutas globales

---

## Conclusión

Las políticas BGP permiten optimizar el enrutamiento no solo a nivel técnico, sino también estratégico, considerando aspectos como costos, rendimiento y acuerdos entre organizaciones.
