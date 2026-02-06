# Redes de Datos  
**Fecha:** 06/02/2025

## Temas principales

### Enrutamiento, IPv4 e IPv6
- Conceptos básicos de **enrutamiento**
- Direccionamiento **IPv4**
- Direccionamiento **IPv6**

### Modelo OSI
- Capas **3 a la 7** del modelo OSI:
  - Capa 3: Red
  - Capa 4: Transporte
  - Capa 5: Sesión
  - Capa 6: Presentación
  - Capa 7: Aplicación

### Diferencias entre IPv4 e IPv6
- Estructura de direcciones
- Cantidad de direcciones disponibles
- Soporte para enrutamiento y escalabilidad
- Simplificación del encabezado
- Soporte nativo para seguridad (IPsec)

### Enrutamiento
- Concepto general de enrutamiento
- Tipos de enrutamiento:
  - **Enrutamiento estático**
  - **Enrutamiento dinámico**

### Protocolos de enrutamiento
- Protocolos de enrutamiento **dentro de una red** (IGP)
- Protocolos de enrutamiento **entre diferentes redes** (EGP)
- Protocolos que permiten la interconexión de redes

### Importancia de BGP
- Rol de **BGP (Border Gateway Protocol)** en Internet
- Interconexión entre sistemas autónomos
- Control de rutas a gran escala

### Direccionamiento
- Aprender a direccionar redes
- Asignación correcta de direcciones IP

## Enfoque del aprendizaje
- No interesa el aspecto teórico profundo
- Prioridad en el **concepto técnico**
- Mayor énfasis en la **parte práctica**


# Parciales

- **1er parcial:** 13 de marzo  
- **2do parcial:** 24 de abril  
- **3er parcial:** 5 de junio  

**Grupo:** 3

---

## 1era clase

### Modelo OSI
- El semestre pasado se trabajó principalmente entre la **capa física** y la **capa de enlace de datos** al comienzo.
- En este semestre se va a **completar todo el ciclo del modelo OSI**.

### Enfoque inicial
La primera parte se centra en:
- **IPv4**
- **IPv6**
- **Enrutamiento dinámico**
- **IPX**
- **ICMP**

Se trabajará sobre:
- **Capa de red**
- **Determinación del camino**
- **Direccionamiento lógico**

### Protocolos de la capa de red
- IP
- ARP
- ICMP
- IGMP
- OSPF

### Capa de enlace de datos
- Capa **MAC**
- Subcapa **MLLC**

### Capa de transporte
- TCP
- UDP
- SCP

### Capa de aplicación
- Capa de aplicación y sus protocolos

### Encapsulación
- **Encapsulación Ethernet**

---

## Capas física y de enlace de datos
- En estas capas se trabaja con los estándares:
  - **802.3**
- Es importante empezar a entender la interacción entre capas.
- La **capa de enlace de datos** comienza a comunicarse directamente con la **capa de red**.

### Comunicación entre capas
- Ya no depende exclusivamente del medio físico.
- Siempre hay comunicación entre **capas adyacentes**.
- Entre la capa de red y la de enlace de datos puede haber comunicación inalámbrica.

### Tecnologías inalámbricas
- **WiFi:** 802.11  
- **Bluetooth:** 802.15  

### Independencia de la capa de red
- Existe dependencia entre lo que ocurre en la **capa física** y la **capa de enlace de datos**.
- Esa dependencia **se pierde en la capa de red**.
- No importa el protocolo de acceso:
  - WiFi
  - Bluetooth
- La capa de red es **independiente del medio de conexión**.

### Evolución tecnológica
- En el pasado existían más posibilidades de interconexión.
- Actualmente esas opciones se reducen.
- Existen elementos y tecnologías que comienzan a desaparecer.
- Esto obedece a mejoras en el mundo físico.
- Es posible que en el futuro se desarrollen mejores mecanismos de transmisión inalámbrica y se abandone el cableado físico.

### Relación con la capa 3
- Siempre que haya mejoras en el mundo físico, habrá mejoras en la **capa 3 (red)**.


```mermaid

graph LR
    A[Preambulo 7 bytes] --> B[SFD 1 byte] --> C[MAC Destino 6 bytes] --> D[MAC Origen 6 bytes] --> E[Tipo o Longitud 2 bytes] --> F[Datos 46 a 1500 bytes] --> G[FCS CRC 4 bytes]


```


# MAC Address Format
- Un ordenador puede tener **múltiples direcciones IP** en la práctica.

---

# IPv4

## Capa de Red

En la **capa de red** sucede “la magia”. Ocurren principalmente tres cosas:

1. **Direccionamiento lógico**
2. **Proceso de enrutamiento**
3. **Gestión de control**

Desde el **modelo OSI**, la capa de red parece simple, pero desde el **modelo TCP/IP** ocurren muchas más cosas.

- El modelo **OSI no está relacionado directamente con IP**.
- El modelo **TCP/IP sí está directamente relacionado con IP**.

En la capa de red existen protocolos como:
- OSPF (enrutamiento)
- ICMP (control)

### Direccionamiento lógico
- El direccionamiento lógico identifica a los **dispositivos finales**:
  - Servidores
  - Computadores
  - Consolas
- Todo dispositivo que se conecte a una red **debe tener una dirección IP**.
- Sabemos que los dispositivos tienen IP, pero no siempre **cómo la obtienen**.

#### Asignación de direcciones IP
- **Manual (estática)**
- **Dinámica (DHCP)**

Todo dispositivo necesita **sí o sí** una dirección IP.  
La IP funciona como una **cédula o identificador dentro de la red**.

---

