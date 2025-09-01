
# Exposiciones Infraestructura TIC
> **Introducción a la Sección:**  
> Esta sección presenta los contenidos principales de la exposición, incluyendo conceptos, tecnologías y aplicaciones.  
> Los detalles pueden desplegarse haciendo clic en la flecha a la izquierda del título.





<details>
  <summary>1 Septiembre – Exposición 2: Medios de Transmisión</summary>

  ## Medios Guiados

  - **Cable UTP**: utilizado en redes LAN.  
  - **Fibra óptica**: transmite datos mediante pulsos de luz, con alta velocidad y baja interferencia.  

  ## Técnicas de Señalización de Redes

  La señalización define cómo se codifica la información en una señal. Se clasifica en dos familias:

  - **Analógica (onda continua)**  
  - **Digital (pulsos)**  

  ### Aspectos Clave

  - Sincronización  
  - Transiciones  
  - Componente DC  

  ### Señalización Analógica

  - **AM (Amplitud Modulada)**  
    - Cambia la altura de la onda.  
    - **Ventaja**: simple y fácil de entender.  
    - **Desventaja**: sensible al ruido que altera la amplitud.  

  - **FM (Frecuencia Modulada)**  
    - Cambia la rapidez de las oscilaciones.  
    - **Ventaja**: más robusta.  
    - **Desventaja**: más costosa.  

  ### Señalización Digital

  - **NRZ y RZ**:  
    - **NRZ**: no retorna a cero entre bits.  
    - **RZ**: retorna a cero entre bits.  

  - **Manchester**:  
    - Siempre hay un cambio en el centro del bit.  
    - Facilita la recuperación del reloj.  

  - **Línea Balanceada**:  
    - No genera componente continua.  
    - Apta para cables largos y transformadores.  
    - Más transiciones → mayor ancho de banda.  

  ## Técnicas de Transmisión

  Métodos para enviar información entre dispositivos a través de una red.  

  ### Modo de Dirección

  - **Simplex**: unidireccional, p.ej., televisión.  
  - **Half-duplex**: bidireccional, pero no simultáneo, p.ej., walkie-talkie.  
  - **Full-duplex**: comunicación bidireccional simultánea, p.ej., teléfono.  

  ### Serie vs Paralelo

  - **Serie**: los bits se envían uno tras otro.  
  - **Paralelo**: varios bits se envían al mismo tiempo.  

  ### Modos de Transmisión Digital

  - **Asíncrona**: datos enviados en pequeños paquetes con bits de inicio y fin.  
  - **Síncrona**: transmisión de bloques completos y ordenados, como Ethernet.  
  - **Isócrona**: diseñada para datos en tiempo real que no pueden perderse.  

  ### Multiplexación

  Técnica que permite transmitir varias señales simultáneamente por un mismo canal.

  - **FDM (Multiplexación por frecuencia)**: cada usuario tiene una frecuencia distinta, como emisoras de radio.  
  - **TDM (Multiplexación por tiempo)**: cada usuario transmite en intervalos de tiempo asignados, como hablar por turnos.  
  - **WDM (Multiplexación por longitud de onda)**: cada usuario transmite en una longitud de onda distinta (ej. luz roja, verde).  
  - **CDM (Multiplexación por código)**: todos transmiten al mismo tiempo y frecuencia, pero con códigos distintos (como hablar en diferentes idiomas en el mismo cuarto).  

  **Ventajas:**  
  - Ahorro de recursos  
  - Mayor eficiencia  

  **Desventajas:**  
  - Mayor complejidad técnica  
  - Posibles interferencias o ruidos si no se gestionan bien  

  ## Casos Reales

  - **Ethernet**: base de redes cableadas, conecta dispositivos en LAN.  
  - **Wi-Fi**: transmite mediante ondas de radio, conexión inalámbrica.  
  - **Fibra óptica**: columna vertebral de Internet global, conecta continentes vía cables submarinos transmitiendo pulsos de luz.  

</details>



