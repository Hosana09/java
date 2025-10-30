public class IfElse {
    public static void main(String[] args) {
        // Declarando e inicializando uma variável numérica
        int numero = 7, valor;

        if (numero > 5) {
            System.out.println("O número " + numero + " é maior que 5.");
        } else if (numero < 5) {
            System.out.println("O número " + numero + " é menor que 5.");
        } else {
            System.out.println("O número " + numero + " é igual a 5.");
        }

        // Atribuindo valor com base na paridade do número usando operador ternário
        valor = (numero % 2 == 0) ? 100 : 200;
        System.out.println("O valor atribuído é: " + valor + " já que a variável numero é " + (numero % 2 == 0 ? "par." : "ímpar."));

        // Usando switch-case para diferentes valores da variável numero
        switch (numero) {
            case 1 -> System.out.println("O número é 1.");
            case 2 -> System.out.println("O número é 2.");
            case 3 -> System.out.println("O número é 3.");
            case 4 -> System.out.println("O número é 4.");
            case 5 -> System.out.println("O número é 5.");
            case 6 -> System.out.println("O número é 6.");
            case 7 -> System.out.println("O número é 7.");
            default -> System.out.println("O número não está entre 1 e 7.");
        }
    }
}
