# INFRAESTRUCTURA TIC  
**04/08/2025**

> Entregar trabajos con normas APA V7.  
> TODO REFERENCIADO.  
> Referencias: Google Scholar / Google Académico, entidades de estándares.  
> Evitar promover fabricantes; usar fuentes neutras y oficiales.  

---

## Contexto institucional y de estándares

En esta materia se trabaja especialmente con las capas **1 (Física)** y **2 (Enlace de datos)** del modelo de redes, utilizando herramientas como **Cisco Packet Tracer** para simulación.  

Se toman como referentes conceptuales y de normalización organismos como:

- **IETF (Internet Engineering Task Force):** Desarrolla y mantiene los protocolos de Internet (como TCP/IP, HTTP, etc.). Es una organización abierta donde se definen los estándares prácticos en la red.  
- **IEEE (Institute of Electrical and Electronics Engineers):** Crea estándares técnicos clave en comunicaciones, por ejemplo Wi-Fi (802.11) y Ethernet (802.3).  
- **ANSI (American National Standards Institute):** Coordina y acredita estándares en Estados Unidos, promoviendo calidad y compatibilidad.  
- **ISO (International Organization for Standardization):** Organización internacional que, entre otras cosas, publicó el modelo OSI como marco de referencia para la interoperabilidad de sistemas en redes.  

---

## Modelo OSI (ISO)

El **Modelo OSI (Open Systems Interconnection)** es un marco de referencia conceptual creado por la ISO para dividir la comunicación de red en 7 capas, con el objetivo de estandarizar cómo los datos viajan de un sistema a otro y facilitar interoperabilidad entre equipos y fabricantes distintos. Aunque en la práctica las implementaciones reales (como Internet) usan otros modelos como TCP/IP, OSI sigue siendo fundamental para entender la lógica y separación de responsabilidades en una red.

> Nota histórica: El modelo OSI fue influenciado por ideas previas como el modelo SNA de IBM, pero fue formalizado por organismos internacionales para establecer un lenguaje común entre desarrolladores y arquitectos de redes.

### Tabla comparativa: OSI vs TCP/IP

| Capa OSI | Nombre             | Función principal | Ejemplos de protocolos/dispositivos | Equivalente en TCP/IP |
|----------|--------------------|-------------------|-------------------------------------|-----------------------|
| 7        | Aplicación         | Interfaz para aplicaciones de usuario y servicios de red. | HTTP, FTP, SMTP, DNS | Aplicación |
| 6        | Presentación       | Traducción de formatos, compresión y cifrado. | TLS/SSL, JPEG, ASCII | Aplicación |
| 5        | Sesión             | Establecimiento, mantenimiento y cierre de sesiones. | NetBIOS, RPC | Aplicación |
| 4        | Transporte         | Entrega confiable o no confiable, control de flujo y segmentación. | TCP, UDP | Transporte |
| 3        | Red                | Enrutamiento y direccionamiento lógico. | IP, ICMP, OSPF | Internet |
| 2        | Enlace de datos    | Transferencia de datos entre nodos adyacentes y detección/corrección de errores. | Ethernet, ARP, Wi-Fi (802.11) | Acceso a red |
| 1        | Física             | Transmisión de bits a través del medio físico. | Cables (fibra, cobre), señales eléctricas/ópticas | Acceso a red |

### Representación visual simplificada

- [7] Aplicación
- [6] Presentación
- [5] Sesión
- [4] Transporte
- [3] Red
- [2] Enlace de datos
- [1] Física

*La comunicación entre dos equipos se da capa por capa: cada capa sólo se comunica directamente con su adyacente y su contraparte en el otro extremo a través de encapsulación y desencapsulación.*

### Ejemplo práctico: Acceder a una página web

1. **Aplicación (7):** El navegador solicita una URL.  
2. **Presentación (6):** Se negocia cifrado (HTTPS) y se prepara el contenido (por ejemplo, compresión).  
3. **Sesión (5):** Se mantiene la sesión establecida para la transferencia.  
4. **Transporte (4):** TCP segmenta los datos y garantiza su llegada correcta.  
5. **Red (3):** IP enruta los paquetes entre redes.  
6. **Enlace de datos (2):** Ethernet/Wi-Fi encapsula los frames en la red local.  
7. **Física (1):** Se envían bits por el cable o por el aire.

