public class TiposDeDados {
    public static void main(String[] args) {
        // Tipos primitivos em Java
        int numeroInteiro = 10;          // Tipo primitivo: inteiro
        short numeroCurto = 5;          // Tipo primitivo: curto/menor/baixo
        double numeroDecimal = 10.5;     // Tipo primitivo: ponto flutuante
        char caractere = 'A';            // Tipo primitivo: caractere
        boolean verdadeiroFalso = true;  // Tipo primitivo: booleano
        float numeroFloat = 5.75f;      // Tipo primitivo: ponto flutuante (float)
        byte numeroByte = 100;         // Tipo primitivo: byte
        long numeroLongo = 1000L;      // Tipo primitivo: longo
        boolean verdadeiro = true;    // Tipo primitivo: booleano
        boolean falso = false;       // Tipo primitivo: booleano

        System.out.println("Tipos Primitivos:");
        System.out.println("int: " + numeroInteiro);
        System.out.println("short: " + numeroCurto);
        System.out.println("double: " + numeroDecimal);
        System.out.println("char: " + caractere);
        System.out.println("boolean: " + verdadeiroFalso);
        System.out.println("float: " + numeroFloat);
        System.out.println("byte: " + numeroByte);
        System.out.println("long: " + numeroLongo);
        System.out.println("boolean verdadeiro: " + verdadeiro);
        System.out.println("boolean falso: " + falso);

        // Tipos não primitivos
        Integer numeroInteiroObj = 10; // Tipo não primitivo: Integer (classe wrapper) 
        Short numeroCurtoObj = 5;     // Tipo não primitivo: Short (classe wrapper)
        String texto = "Olá, Mundo!";   // Tipo não primitivo: String
        Float numeroFloatObj = 5.75f; // Tipo não primitivo: Float (classe wrapper)
        Double numeroDecimalObj = 10.5; // Tipo não primitivo: Double (classe wrapper)
        Character caractereObj = 35;   // Tipo não primitivo: Character (classe wrapper) e utilizando código ASCII
        Byte numeroByteObj = 100;    // Tipo não primitivo: Byte (classe wrapper)
        Long numeroLongoObj = 1000L; // Tipo não primitivo: Long (classe wrapper)
        Boolean verdadeiroObj = true; // Tipo não primitivo: Boolean (classe wrapper)
        Boolean falsoObj = false;   // Tipo não primitivo: Boolean (classe wrapper)


        System.out.println("Tipos Não Primitivos:");
        System.out.println("Integer: " + numeroInteiroObj);
        System.out.println("Short: " + numeroCurtoObj);
        System.out.println("String: " + texto);
        System.out.println("Float: " + numeroFloatObj);
        System.out.println("Double: " + numeroDecimalObj);
        System.out.println("Character: " + caractereObj);
        System.out.println("Byte: " + numeroByteObj);
        System.out.println("Long: " + numeroLongoObj);
        System.out.println("Boolean verdadeiro: " + verdadeiroObj);
        System.out.println("Boolean falso: " + falsoObj);

        System.out.println("Espaços ocupados na memória (em bytes):");
        System.out.println("int: " + Integer.SIZE + " bits ou " + (Integer.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE + ", Valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " bits ou " + (Short.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de short: " + Short.MIN_VALUE + ", Valor máximo de short: " + Short.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " bits ou " + (Double.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE + ", Valor máximo de double: " + Double.MAX_VALUE);
        System.out.println("char: " + Character.SIZE + " bits ou " + (Character.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de char: " + (int) Character.MIN_VALUE + ", Valor máximo de char: " + (int) Character.MAX_VALUE);
        System.out.println("float: " + Float.SIZE + " bits ou " + (Float.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE + ", Valor máximo de float: " + Float.MAX_VALUE);
        System.out.println("byte: " + Byte.SIZE + " bits ou " + (Byte.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de byte: " + Byte.MIN_VALUE + ", Valor máximo de byte: " + Byte.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " bits ou " + (Long.SIZE / 8) + " bytes");
        System.out.println("Valor mínimo de long: " + Long.MIN_VALUE + ", Valor máximo de long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de Boolean: " + Boolean.FALSE + ", Valor máximo de Boolean: " + Boolean.TRUE);
    }
}
