# Clase 27/03/26  
## NAT (Network Address Translation)

###  ¿Qué es NAT?
NAT (Traducción de Direcciones de Red) es una técnica utilizada en redes para **modificar direcciones IP** en los paquetes que pasan por un router o firewall.

Su función principal es permitir que **múltiples dispositivos con IP privadas** accedan a internet usando **una o pocas IP públicas**.

---

###  ¿Para qué sirve?
- Ahorrar direcciones IPv4
- Permitir que redes internas (privadas) accedan a internet
- Ocultar la estructura interna de la red (seguridad básica)

---

###  Tipos de direcciones
- **IP privada**: Usada dentro de la red (ej: 192.168.x.x, 10.x.x.x)
- **IP pública**: Visible en internet

---

###  Tipos de NAT

#### 1. NAT estático
- 1 IP privada ↔ 1 IP pública
- Siempre es la misma traducción

 Ejemplo:  
192.168.1.10 → 200.1.1.10

---

#### 2. NAT dinámico
- Usa un **pool de IP públicas**
- Asigna una IP disponible cuando se necesita

Ejemplo:  
192.168.1.10 → 200.1.1.20 (temporal)

---

#### 3. PAT (Port Address Translation) o NAT sobrecargado
- Muchos dispositivos usan **una sola IP pública**
- Se diferencian por **puertos**

 Ejemplo:  
192.168.1.10:5000 → 200.1.1.1:3000  
192.168.1.11:5001 → 200.1.1.1:3001  
Es el más usado en hogares y empresas

---

###  ¿Cómo funciona?
1. Un dispositivo interno envía un paquete a internet  
2. El router cambia la IP privada por una IP pública  
3. Guarda la traducción en una tabla NAT  
4. Cuando llega la respuesta, el router la devuelve al dispositivo correcto  

---

###  Tabla NAT (concepto clave)
El router mantiene una tabla con:
- IP privada
- IP pública
- Puerto

Esto permite saber **a quién devolver cada respuesta**

---

###  Ventajas
- Reduce uso de IP públicas  
- Añade una capa básica de seguridad  
- Permite conexión a internet desde redes privadas  

---

###  Desventajas
- Puede complicar algunos servicios (ej: servidores, juegos online)  
- Rompe el principio de comunicación extremo a extremo  
- Puede generar problemas con protocolos específicos  

---

###  Ejemplo sencillo
Es como un edificio:

- Cada apartamento = IP privada  
- Portero = Router con NAT  
- Dirección del edificio = IP pública  

Todos salen con la misma dirección, pero el portero sabe quién es quién.

---

### Idea clave
NAT permite que muchas máquinas "parezcan" una sola en internet.

---
