## Clase 3  
**29/09/2025**

### Switches de Capa 2  

Los switches de capa 3, aunque trabajan en capas 2 y 3, suelen ser **más costosos**.  
En este curso nos centraremos en la **capa de acceso**.  

---

### Capas de Red  
- **Core** → Backbone de la red.  
- **Distribución** → Interconexión entre acceso y core.  
- **Acceso** → Donde los usuarios finales se conectan (ej: switches de capa 2).  

La conectividad de los usuarios finales a la red de la universidad normalmente se realiza con **switches de capa 2**.  

---

### Métodos de Reenvío en Switches  

Los switches deben manejar el tráfico de los dispositivos conectados y para ello existen **dos grandes métodos de reenvío**:  

#### 1. Store and Forward  
- Recolecta **toda la trama** antes de enviarla.  
- Analiza errores antes de transmitir.  
- Tamaño típico: **1500 octetos**.  
- Más seguro (no envía tramas dañadas).  
- Mayor latencia en comparación con Cut-Through.  

#### 2. Cut-Through  
- Analiza solo una parte de la trama antes de reenviarla.  
- Más rápido, pero con riesgo de transmitir errores.  
- Dos variantes:  

  - **Fast-Forward**:  
    - Empieza a reenviar apenas conoce la dirección **MAC** de destino.  
    - Puede transmitir errores.  

  - **Fragment-Free**:  
    - Lee los primeros **64 bits** de la cabecera antes de reenviar.  
    - Descarta tramas con colisiones iniciales.  
    - Reduce la probabilidad de errores.  

---

### Diagrama en Mermaid  

```mermaid
flowchart TD
    A[Switches: Métodos de Reenvío] --> B[Store and Forward]
    A --> C[Cut-Through]

    B --> B1[Recolecta toda la trama]
    B --> B2[Analiza errores antes de enviar]
    B --> B3[Mayor seguridad, más latencia]

    C --> D[Fast-Forward]
    C --> E[Fragment-Free]

    D --> D1[Envía apenas conoce MAC destino]
    D --> D2[Riesgo de transmitir errores]

    E --> E1[Lee 64 bits de cabecera]
    E --> E2[Descarta colisiones iniciales]
    E --> E3[Baja probabilidad de errores]
```
## Métodos de Memoria en Switches  

La memoria utilizada depende del **fabricante** y del **modelo de switch**. Algunos implementan múltiples opciones:  

- **Memoria basada en puertos**  
  - Cada interfaz tiene su **propia memoria independiente**.  
  - Ejemplo: un servidor en una interfaz y PCs en otras → cada uno con su recurso de memoria.  
  - Si no se usa, el recurso se desperdicia.  

- **Memoria compartida**  
  - Existe un solo bloque de memoria compartido entre todas las interfaces.  
  - Los recursos se asignan dinámicamente según la necesidad.  
  - Mejora la eficiencia al aprovechar toda la capacidad de memoria.  

```mermaid
flowchart TD
    A[Métodos de Memoria en Switches] --> B[Memoria basada en puertos]
    A --> C[Memoria compartida]

    B --> B1[Cada interfaz con memoria propia]
    B --> B2[Recurso desperdiciado si no se usa]

    C --> C1[Un solo bloque de memoria]
    C --> C2[Asignación dinámica entre interfaces]
    C --> C3[Uso más eficiente de la capacidad total]
```

---

## Duplexación en la Comunicación  

La **duplexación** define la forma en que dos dispositivos pueden comunicarse:  

- **Simplex** → Solo un sentido. Ejemplo: ver una película en cine.  
- **Half-Duplex** → Solo uno transmite a la vez. Ejemplo: Walkie Talkie.  
- **Full-Duplex** → Ambos transmiten al mismo tiempo. Ejemplo: llamada telefónica.  

> Nota: Cuando una red opera en **Half-Duplex**, normalmente se utiliza un **HUB**.  

```mermaid
flowchart TD
    D[Tipos de Duplexación] --> E[Simplex]
    D --> F[Half-Duplex]
    D --> G[Full-Duplex]

    E --> E1[Un solo sentido]
    E --> E2[Ejemplo: cine]

    F --> F1[Uno transmite a la vez]
    F --> F2[Ejemplo: Walkie Talkie]
    F --> F3[Relacionado con HUBs]

    G --> G1[Ambos transmiten simultáneamente]
    G --> G2[Ejemplo: llamada telefónica]
```

## Duplex and Speed Settings  

La **duplexación** es fundamental para evitar errores de comunicación entre dispositivos.  

