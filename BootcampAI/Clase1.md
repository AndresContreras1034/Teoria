
# Día 4  
## Bootcamp Inteligencia Artificial - Integrador  

---

## 5. Función de Activación

Una función de activación es una función matemática utilizada en una neurona artificial para introducir **no linealidad** en el modelo. Esto permite que la red neuronal pueda aprender y representar funciones complejas.  

Ejemplos comunes de funciones de activación incluyen:

- Función sigmoide  
- Tangente hiperbólica (tanh)  
- Unidad lineal rectificada (ReLU)  

---

## 6. Entrenamiento de una Red Neuronal

El entrenamiento de una red neuronal es el proceso de ajustar los **pesos (weights)** y **biases** de la red mediante un algoritmo de optimización, generalmente basado en el **descenso de gradiente**.  

El objetivo es minimizar la **función de pérdida**, que mide la diferencia entre las predicciones de la red y los valores reales.  

Durante el entrenamiento, la red aprende a **generalizar patrones** a partir de los datos de entrenamiento para hacer predicciones en datos nuevos.

---

## 7. Backpropagation (Retropropagación)

Backpropagation es un algoritmo utilizado para entrenar redes neuronales multicapa.  

Calcula el **gradiente** de la función de pérdida con respecto a los pesos de la red, utilizando la **regla de la cadena**. Este gradiente se utiliza luego para actualizar los pesos de manera que se minimice la pérdida.  

Es esencial para la eficiencia del entrenamiento de redes neuronales profundas.

### ¿Qué es el gradiente?

El gradiente es un concepto derivado de la optimización. Representa la dirección en la cual debe moverse una función para reducir el error hasta acercarlo a 0.  

Con esta dirección podemos saber cómo modificar los pesos de la red neuronal para minimizar la función de pérdida.

---

## 8. Overfitting (Sobreajuste)

Es un fenómeno en el que una red neuronal se entrena tan bien con los datos de entrenamiento que pierde la capacidad de generalizar a datos nuevos.  

Esto ocurre cuando el modelo es muy complejo y comienza a **memorizar los datos** en lugar de aprender patrones.

### ¿Cómo prevenir el sobreajuste?

Algunas técnicas comunes son:

- Dropout  
- Uso de un conjunto de validación  

Generalmente se sospecha overfitting cuando la precisión en entrenamiento se acerca demasiado al 100%.

Cada área específica tiene un margen de error aceptado según el tipo de problema. Siempre ha habido un especialista que evalúa si el modelo es adecuado o no dependiendo del contexto y las métricas utilizadas. En algunos casos, este proceso puede relacionarse con enfoques como el aprendizaje por refuerzo.

---

## Función de Costo o Pérdida

La función de costo o pérdida es una función matemática que cuantifica la diferencia entre las predicciones de la red y los valores reales en los datos de entrenamiento.

---

## Caso Interesante: Entrenamiento Prolongado y Generalización Emergente

Un investigador de OpenAI olvidó detener una sesión de entrenamiento antes de irse de vacaciones.

Para cuando regresó, el modelo ya había asimilado la información. Pasó de la **memorización pura** a la **comprensión genuina**, una transición que aparece repentinamente tras largos períodos de entrenamiento.

Welch Labs detalla exactamente lo que sucedió:

- El modelo memoriza los datos de entrenamiento de forma temprana.  
- La pérdida de entrenamiento se reduce a cero, mientras que la precisión en prueba se mantiene baja.  
- El entrenamiento continúa sin progreso visible.  
- De repente, la precisión en prueba se vuelve casi perfecta.  

No hubo datos nuevos.  
No hubo cambios en la arquitectura.  
Solo más entrenamiento, con la disminución del peso (*weight decay*) impulsando lentamente al modelo hacia una solución más simple y general.

### Idea Clave

Parte del aprendizaje más importante puede ocurrir mucho después de que la pérdida de entrenamiento se haya estabilizado.

Esto desafía la idea tradicional de que entrenar después del sobreajuste es simplemente computación desperdiciada.

---

## Modelos de Caja Negra, Caja Blanca y Caja Gris

### 🔒 Caja Negra (Black Box)

Un modelo de **caja negra** es aquel en el que no se entiende fácilmente cómo se llega a una decisión interna.  

Solo se observan:

- **Entradas (inputs)**
- **Salidas (outputs)**

Pero el proceso interno que transforma la entrada en salida no es interpretable o no es accesible para el usuario.

Este tipo de modelos es común en:

- Inteligencia Artificial (especialmente redes neuronales profundas)
- Machine Learning avanzado
- Ciberseguridad

### Ejemplo

Cuando utilizas un GPS, ingresas un destino y el sistema te muestra una ruta con varios puntos. Sin embargo, no sabes exactamente qué cálculos internos realiza para determinar esa ruta.

Otro ejemplo es un usuario común usando ChatGPT:  
Escribe una pregunta y recibe una respuesta, pero no puede ver ni entender el proceso interno del modelo.

---

###  Caja Blanca (White Box)

Un modelo de **caja blanca** es aquel en el que el funcionamiento interno es completamente visible y entendible.

Se puede:

- Analizar cómo se toman las decisiones
- Revisar reglas y cálculos
- Interpretar cada paso del proceso

Ejemplos comunes:

- Regresión lineal
- Árboles de decisión simples
- Algoritmos basados en reglas

Estos modelos son altamente interpretables y se usan mucho cuando la transparencia es importante (por ejemplo, en medicina o finanzas).

---

###  Caja Gris (Gray Box)

Un modelo de **caja gris** es un punto intermedio entre caja negra y caja blanca.

Se tiene conocimiento parcial del funcionamiento interno:

- Se entienden algunas partes del modelo.
- O se pueden aplicar técnicas de interpretabilidad para analizarlo.

Ejemplos:

- Redes neuronales con técnicas de interpretación (SHAP, LIME).
- Sistemas donde se conoce la arquitectura general, pero no cada detalle interno.

---

## Importancia en IA y Ciberseguridad

En inteligencia artificial y ciberseguridad, entender si un sistema es caja negra, blanca o gris es clave para:

- Evaluar riesgos
- Detectar sesgos
- Garantizar transparencia
- Cumplir regulaciones

La tendencia actual en IA es desarrollar modelos cada vez más potentes, pero también más interpretables.
