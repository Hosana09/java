public class Vetores {
    public static void main(String[] args) {
        // Vetores são conhecidos como arrays em Java
        int vetor[]; // Declaração de um vetor
        vetor = new int[5];
        System.out.println("Vetor "+ java.util.Arrays.toString(vetor));

        int outroVetor[] = {1, 2, 3, 4, 5}; // Declaração e inicialização de um vetor
        System.out.println("Outro vetor: " + java.util.Arrays.toString(outroVetor));

        int numeros[] = new int[5]; // Declaração de um vetor de inteiros com tamanho 5
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        System.out.println("Array de números:" + java.util.Arrays.toString(numeros));

        for (int i = 1; i <= vetor.length; i++) {
            vetor[i-1] = i * 10;
            System.out.println("Elemento do vetor Vetor na posição " + (i-1) + ": " + vetor[i-1]);
        }
        System.out.println("Vetor após a atribuição: " + java.util.Arrays.toString(vetor));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)Math.round(Math.random() * 100);
        }
        System.out.println("Vetor numeros atualizado com números aleatórios: " + java.util.Arrays.toString(numeros));

        System.out.println("Elementos do vetor numeros:");
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
