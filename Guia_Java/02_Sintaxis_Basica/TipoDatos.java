// TipoDatos.java
// Ejemplos de tipos de datos en Java

public class TipoDatos {
    public static void main(String[] args) {

        // Tipos primitivos
        byte tipoByte = 100;             // 8 bits, entero pequeño
        short tipoShort = 30000;         // 16 bits, entero mediano
        int tipoInt = 100000;            // 32 bits, entero común
        long tipoLong = 10000000000L;    // 64 bits, entero grande

        float tipoFloat = 3.14f;         // 32 bits, punto flotante
        double tipoDouble = 3.14159265359; // 64 bits, punto flotante de doble precisión

        char tipoChar = 'A';             // Carácter Unicode
        boolean tipoBoolean = true;      // true o false

        // Imprimir valores
        System.out.println("byte: " + tipoByte);
        System.out.println("short: " + tipoShort);
        System.out.println("int: " + tipoInt);
        System.out.println("long: " + tipoLong);
        System.out.println("float: " + tipoFloat);
        System.out.println("double: " + tipoDouble);
        System.out.println("char: " + tipoChar);
        System.out.println("boolean: " + tipoBoolean);

        // Inferencia de tipos (Java 10+)
        var numero = 42;                 // Se infiere como int
        var texto = "Hola";              // Se infiere como String

        System.out.println("var numero: " + numero);
        System.out.println("var texto: " + texto);

        // Conversiones (casting)
        int entero = 100;
        double convertidoDouble = entero; // Conversión implícita
        int convertidoInt = (int) tipoDouble; // Conversión explícita

        System.out.println("Entero convertido a double: " + convertidoDouble);
        System.out.println("Double convertido a int: " + convertidoInt);
    }
}

