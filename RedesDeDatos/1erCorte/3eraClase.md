 Clase Redes 3 – 27/02/2026

## Need for IPv6

El crecimiento exponencial de dispositivos conectados a Internet generó la necesidad de un nuevo esquema de direccionamiento IP, dando origen a IPv6.

### Comparación entre IPv4 e IPv6

- **IPv4**: Direcciones de 32 bits  
- **IPv6**: Direcciones de 128 bits  

IPv6 permite una cantidad significativamente mayor de direcciones disponibles en comparación con IPv4.

## ¿IPv4 tiene fecha de caducidad?

IPv4 no tiene una fecha oficial de caducidad. Sin embargo, el agotamiento de direcciones disponibles impulsó la adopción de IPv6 como solución a largo plazo.

## Asignación de Direcciones IP

Todo el direccionamiento IP global es administrado por la :contentReference[oaicite:0]{index=0} (IANA).

La IANA es la entidad responsable de la asignación y administración global de direcciones IP, números de sistema autónomo (ASN) y otros recursos críticos de Internet.

## Tipos de Direcciones en IPv6

- **GUA (Global Unicast Address)**  
  Es el equivalente a una dirección pública en IPv4. Son direcciones enrutable en Internet.

- **LLA (Link-Local Address)**  
  Es el equivalente funcional a las direcciones privadas en IPv4 en ciertos contextos. Se utilizan para comunicación dentro del mismo enlace o red local.

## Distribución Regional de Direcciones IP

La IANA delega bloques de direcciones IP a cinco Registros Regionales de Internet (RIR), que administran la distribución en distintas regiones del mundo:
- **LACNIC**: América Latina y el Caribe  
- **ARIN**: América del Norte  
- **RIPE NCC**: Europa, Medio Oriente y parte de Asia  
- **AFRINIC**: África  
- **APNIC**: Asia y Oceanía

  # Apuntes – Direccionamiento y Estructura en IPv6

## Estructura de una Dirección IPv6

En IPv6 existen **8 bloques hexadecimales**, separados por `:`.

- Cada bloque tiene **16 bits**
- Cada dígito hexadecimal equivale a **4 bits binarios**
- Cada bloque puede ir desde `0000` hasta `ffff` (65535 en decimal)

Ejemplo en formato completo (forma expandida):

2001:0db8:0000:1111:0000:0000:0000:0200

---

## Reglas de Escritura en IPv6

### 1. Omitir ceros a la izquierda

Se pueden eliminar los ceros a la izquierda en cada bloque.

Ejemplo:

2001:0db8:0000:1111:0000:0000:0000:0200  
↓  
2001:db8:0:1111:0:0:0:200

---

### 2. Compresión de bloques consecutivos en cero

Si existen **uno o más bloques consecutivos de 0000**, pueden reemplazarse por `::`.

Ejemplo:

2001:0db8:0000:1111:0000:0000:0000:0200  
↓  
2001:db8:0:1111::200

Reglas importantes:

- Solo se puede usar `::` **una vez por dirección**
- Se aplica donde haya **mayor cantidad de bloques consecutivos en cero**
- Si existen dos grupos separados de `0000`, se comprime el primero

---

## Prefijo en IPv6

En IPv6 **no existe la máscara de red en formato decimal punteado** como en IPv4.  
Siempre se utiliza **prefijo**.

Ejemplo:

2001:db8:1:1::1/64

---

### Prefijo más común

Casi todas las redes IPv6 utilizan:

/64

- Primeros 64 bits → Identificador de red
- Últimos 64 bits → Interface ID (identificador de interfaz)

---

## Cabecera IPv6

- Tamaño cabecera IPv4: 20 bytes
- Tamaño cabecera IPv6: 40 bytes

En IPv6 desaparecen los siguientes campos:

- Flags
- Fragment Offset
- Header Checksum

### Next Header