### Puntos clave sobre el modelo

- **No son capas “opcionales”**: funcionan en secuencia; no se salta directamente de física a red.  
- **Encapsulación**: cada capa añade su encabezado (y a veces pie) antes de pasar al siguiente nivel.  
- **Interoperabilidad**: separando funciones, equipos de distintos fabricantes pueden comunicarse si respetan los estándares.  
- **OSI vs TCP/IP**: OSI es más teórico y didáctico; TCP/IP es el modelo práctico dominante en Internet.  

---

## Contexto histórico (resumido y corregido)

En la década de 1970, cada fabricante y organización diseñaba sus propias tecnologías y protocolos de red sin coordinarlos, lo que generaba falta de interoperabilidad (como si, por ejemplo, un sistema Apple no pudiera comunicarse con uno Android).  

El gobierno de Estados Unidos (a través del Departamento de Defensa) impulsó la estandarización y encomendó a universidades y centros de investigación la creación de arquitecturas de red compatibles. De esa época surgen muchas bases de los sistemas operativos modernos (muchos inspirados en Unix).  

Paralelamente, en Europa y a nivel global, se creó la **ISO**, que formalizó el modelo OSI para proporcionar un marco común. Mientras tanto, la **IETF** desarrollaba el modelo TCP/IP, más pragmático y adoptado rápidamente en la Internet real.

---

## Aplicación en Infraestructura TIC

Esta materia se centra especialmente en:
- **Capa 1 (Física):** medios de transmisión, señalización, características eléctricas/ópticas.  
- **Capa 2 (Enlace de datos):** control de acceso al medio, detección y corrección de errores, direcciones físicas (MAC), switching.  

En las prácticas con **Packet Tracer**, se modela cómo se configuran dispositivos en estas capas para establecer conectividad, detectar fallos y asegurar transferencia correcta antes de elevar al nivel de protocolos superiores.

---

## Glosario básico

- **Encapsulación:** Proceso de envolver datos con la información de la capa correspondiente al enviarlos.  
- **Frame:** Unidad de datos en la capa de enlace.  
- **Paquete:** Unidad de datos en la capa de red.  
- **Segmento:** Unidad de datos en la capa de transporte (por ejemplo, en TCP).  
- **MAC (Media Access Control):** Dirección física de un dispositivo en la capa de enlace.  
- **IP (Internet Protocol):** Protocolo de la capa de red que direcciona y enruta paquetes.  
- **TCP/UDP:** Protocolos de la capa de transporte para entrega (confiable vs no confiable).  
- **TLS/SSL:** Capa de presentación que cifra datos en conexiones seguras.  

---

## Comparativas y notas adicionales

- **OSI vs TCP/IP:** En vez de pensar en 7 vs 4 capas como competencia, entender que TCP/IP agrupa funciones (por ejemplo, sesión/presentación se tratan dentro de la capa de aplicación).  
- **Estándares vs implementaciones:** OSI da el “qué debe pasar” en cada capa; protocolos como TCP, IP, Ethernet son implementaciones reales que hacen que eso funcione.  

---

## (Espacio para diagrama)

*Aquí puedes insertar un diagrama estilo vertical mostrando las 7 capas, o una imagen referenciada de modelo OSI. Ejemplo: una imagen con cajas apiladas del 7 al 1 con breve nota en cada una.*

---

## Referencias sugeridas (formato APA V7)

- ISO. (s.f.). *Open Systems Interconnection model*.  
- IETF. (s.f.). *Internet standards and protocols (TCP/IP)*.  
- IEEE. (s.f.). *Standards for Ethernet and Wi-Fi*.  
- Kurose, J. F., & Ross, K. W. (2017). *Computer Networking: A Top-Down Approach* (7th ed.). Pearson.  
- Tanenbaum, A. S., & Wetherall, D. J. (2011). *Computer Networks* (5th ed.). Pearson.


---


---



## Notas adicionales

- Máximo y mínimo de exposiciones: 20 minutos.  
- Se recomienda practicar la explicación del modelo OSI con ejemplos reales en clase y simulaciones en Packet Trac