- Si conectamos un dispositivo en **Full-Duplex** con otro en **Half-Duplex**, la comunicación se ajustará a la velocidad más lenta: **Half-Duplex**.  
- Esto puede generar **colisiones, pérdidas de paquetes o baja eficiencia**.  
- No todas estas configuraciones se aplican en la vida real, pues dependen de la **tecnología de red** utilizada (ej: switches modernos suelen forzar **Full-Duplex** en enlaces Gigabit).  

---

## Address Resolution Protocol (ARP)  

El **ARP (Address Resolution Protocol)** permite mapear direcciones **lógicas (IP)** a direcciones **físicas (MAC)** para que los dispositivos puedan comunicarse.  

- **Dirección Física (MAC):** Nivel de **capa 2 (enlace de datos)**, única para cada tarjeta de red.  
- **Dirección Lógica (IP):** Nivel de **capa 3 (red)**, necesaria para identificar dispositivos en una red.  

Para que dos dispositivos se comuniquen:  
1. Necesitan **direcciones IP**.  
2. ARP mantiene un registro que relaciona la **IP ↔ MAC**.  
3. En switches de capa 2:  
   - **No tienen IP propia** para transmitir datos.  
   - Solo tienen IP cuando es para **administración** (ej: acceso por consola o web).  

### Ejemplo de red local (IPv4)  
Supongamos tres dispositivos en la misma subred:  
- PC1 → `192.168.10.10`  
- PC2 → `192.168.10.20`  
- PC3 → `192.168.10.30`  
Todos deben tener dirección IP para comunicarse en esa LAN.  

---

## Comunicación en Red Remota  

Cuando el destino está en **otra red**, la dirección MAC de destino ya no es la del dispositivo remoto, sino la del **Default Gateway** (normalmente un router).  

---

### Diagrama de comunicación remota (ejemplo inventado)  

```mermaid
flowchart LR
    subgraph LAN1[Red Local 1 - 192.168.10.0/24]
        PC1[PC1 <br> 192.168.10.10] --> SW1[Switch1]
        SW1 --> R1[Router1 <br> 192.168.10.1]
    end

    R1 -->|WAN: 200.10.10.1| R2[Router2 <br> WAN: 200.10.10.2]

    subgraph LAN2[Red Local 2 - 192.168.20.0/24]
        R2 --> SW2[Switch2]
        SW2 --> PC2[PC2 <br> 192.168.20.20]
    end

    R2 -.-> Internet[(🌐 Internet)]
```

 En este escenario:  
- PC1 quiere comunicarse con PC2.  
- La **MAC de destino** de la trama que envía PC1 no es la de PC2, sino la del **Default Gateway (Router1)**.  
- Router1 se encarga de reenviar el tráfico hacia la red de destino.  


## ARP y RARP  

### ARP (Address Resolution Protocol)  
- Resuelve la **dirección MAC** de un dispositivo conociendo su **IP**.  
- Mantiene una **tabla ARP** que relaciona direcciones **IP ↔ MAC**.  
- Todo dispositivo necesita conocer la IP y la MAC de destino para comunicarse.  
- Ejemplo de uso:  
  ```cmd
  arp -a
  ```

Analogía:  
- Tengo el **nombre** de la persona (IP), pero necesito su **número telefónico** (MAC).  

---

### RARP (Reverse ARP)  
- Hace lo contrario: obtiene la **IP a partir de una dirección MAC**.  
- Fue utilizado antiguamente por dispositivos sin disco o con configuraciones mínimas.  
- Hoy en día se reemplaza por protocolos más modernos como **DHCP**.  

Analogía:  
- Tengo el **número telefónico** (MAC), pero no sé a quién pertenece (IP).  

---

### Ejemplo práctico en Windows  

Comando:  
```cmd
C:\Users\Administrator> arp -a
```

Salida simplificada:  

| Dirección de Internet | Dirección Física (MAC) | Tipo     |
|------------------------|------------------------|----------|
| 172.16.128.1          | 00-1b-17-00-01-40      | dinámico |
| 172.16.143.255        | ff-ff-ff-ff-ff-ff      | estático |
| 224.0.0.22            | 01-00-5e-00-00-16      | estático |
| 255.255.255.255       | ff-ff-ff-ff-ff-ff      | estático |

---

Comando para ver configuración de red:  
```cmd
C:\Users\Administrator> ipconfig
```

Salida simplificada:  

- **Adaptador Wi-Fi:**  
  - Dirección IPv4: `172.16.128.93`  
  - Máscara de subred: `255.255.240.0`  
  - Puerta de enlace predeterminada: `172.16.128.1`  

---

### Conclusión  
- ARP es fundamental para la comunicación en redes locales (LAN).  
- Cada vez que un dispositivo quiere comunicarse, revisa su tabla ARP para saber la **MAC** asociada a una **IP**.  
- Si no existe, el dispositivo envía una **consulta ARP broadcast** en la red.  