El campo **Next Header** en IPv6 equivale al campo **Protocol** en IPv4.  
Indica el protocolo de capa superior (TCP, UDP, ICMP, etc.) o la existencia de una cabecera de extensión.

---

## Tipos de Comunicación en IPv6

En IPv6 desaparece el concepto de **Broadcast**.

Es reemplazado por:

- Unicast
- Multicast
- Anycast

Existe un grupo multicast especial que cumple la misma función que el broadcast en IPv4:

FF02::1

Este grupo representa **todos los nodos del enlace local**, logrando el mismo efecto práctico que el broadcast, pero sin reservar un tipo específico de dirección para ello.

---

## SLAAC

SLAAC (Stateless Address Autoconfiguration)

Permite que un dispositivo se autoconfigure automáticamente sin necesidad de un servidor DHCP, utilizando información del router y su identificador de interfaz.

---

## Tipos Importantes de Direcciones IPv6

### GUA – Global Unicast Address

- Equivalente a una dirección pública en IPv4
- Globalmente única
- Enrutable en Internet
- Identificación única a nivel mundial

---

### LLA – Link Local Address

- Comienza con FE80::
- No es enrutable en Internet
- Solo tiene validez dentro del enlace local
- Se genera automáticamente en todas las interfaces IPv6

# Tipos de Direcciones IPv6 y Conceptos Clave

## 1. GUA y LLA

Tanto **GUA** como **LLA** son direcciones **Unicast**.

---

## Loopback en IPv6

Existe el equivalente al loopback de IPv4.

- Dirección: `::1/128`
- Forma expandida:  
  `0000:0000:0000:0000:0000:0000:0000:0001`
- Equivalente en IPv4: `127.0.0.1`

### Función

Se utiliza para verificar el funcionamiento del stack TCP/IP dentro del sistema operativo.

- No depende de la red física
- Permite validar que el protocolo esté funcionando correctamente
- Nunca se enruta

Si un dispositivo no tiene dirección asignada, puede utilizar la loopback para pruebas internas.

---

## APIPA en IPv4

En IPv4 existe el mecanismo **APIPA**:

- Rango: `169.254.0.0/16`
- Se asigna automáticamente cuando no hay servidor DHCP disponible

---

# Unique Local Address (ULA)

Las **ULA (Unique Local Address)**:

- Son direcciones privadas en IPv6
- No deben confundirse con LLA
- Tienen alcance local dentro de un sitio o conjunto de sitios
- No son globalmente enrutables en Internet

### Rango

`fc00::/7` hasta `fdff::/7`

### ¿Por qué es /7?

Porque los primeros 7 bits coinciden:

- `fc` → `11111100`
- `fd` → `11111101`

Los primeros 7 bits son iguales, por eso el prefijo es **/7**.

### Características

- Pensadas para redes privadas
- Útiles si una organización (por ejemplo, una universidad) desea implementar IPv6 internamente
- Permiten comunicación entre edificios o sedes, pero solo a nivel local
- No son traducidas ni enrutadas globalmente

No son muy utilizadas en la práctica, ya que las GUA permiten direccionamiento global sin necesidad de NAT como en IPv4.

---

# Link Local Address (LLA)

- Se generan automáticamente
- Alcance solo dentro del enlace local
- No son enrutable en Internet
- Se usan constantemente para procesos internos como descubrimiento de vecinos

---

# IPv4 embebida en IPv6

Existen mecanismos para encapsular una dirección IPv4 dentro de una dirección IPv6.

Ejemplo conceptual:

`::ffff:192.168.1.1`

Fue pensado como mecanismo de transición entre IPv4 e IPv6.

Actualmente casi no se utiliza.

---

# Global Unicast Address (GUA)

## Características

- Son globalmente enrutable
- Únicas a nivel mundial
- Equivalentes a las direcciones públicas en IPv4
- Ningún dispositivo puede autoasignarse una GUA válida en Internet sin una delegación oficial

## Rango actual utilizado

Las GUA actualmente asignadas pertenecen al bloque:

`2000::/3`

### ¿Por qué es /3?

Porque los primeros 3 bits son fijos:

 ## Prefijo 2000::/3 en IPv6

Los primeros 3 bits de las GUA actualmente asignadas son:

001

En hexadecimal, eso corresponde al rango:

`2000` a `3fff`

En binario:

- `2000` → `0010 0000 0000 0000`
- `3fff` → `0011 1111 1111 1111`

Esto representa aproximadamente **1/8 del total del espacio de direcciones IPv6**, ya que un prefijo /3 fija 3 bits y deja los otros 125 bits variables.

Actualmente, la mayoría de las direcciones **Global Unicast (GUA)** comienzan con `2` o `3`.

---

## Comparación con IPv4

Ejemplo en IPv4:

`192.168.10.0/24`

Es `/24` porque los primeros 24 bits identifican la red y los restantes identifican los hosts.

En IPv6 el concepto es el mismo, pero se utiliza **notación de prefijo** en lugar de máscara decimal punteada.

# Global Routing Prefix y Subnetting en IPv6

## Global Routing Prefix

El **Global Routing Prefix** identifica de manera única un bloque de direcciones IPv6 asignado a un proveedor o a una organización.

Ejemplo:

- Claro Colombia tiene el prefijo: `0010 1110 0000 0000`
- El prefijo puede ser, por ejemplo, `/7` dependiendo de la asignación

Este prefijo sirve como base para el direccionamiento y se combina con el **Subnet ID** para generar direcciones completas.

---

## Subnet ID

- Es un campo de subneteado dentro del bloque del **Global Routing Prefix**  
- Permite subdividir la red de manera más sencilla que en IPv4
- IPv6 permite asignar todos los bits de ceros o unos en la Subnet ID a dispositivos, sin las restricciones de IPv4
  - Ejemplo: un dispositivo puede tener ID `0000` o `1111`  
- Esto facilita la organización interna de las redes

---

## Interface ID

El **Interface ID** identifica de manera única la interfaz dentro de la subred.  
Normalmente se corresponde con la **Link-Local Address (LLA)**.

### IPv6 Link-Local Address (LLA)

- Permite que un dispositivo se comunique con otros dispositivos **en el mismo enlace** (subred) únicamente
- Características:
  - Los paquetes con origen o destino LLA **no pueden ser enrutados**
  - Cada interfaz habilitada para IPv6 debe tener una LLA
  - Si no se configura manualmente, el dispositivo genera automáticamente una
- Rango de direcciones: `fe80::/10`

#### Ejemplos y Notas

- `fe80::1/10` – anotación en el diagrama  
- `fe80::2/10` – anotación del instructor  
- `fe80::dba0:d807:3805:d1f7%13` (preferida)  
  - `%13` indica la interfaz de red a la que pertenece la dirección

---

### Importancia de la LLA

- Todas las interfaces IPv6 **siempre tienen una LLA**  
- Permite que los dispositivos se comuniquen dentro del mismo enlace  
- No se puede usar para comunicación global (no atraviesa routers)  
- Se puede asignar adicionalmente una **GUA** para comunicación global, pero la LLA es obligatoria
- # EUI-64 Process y Armado del Interface ID en IPv6

En IPv6, los **64 bits que no forman parte del prefijo** se utilizan como **Interface ID**, que identifica de manera única la interfaz del dispositivo dentro de la subred.  

El **Interface ID** se puede generar de dos formas principales:

---

## 1. Aleatoria

- El dispositivo crea su propio ID de manera completamente aleatoria.  
- La probabilidad de que dos dispositivos obtengan el mismo ID es muy baja, pero **sí podría ocurrir**.  
- Dentro de la misma red, **no se permite que dos interfaces tengan la misma MAC ni la misma IP**.  
- Para garantizarlo, se utiliza el **proceso DAD (Duplicate Address Detection)** que detecta direcciones duplicadas antes de activarlas.  

