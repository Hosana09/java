/*
Existem dois grandes tipos de exceções em Java:

1. Checked Exceptions (Exceções Verificadas): São aquelas que o compilador obriga 
o programador a tratar, seja com um bloco try-catch ou declarando a exceção
com a palavra-chave throws. Exemplos comuns incluem IOException e SQLException.

2. Unchecked Exceptions (Exceções Não Verificadas): São aquelas que não são
verificadas pelo compilador. Elas geralmente indicam erros de programação, como 
NullPointerException e ArrayIndexOutOfBoundsException.
*/

public class TryCatch {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 3 * 2;
        }

        for(int i = 0; i<= numeros.length; i++) {
            try {
                System.out.println(numeros[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Índice " + i + " está fora dos limites do array.");
            } finally {
                System.out.println("Iteração " + (i + 1) + " concluída.");
            }
        }

        try {
            int resultado = divisao(10, 0);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro na divisão: " + e.getMessage());
        }
    }

    public static int divisao(int a, int b) throws Exception {
        return a / b;
    }
}