<details>
  <summary>Exposición 3 – Medios de Comunicación de Cobre</summary>

  ## Introducción

  Los medios de transmisión guiados utilizan conductores físicos para enviar información. El cobre es uno de los materiales más usados debido a sus propiedades:

  - Alta conductividad eléctrica  
  - Baja resistividad  
  - Fácil instalación  
  - Soporta transmisión de datos, voz e Internet  

  El cobre se ha utilizado desde los primeros sistemas telegráficos y sigue presente en cables de par trenzado.

  ## Principios Físicos e Importancia

  - **Diafonía**: interferencia entre pares de cables cercanos.  
  - **EMI (Interferencia Electromagnética)**: ruidos externos que afectan la calidad de la señal.  

  **Ventajas del cobre:**

  - Económico  
  - Instalación sencilla  
  - Amplia compatibilidad  
  - Infraestructura existente  

  ## Tipos Principales de Cable de Cobre

  ### 1. Par Trenzado

  - **UTP (Unshielded Twisted Pair)**: pares de hilos de cobre trenzados, sin recubrimiento metálico adicional.  
    - Bajo costo, fácil instalación, susceptible a interferencias.  
  - **STP (Shielded Twisted Pair)**: cada par de hilos recubierto por malla metálica.  
    - Mayor protección contra interferencias, más caro.  
  - **FTP (Foiled Twisted Pair)**: todos los pares recubiertos por una lámina metálica global.  
    - Protección intermedia entre UTP y STP.  

  ### 2. Cable Coaxial

  - **Estructura**:  
    - Conductor central: cobre sólido o estañado, transporta la señal principal.  
    - Aislante dieléctrico: separa el conductor central de la malla.  
    - Malla metálica: protege contra interferencias electromagnéticas y diafonía.  
    - Cubierta externa: PVC o polietileno, protege físicamente.  

  - **Tipos comunes**:  
    - **RG-6**: 75 Ω, televisión por cable, permite frecuencias altas, más común.  
    - **RG-59**: 75 Ω, cámaras de seguridad, pierde señal en largas distancias.  
    - **RG-11**: 75 Ω, más grueso, menor atenuación, ideal para tramos largos.  

  - **Características técnicas**:  
    - Ventajas: alta inmunidad a interferencias, anchos de banda altos.  
    - Desventajas: más costoso que el par trenzado, menos flexible.  

  ### 3. Cable Multipar Telefónico

  - Contiene muchos pares trenzados dentro de una misma cubierta protectora.  
  - Cada par tiene aislamiento individual y código de colores.  
  - Se agrupan de 25, 50 o 100 pares.  

  **Ventajas:**  

  - Permite conectar muchas líneas  
  - Organización centralizada  
  - Resistente y duradero  

  **Desventajas:**  

  - Voluminoso, difícil de instalar en espacios reducidos  
  - Menor velocidad, sensible a interferencias  

  **Aplicación:** redes de telefonía fija  

  ## Factores que Afectan la Calidad

  - Atenuación: pérdida de señal a lo largo del cable  
  - Diafonía: interferencia entre pares cercanos  
  - Ruidos externos (EMI): afectan la integridad de la señal  

  ## Normas de Cableado Estructurado

  ### TIA/EIA-568

  - Define requerimientos para cableado de cobre y fibra óptica en edificios y redes LAN.  
  - Considera: cableado horizontal, cableado vertical, área de trabajo, cuarto de telecomunicaciones y cuarto de equipos.  

  ### ISO/IEC

  - Normas internacionales para cableado y diseño de redes.  

  ### Normas Complementarias

  - **ANSI/TIA-469**: recomendaciones para instalaciones de telecomunicaciones  
  - **ANSI/TIA**: cableado en viviendas, voz, video y seguridad  
  - **ANSI/TIA-606**: infraestructura en edificios  
  - **ANSI/TIA-607**: puesta a tierra y enlace potencial  

</details>