## Encapsulamiento
- La capa de red **encapsula las PDU de la capa de transporte**.
- Estas PDU descienden hacia la **capa de enlace de datos**.
- El flujo puede ser:
  - De arriba hacia abajo
  - De abajo hacia arriba

Cada vez que usamos Internet o una red:
- Todas las **capas trabajan al mismo tiempo**
- Solo existe comunicación **entre capas pares**
- Siempre es **capa con capa**

### Encapsulamiento IP
- La PDU de la capa de transporte baja a la capa de enlace.
- Se convierte en **datos (Data)** y en una nueva **PDU**.

---

## Enrutamiento
- La capa de red:
  - Selecciona el **mejor camino**
  - Dirige los paquetes hacia su destino
- Existen protocolos de **vector de distancia**

Ejemplo típico:
- Un PC con dirección IP se comunica con otro PC
- Cada dispositivo tiene sus **7 capas bien definidas**
- Todo ocurre constantemente en la red

---

## NAT
- **NAT (Network Address Translation)**
- Permite la traducción de direcciones IP
- Interactúan diferentes protocolos

---

## TCP/IP e IP
- **IP es nativo del modelo TCP/IP**
- Desde la capa de red hacia arriba todo pertenece a **TCP/IP**

### Origen del modelo TCP/IP
- Nace en el ámbito **militar**
- Hace más de **40 años**, cada fabricante usaba:
  - Sus propios cables
  - Sus propios protocolos
- Todo era **incompatible**

Desde **ENIAC (1946)**:
- No existía estandarización

Una universidad desarrolló:
- Un sistema operativo universal (ZENIX)
- Protocolos para intercambiar información de manera estándar

Ahí nace:
- **TCP/IP**
- Dentro de este modelo, nace **IP**

---

## Evolución y adopción
- Permite tecnologías actuales como:
  - Correos electrónicos
  - HTTP (nativo del modelo)
- El sistema fue entregado a los militares
- Luego se compartió con todo el mundo
- Fue un **regalo tecnológico importante**

---

## Direccionamiento IP
- IP usa direcciones de **32 bits**
- Separadas en **4 octetos**
- Aproximadamente **4 mil millones de direcciones**
- Se pensó que durarían décadas
- Solo alcanzaron alrededor de **una década**
- Las direcciones comenzaron a agotarse

---

## IPv4 e IPv6
- IPv4 → 32 bits
- Nace **IPv6** para solucionar el agotamiento

### Clases de direcciones
- Direcciones **A, B y C**
- Tecnología **antigua y obsoleta**

---

## Características de IP
- Bajo **overhead**
- Poca información de control
- **No orientado a conexión**
  - No establece conexión antes de enviar paquetes
  - Similar a enviar una carta por correo
- Los paquetes:
  - Pueden perderse
  - Pueden llegar desordenados
- Es un protocolo de **mejor esfuerzo**
- IP es conocido como *Internet Protocol*
- También se le llama **protocolo no responsable**

  # IPv4 e IPv6

## Independencia entre IPv4 e IPv6
- **IPv4 e IPv6 son totalmente independientes**.
- No son “primos” ni “hermanos”.
- Al ser independientes, un dispositivo necesita **mínimo dos direcciones** para trabajar con ambos.
- Actualmente **conviven IPv4 e IPv6**.

---

## Comunicación no orientada a conexión
- Ejemplo: **WhatsApp**
- Es una comunicación **no orientada a conexión**.
- Los mensajes se envían sin establecer conexión previa.
- Se pueden enviar varios mensajes y:
  - Puede que lleguen todos
  - Puede que no llegue ninguno

---

## Media Independent (Independiente del medio)

### IPv4 – Independencia del medio
- IP opera **independientemente del medio físico** usado en capas inferiores.
- Los paquetes IP pueden viajar como:
  - Señales eléctricas (cable de cobre)
  - Señales ópticas (fibra)
  - Señales de radio (inalámbrico)

### Rol de la capa de enlace de datos
- La **capa de enlace de datos (OSI)**:
  - Toma el paquete IP
  - Lo prepara para su transmisión por el medio físico

### MTU (Maximum Transmission Unit)
- El tamaño máximo de la PDU que un medio puede transportar se llama **MTU**.
- Cada medio tiene su propia MTU.
- La capa de enlace:
  - Informa el valor de la MTU a la capa de red
- La capa de red:
  - Determina el tamaño máximo de los paquetes IP

---

## Transición de IPv4 a IPv6
- Se lleva aproximadamente **6 años** en transición activa.
- Aun así, **IPv4 sigue siendo predominante**.
- A muchas personas:
  - Les cuesta entender IPv4
  - Mucho más IPv6

### Realidad de la transición
- Hace unos **20 años**, un CEO de MAIT mencionó:
  - Llevamos 10 años de transición
  - Pasarán 20 más y aún no habremos terminado
- No se sabe cuándo ocurrirá el cambio completo.
- Para eliminar IPv4 sería necesario:
  - Una fecha oficial (ejemplo: 1 de enero de 2030)
  - Un período prudencial de adaptación para empresas

### Estado actual
- Casi **ningún operador** en el mundo está completamente en IPv6.
- IPv4 **no está de salida**.
- IPv4 seguirá activo **al menos otros 10 años**.

---

## Encabezado del paquete IPv4

### Campos del encabezado IPv4
- Versión
- Differentiated Services (DiffServ / DS)
- Header Checksum
- Time To Live (TTL)
- Protocol
- Dirección IPv4 de origen
- Dirección IPv4 de destino

### Overhead
- El encabezado IPv4 tiene un tamaño mínimo de:
  - **20 bytes de overhead**
 
    



