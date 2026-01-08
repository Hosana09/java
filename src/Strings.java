/*
    Em Java, Strings são imutáveis, o que significa que uma vez que uma String é criada, seu valor não pode ser alterado.
    Qualquer operação que modifique uma String na verdade cria uma nova String.
    A classe String em Java fornece vários métodos úteis para manipulação de Strings, como length(), charAt(), substring(), indexOf(), toUpperCase(), toLowerCase(), trim(), replace(), split(), entre outros.
    Strings em Java são objetos, e podem ser criadas usando aspas duplas. Por exemplo: String minhaString = "Olá, Mundo!";
*/

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String minhaString = "  Olá, Mundo!  ";
        
        // Usando alguns métodos da classe String
        System.out.println("String original: '" + minhaString + "'");
        System.out.println("Comprimento da String: " + minhaString.length());
        System.out.println("Caractere na posição 5: " + minhaString.charAt(5));
        System.out.println("Substring (0, 5): '" + minhaString.substring(0, 5) + "'");
        System.out.println("Índice da palavra 'Mundo': " + minhaString.indexOf("Mundo"));
        System.out.println("String em maiúsculas: '" + minhaString.toUpperCase() + "'");
        System.out.println("String em minúsculas: '" + minhaString.toLowerCase() + "'");
        System.out.println("String com espaços removidos: '" + minhaString.trim() + "'");
        System.out.println("String com 'Mundo' substituído por 'Java': '" + minhaString.replace("Mundo", "Java") + "'");
        
        // Dividindo a String em um array
        String[] partes = minhaString.trim().split(", ");
        System.out.println(Arrays.toString(partes));
        System.out.println("Partes da String:");
        for (String parte : partes) {
            System.out.println(parte);
        }
    }
}