<details>
  <summary>Exposición 4 – Medios de Comunicación Físicos: Fibra Óptica</summary>

  ## Qué es la Fibra Óptica

  La fibra óptica es un medio de transmisión hecho de vidrio o plástico que permite la comunicación mediante LED o láser.  

  - Nace en los años 50 por la necesidad de transmitir información más rápido que el cobre.  
  - Es la base de la conectividad moderna, especialmente en redes troncales.  

  ## Principios de Funcionamiento

  - Utiliza pulsos de luz en lugar de señales eléctricas.  
  - Permite alta velocidad y mínima atenuación en largas distancias.  
  - La luz se transmite aplicando la ley de reflexión y refracción:  
    - Núcleo con índice de refracción alto  
    - Revestimiento con índice más bajo  
  - Transmite un único rayo de luz (monomodo) o múltiples trayectorias (multimodo).  

  ## Características

  - Núcleo muy delgado (monomodo) o más ancho (multimodo)  
  - Fuente de luz: láser o LED  
  - Gran ancho de banda, baja atenuación  
  - Alta capacidad de transmisión y velocidad  

  **Desventajas:**  
  - Alto costo  
  - Instalación compleja  

  **Usos:** redes troncales, telecomunicaciones, FITH, centros de datos, LAN corporativas  

  ## Tipos de Fibra Óptica

  ### 1. Monomodo

  - Núcleo muy delgado, transmite un único rayo de luz  
  - Color del cable: amarillo  
  - Alta precisión y velocidad, ideal para largas distancias  

  ### 2. Multimodo

  - Núcleo más ancho, permite que la luz viaje por múltiples trayectorias  
  - Color del cable: generalmente tres cables (identificación)  
  - Ventajas: menor costo, instalación más sencilla  

  ## Conectores y Empalmes

  ### Conectores Comunes

  - SC: push-pull, fácil de usar  
  - LC: alta densidad, compacto  
  - ST: bayoneta, usado en multimodo  
  - FC: rosca, alta precisión  

  ### Tipos de Empalmes

  - Por fusión: más precisos, bajas pérdidas  
  - Mecánico: rápido y económico, pero mayor pérdida de señal  

  ## Características Técnicas

  - Velocidad de transmisión y ancho de banda: cantidad máxima de datos transferibles  
  - Multiplexación por división de longitud de onda (WDM): envía múltiples canales simultáneamente  

  ## Fenómenos que Afectan la Señal

  - **Atenuación:** pérdida natural de potencia por kilómetro  
  - **Dispersión:** ensanchamiento de los pulsos de luz  
    - Modal: diferentes caminos para los pulsos de luz  
    - Cromática: diferentes longitudes de onda llegan en tiempos distintos  

  ## Retos y Consideraciones

  - Técnicos: diseño de red, empalmes, conectores, compatibilidad  
  - Económicos: alto costo inicial, equipos especializados, personal capacitado  
  - Regulatorios: normativas locales y coordinación con entidades públicas  
  - Gestión y operación: mantenimiento, expansión futura, calidad de servicio  

  ## Despliegue de Infraestructura

  - Subterránea: mayor protección, mayor costo inicial  
  - Aérea: instalación más rápida y económica, pero más vulnerable a daños  

  ## Tendencias y Futuro

  - Creciente uso en centros de datos y redes troncales  
  - Implementación de WDM para aumentar capacidad  
  - Integración con tecnologías 5G y nuevas generaciones de telecomunicaciones  
  - Futuro: uso en IA, computación cuántica, automatización de instalación y mantenimiento  
  - Fibra con baja dispersión y mayor resistencia a curvaturas  

  ## Ventajas

  - Gran ancho de banda  
  - Baja atenuación  
  - Inmunidad a interferencias  
  - Seguridad de transmisión  

  ## Desventajas

  - Alto costo inicial  
  - Fragilidad del material  
  - Instalación compleja  

</details>