---

## 2. EUI-64

El método **EUI-64 (Extended Unique Identifier)** se basa en la **dirección MAC del dispositivo** para generar el Interface ID.

### Características

- IEEE definió este estándar como **Extended Unique Identifier**.  
- Convierte la MAC de 48 bits del dispositivo en un ID de interfaz de 64 bits.  
- Permite que el Interface ID sea **único globalmente**, evitando conflictos en la red.

### Ejemplo de conversión

MAC de 48 bits:  
- `fc:99:47:75:ce:e0`

Se convierte en EUI-64 Interface ID:  
- `fe:99:47:ff:fe:75:ce:e0`

  
### Detalles importantes

- El **séptimo bit** de la MAC original se alterna (0 → 1 o 1 → 0) para cumplir con el estándar EUI-64.  
  - Ejemplo:  
    - Original: `11111100`  
    - Modificado: `11111110`  
- Tanto la **MAC** como el **Interface ID** son representados en **hexadecimal**.  

---

## Resumen

- El Interface ID puede ser **aleatorio** o derivado de la **MAC mediante EUI-64**.  
- Se asegura que cada dispositivo tenga un **identificador único** dentro de la subred.  
- Se utiliza el **DAD** para prevenir duplicaciones.

  # Dynamic LLAs y Subneteado en IPv6

## Dynamic LLAs

Las **Dynamic Link-Local Addresses (LLAs)** son direcciones que se generan automáticamente para cada interfaz habilitada en IPv6.  
- Permiten que los dispositivos se comuniquen dentro del mismo enlace sin necesidad de configuración manual.  
- Siempre existen, independientemente de que se asigne una GUA u otra dirección adicional.  
- Son obligatorias para que IPv6 funcione correctamente a nivel de enlace.

---

## Subneteado en IPv6

IPv6 fue diseñado pensando en la facilidad de subneteado. La estructura típica de una dirección IPv6 es:

- **Prefijo**: 48 bits  
- **Subnet ID**: 16 bits  
- **Interface ID**: 64 bits  

Dependiendo de la longitud del prefijo asignado, los bits restantes hasta completar 64 bits se utilizan para crear subredes internas.

### Ejemplo con prefijo de 48 bits

- Número de subredes posibles: `2^16 = 65,535`  
- Esto hace que el subneteado en IPv6 sea **mucho más sencillo** que en IPv4

Ejemplo de subredes consecutivas:
- `2001:db8:acad:0000::/64 `
- `2001:db8:acad:0001::/64 `
- `2001:db8:acad:0002::/64 `
- `2001:db8:acad:0003::/64 `
- `... `

  
 Se deja **inmutable el prefijo** y se incrementa el campo de **Subnet ID** para crear nuevas subredes.
  Cada subred puede tener hasta `2^64` direcciones para interfaces, lo que prácticamente elimina restricciones de direccionamiento interno.


  # Creación y Envío de Paquetes en IPv4/IPv6

## Origen de los Paquetes

- Los paquetes siempre se crean **en el dispositivo origen**.  
- Cada host mantiene su propia **tabla de enrutamiento**, que decide cómo enviar los paquetes según la dirección de destino.

---

## Destinos de Paquetes

Un host puede enviar paquetes a:

1. **A sí mismo**  
   - IPv4: `127.0.0.1`  
   - IPv6: `::1`  
   - Usado para pruebas internas (loopback)

2. **Host local**  
   - El destino se encuentra en la misma red local (LAN)  
   - No requiere pasar por un router externo

3. **Host remoto**  
   - El destino no está en la misma LAN  
   - El paquete debe atravesar routers para llegar a la red de destino

---

## Consideraciones Geopolíticas

Algunos protocolos y políticas de red pueden **restringir el tráfico** para evitar que paquetes crucen redes de países con conflictos diplomáticos o riesgos de seguridad.  
- Esto puede afectar rutas de Internet global y decisiones de enrutamiento.
