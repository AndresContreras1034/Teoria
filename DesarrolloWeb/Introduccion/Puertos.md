
# ¿Qué es un puerto?

Un puerto es:

- Un número que identifica una aplicación en red.
- Permite que muchos servicios usen la misma IP.
- Hace posible que haya múltiples conexiones simultáneas.
- Es esencial para que Internet funcione.

---

# ¿Cuántos puertos pueden existir?

Un puerto es un número de 16 bits.

2^16 = 65,536 puertos

Es por protocolo. Existen puertos para:

- TCP
- UDP

Es decir:

65,536 puertos para TCP  
65,536 puertos para UDP  

Se dividen en conocidos, registrados y dinámicos.

---

# Clasificación de puertos

## Well-Known Ports (0–1023)

- Reservados para servicios estándar de Internet.
- Son los primeros que escanean los atacantes.
- Son universales y estandarizados.
- En Linux requieren permisos de root.

---

## Registered Ports (1024–49151)

- No requieren privilegios especiales.
- Pueden registrarse oficialmente en IANA.
- Son usados por aplicaciones específicas.
- Son comunes en servidores modernos.

---

## Dynamic Ports (49152–65535)

También llamados:

- Puertos dinámicos
- Puertos efímeros
- Puertos temporales

Características:

- No están asignados a servicios fijos.
- El sistema operativo los elige automáticamente.
- Se usan para conexiones salientes.
- Son temporales.

---

# ¿Por qué usar puertos mayores a 8000 o 10000?

## Evitar conflictos con puertos conocidos

Los puertos están divididos así:

### 0–1023 (Well-Known Ports)

- 80 (HTTP)
- 443 (HTTPS)
- 22 (SSH)
- 25 (SMTP)

### 1024–49151 (Registered Ports)

- 3306 (MySQL)
- 5432 (PostgreSQL)
- 8080 (HTTP alternativo)

Si se usa un puerto bajo es posible:

- Interferir con un servicio real del sistema.
- Tener conflictos.
- Generar errores.

---

# En Linux

Para usar puertos menores a 1024 es necesario tener permisos de root.

---

# En servidores reales se mueve el SSH de 22 a 2222 para reducir ruido

## ¿Qué es el ruido?

El puerto 22 es el puerto por defecto de SSH.

Cuando un servidor está expuesto a Internet, bots automáticos escanean constantemente:

- IP pública
- Puerto 22
- Intentan miles de combinaciones de usuario/contraseña

Esto pasa todo el tiempo, literalmente minutos después de abrir un servidor.

Al revisar los logs de un VPS (Virtual Private Server) nuevo con SSH en el puerto 22, se verán múltiples intentos de contraseña fallida.

Eso es el ruido.

Cambiar el puerto no aumenta realmente la seguridad.  
Solo reduce el spam en los logs y la carga innecesaria causada por intentos automáticos básicos.

---

# Separación mental (convención en equipos)

Muchos equipos usan esta organización:

- 80 / 443 → Producción
- 3000–8000 → Desarrollo local
- 10000+ → Pruebas, microservicios, contenedores

# 100 Puertos

## Web / HTTP
1. 80 - HTTP  
2. 443 - HTTPS  
3. 8080 - HTTP alternativo  
4. 8443 - HTTPS alternativo  
5. 8000 - Desarrollo web  
6. 8008 - HTTP alternativo  
7. 8888 - Jupyter / HTTP  
8. 3000 - Node.js / React  
9. 5000 - Flask  
10. 7001 - WebLogic  

## Bases de Datos
11. 3306 - MySQL  
12. 5432 - PostgreSQL  
13. 1433 - SQL Server  
14. 1521 - Oracle  
15. 27017 - MongoDB  
16. 6379 - Redis  
17. 9042 - Cassandra  
18. 9200 - Elasticsearch  
19. 5984 - CouchDB  
20. 7474 - Neo4j  

## Correo
21. 25 - SMTP  
22. 465 - SMTPS  
23. 587 - SMTP seguro  
24. 110 - POP3  
25. 995 - POP3S  
26. 143 - IMAP  
27. 993 - IMAPS  
28. 4190 - ManageSieve  
29. 2525 - SMTP alternativo  
30. 24 - Priv-mail  

## Seguridad / Acceso Remoto
31. 22 - SSH  
32. 23 - Telnet  
33. 3389 - RDP  
34. 5900 - VNC  
35. 2222 - SSH alternativo  
36. 989 - FTPS data  
37. 990 - FTPS control  
38. 636 - LDAPS  
39. 1194 - OpenVPN  
40. 500 - ISAKMP (IPSec)  

## Transferencia de Archivos
41. 20 - FTP data  
42. 21 - FTP  
43. 69 - TFTP  
44. 989 - FTPS  
45. 990 - FTPS  
46. 445 - SMB  
47. 2049 - NFS  
48. 873 - rsync  
49. 548 - AFP  
50. 137 - NetBIOS  

## DNS y Red
51. 53 - DNS  
52. 67 - DHCP  
53. 68 - DHCP  
54. 123 - NTP  
55. 161 - SNMP  
56. 162 - SNMP Trap  
57. 179 - BGP  
58. 389 - LDAP  
59. 1900 - UPnP  
60. 5353 - mDNS  

## Monitoreo / DevOps
61. 9090 - Prometheus  
62. 3001 - Grafana alternativo  
63. 5601 - Kibana  
64. 8125 - StatsD  
65. 9411 - Zipkin  
66. 9100 - Node Exporter  
67. 15672 - RabbitMQ panel  
68. 5672 - RabbitMQ  
69. 11211 - Memcached  
70. 2181 - Zookeeper  

## Servicios Empresariales / Aplicaciones
71. 7000 - Cassandra cluster  
72. 27018 - MongoDB alternativo  
73. 5001 - Flask HTTPS  
74. 8081 - HTTP alternativo  
75. 8444 - HTTPS alternativo  
76. 9092 - Kafka  
77. 9093 - Kafka  
78. 25565 - Minecraft  
79. 25575 - RCON  
80. 2082 - cPanel  

## Servicios Windows / Microsoft
81. 135 - RPC  
82. 139 - NetBIOS  
83. 445 - SMB  
84. 593 - RPC over HTTP  
85. 3268 - Global Catalog  
86. 3269 - Global Catalog SSL  
87. 3389 - RDP  
88. 5985 - WinRM  
89. 5986 - WinRM SSL  
90. 9389 - AD Web Services  

## Otros
91. 1883 - MQTT  
92. 8883 - MQTT SSL  
93. 5060 - SIP  
94. 5061 - SIP TLS  
95. 6667 - IRC  
96. 1812 - RADIUS  
97. 1813 - RADIUS Accounting  
98. 10000 - Webmin  
99. 49152 - Puerto dinámico  
100. 49153 - Puerto dinámico  