<details>
  <summary>Exposición 5 – Medios de Comunicación Inalámbricos</summary>

  ## Introducción

  Los medios de comunicación inalámbricos permiten la transmisión de datos sin cables físicos.  

  **Objetivos:**  

  - Analizar estos medios  
  - Explicar fundamentos, siglas y significados  
  - Describir principales tecnologías  
  - Señalar ventajas y limitaciones  

  ### Por qué hablar de la capa física

  El modelo OSI organiza la comunicación en capas.  

  - La **capa física** define la transmisión mediante bits (0 y 1), que se convierten en ondas electromagnéticas.  
  - A diferencia de las redes cableadas, estas ondas viajan por el aire y pueden sufrir interferencias o ruido.  

  **Diferencias con medios alámbricos:**  

  | Característica | Medios Alámbricos | Medios Inalámbricos |
  |----------------|-----------------|-------------------|
  | Señal          | Guiada dentro de un cable | Viaja por el aire |
  | Estabilidad    | Alta            | Vulnerable a ruido y obstáculos |
  | Ancho de banda | Mayor           | Menor, depende de interferencias |

  **Ejemplo:** Ethernet (alámbrico) vs Wi-Fi (inalámbrico)  
  **Protocolos relacionados:** 802.11, TCP/UDP, SNR  

  ## Tipos de Medios Inalámbricos

  ### 1. Radio sub-GHz
  - Cobertura amplia, frecuencia <1 GHz  
  - Alcance aproximado: 10–15 km (según la zona)  
  - Penetra estructuras y obstáculos  
  - Baja capacidad de transmisión de datos  
  - **Ejemplo de uso:** sensores agrícolas (temperatura, humedad)  

  ### 2. Microondas sub-6 GHz
  - Frecuencia: 1–7 GHz  
  - Común en la actualidad  
  - Modulación: OFDM y QAM + técnicas MIMO  
  - Buena conectividad y velocidad de datos  

  ### Microondas altas y mmWave
  - Frecuencias: 5–24 GHz (microondas altas), 24–100 GHz (mmWave)  
  - Alta capacidad para transporte de datos  
  - Cobertura sectorial, enlaces punto a punto  
  - Requiere línea de vista, mínima interferencia  
  - Uso de zona de Fresnel para reducir fugas  
  - Platos cóncavos amplifican la señal  
  - Protocolos de modulación: QAM, OFDM, CROSTIC  

  ### 3. Satelital
  - Comunicación radio–espacio–radio mediante repetidor en órbita (LEO, MEO, GEO)  
  - Antenas: algunas fijas (GEO), otras siguen el satélite (LEO/MEO)  
  - Latencia depende de altura y clima  
  - Permite cobertura global  

  ### 4. Infrarrojo (IR)
  - Frecuencia: 399–499 THz  
  - Medio de corto alcance, requiere línea de vista, no atraviesa paredes → inmune a interferencias de RF  
  - **Usos:** enlaces punto a punto, controles remotos, sensores de proximidad, domótica  

  ### 5. Luz Visible (VLC / Li-Fi)
  - Datos transmitidos mediante luz visible, no ondas de radio  
  - La lámpara transmite datos a dispositivos (computadoras, celulares) sin que la luz sea perceptible  
  - **Usos:** aulas, hospitales, laboratorios, aviones, metro, tiendas, museos, aeropuertos, casas inteligentes  

  ### 6. Láser (FSO – Free Space Optics)
  - Rayo láser envía datos de un punto a otro  
  - Convierte los datos en pulsos de luz que viajan por el aire  
  - El receptor convierte la luz en señal eléctrica  

  ## Parámetros Clave de Medios Inalámbricos
  - **Frecuencia y ancho de banda:** determinan velocidad y capacidad  
  - **Potencia de transmisión:** define alcance y consumo eléctrico  
  - **Alcance y cobertura:** desde metros hasta miles de km  
  - **Latencia:** tiempo de respuesta, crítico en tiempo real  
  - **Interferencia y ruido:** afectan la calidad de la transmisión  

  ## Ventajas
  - Movilidad y flexibilidad  
  - Escalabilidad  
  - Menor infraestructura física  
  - Cobertura global con satélites GEO  

  ## Desventajas
  - Interferencias y obstáculos  
  - Limitaciones de ancho de banda frente a alta demanda  
  - Seguridad: riesgo de interceptación sin cifrado  
  - Alto consumo energético (satélites y mmWave)  
  - Dependencia de regulaciones locales  

