# Conversiones de tipos en Java

En Java, a veces es necesario **convertir un tipo de dato en otro**. Esto se conoce como *casting* o conversión de tipos.  
Hay dos tipos principales: **implícitas** y **explícitas**.

---

## 1. Conversión implícita (widening)

Ocurre cuando se convierte un tipo más pequeño a uno más grande en capacidad.  
El compilador lo hace automáticamente y no hay pérdida de datos (en la mayoría de los casos).

```java
int numeroEntero = 42;
double numeroDouble = numeroEntero; // int → double (implícita)
System.out.println(numeroDouble); // 42.0
```

Tipos numéricos de menor a mayor capacidad:
```
byte → short → int → long → float → double
```

---

## 2. Conversión explícita (narrowing)

Se usa cuando se convierte un tipo más grande a uno más pequeño.  
Puede haber **pérdida de datos** y requiere un *casting* manual.

```java
double valorDouble = 9.78;
int valorEntero = (int) valorDouble; // double → int (explícita)
System.out.println(valorEntero); // 9
```

---

## 3. Conversión entre tipos primitivos y objetos (Wrapper classes)

Java proporciona clases envoltorio (*wrapper*) para cada tipo primitivo:  
`Integer`, `Double`, `Character`, etc.

```java
int numero = 5;
Integer numeroObjeto = numero; // Autoboxing (int → Integer)
int numeroPrimitivo = numeroObjeto; // Unboxing (Integer → int)
```

---

## 4. Conversión de cadenas a números

```java
String texto = "123";
int numero = Integer.parseInt(texto); // String → int
double decimal = Double.parseDouble("3.14"); // String → double
```

---

## 5. Conversión de números a cadenas

```java
int num = 42;
String texto = String.valueOf(num); // int → String
String texto2 = num + ""; // concatenación
```

---

## Buenas prácticas

- Usar conversión implícita siempre que sea posible para evitar pérdida de datos.
- Validar cadenas antes de convertirlas a números para evitar `NumberFormatException`.
```

