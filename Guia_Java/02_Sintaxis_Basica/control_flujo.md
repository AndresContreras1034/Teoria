# Control de flujo en Java

El **control de flujo** permite decidir qué partes del código se ejecutan y cuántas veces, en función de condiciones o iteraciones.

---

## 1. Condicional `if-else`

Permite ejecutar código si se cumple una condición.

```java
int numero = 5;
if (numero > 0) {
    System.out.println("Positivo");
} else if (numero < 0) {
    System.out.println("Negativo");
} else {
    System.out.println("Cero");
}
```

---

## 2. Sentencia `switch`

Selecciona un bloque de código según el valor de una variable.

```java
int dia = 3;
switch (dia) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    default:
        System.out.println("Otro día");
}
```

---

## 3. Bucles

### `for`
Se usa cuando se conoce el número de iteraciones.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteración " + i);
}
```

### `while`
Se ejecuta mientras la condición sea verdadera.

```java
int contador = 3;
while (contador > 0) {
    System.out.println("Cuenta regresiva: " + contador);
    contador--;
}
```

### `do-while`
Se ejecuta **al menos una vez** y luego verifica la condición.

```java
int x = 0;
do {
    System.out.println("Valor de x: " + x);
    x++;
} while (x < 3);
```

---

## 4. Control adicional

- `break` → sale del bucle o `switch`.
- `continue` → salta a la siguiente iteración del bucle.
- `return` → sale de un método.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue; // salta el 3
    if (i == 5) break;    // termina el bucle
    System.out.println(i);
}
```
```