</details>

<details>
  <summary>Exposición 5 – Dispositivos de Red y Multiplexores</summary>

  ## Hubs
  Los hubs son dispositivos que representan un nodo central en una red Ethernet.  

  - Suelen tener 4, 8, 12 o 24 interfaces.  
  - Pueden incluir una **interfaz uplink** para conectar a otro hub o switch.  

  ### Funcionamiento
  - Operan sin discriminar: la señal que reciben se envía a todos los dispositivos conectados.  
  - Comunicación bidireccional, pero no simultánea.  
  - Usan **CSMA/CD (Carrier Sense Multiple Access / Collision Detection)**:  
    - Escucha si el canal está libre antes de transmitir.  
    - Si está ocupado, espera un tiempo aleatorio antes de intentar de nuevo.  

  ### Tipos de Hubs
  - **Pasivo:** solo punto de conexión.  
  - **Activo:** amplifica y regenera la señal.  
  - **Inteligente:** permite monitoreo, estadísticas y diagnóstico.  

  ## Tarjeta de Red (NIC – Network Interface Card)
  - Permite que un dispositivo se conecte a una red, alámbrica o inalámbrica.  
  - Traduce las señales en bits (0 y 1).  
  - Opera en **Capa 1 (física)** y **Capa 2 (MAC)** del modelo OSI.  

  ### Tipos
  - **Alámbrica:** Ethernet 8P8C (RJ-45)  
  - **Inalámbrica:** Wi-Fi, integrada o externa, usa chip y antena de radiofrecuencia  

  ### Estándares
  - IEEE 802.11 b/g/n  

  ### Beneficios
  - Conexión a una red local  
  - Soporta altas velocidades  
  - Mejora transferencia de archivos  

  ## Repetidores
  - Dispositivo que recibe una señal debilitada y la regenera.  
  - Opera solo sobre bits y señales, sin analizar direcciones o trama.  
  - Funciona bajo las **3 R**:  
    1. **Reamplifica** la señal  
    2. **Reforma** la señal (retime)  
    3. **Re-temporiza** los bits  

  > Nota: El repetidor elimina ruido, pero no segmenta el dominio de colisión, no añade seguridad ni aumenta ancho de banda.  

  ## Transeptores
  - Dispositivo que combina varias funciones en un módulo para transportar datos mediante señales.  

  ### Tipos
  - RF  
  - Ethernet (cobre)  
  - Ópticos (SFP, QSFP, OSFP)  
  - Inalámbricos  

  ### Ventajas
  - Comunicación bidireccional  
  - Flexible y modular  
  - Escalable hasta 500 Gbps  

  ### Limitaciones
  - Costo elevado en ópticos de alta velocidad  
  - Compatibilidad entre fabricantes  
  - Interferencias en RF inalámbricos  
  - Distancia limitada según tipo  

  ## Multiplexores
  - Dispositivo que recibe varias señales de entrada, selecciona una y la envía a una sola línea de salida.  

  ### Tipos de Multiplexación
  - **TDM (Time Division Multiplexing):** divide el tiempo de transmisión disponible entre los dispositivos.  
  - **FDM (Frequency Division Multiplexing):** cada señal se transmite en una frecuencia distinta.  
  - **WDM (Wavelength Division Multiplexing):** utiliza diferentes longitudes de onda de luz combinadas en un solo cable de fibra óptica.  

  ### Compuertas Lógicas Usadas
  - AND, OR y NOT  

  ## Amplificadores
  - Señales de baja potencia se refuerzan, manteniendo la misma información pero con mayor potencia.  
  - La energía no se crea ni destruye, solo se amplifica.  

  ### Funciones Principales
  - Compensar atenuación  
  - Reducir el ruido  
  - Aumentar alcance de comunicación  
  - Mejorar soporte multiusuario  
  - Reducir BER (Bit Error Rate)  

  ### Tipos de Amplificadores
  - Ópticos  
  - De línea  
  - Wi-Fi  
  - Electrónicos  

</details>
