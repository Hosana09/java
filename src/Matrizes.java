public class Matrizes {
    public static void main(String[] args) {
        // nome_da_matriz[linhas][colunas]
        int matriz[][] = new int[3][3]; // Declaração e definição de uma matriz 3x3
        System.out.println("Matriz inicial: " + java.util.Arrays.deepToString(matriz));

        int matrizInicializada[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // Declaração e inicialização de uma matriz
        System.out.println("Matriz inicializada: " + java.util.Arrays.deepToString(matrizInicializada));

        matriz[0][0] = 1;
        matriz[0][1] = 3;
        matriz[0][2] = 5;
        matriz[1][0] = 7;
        matriz[1][1] = 9;
        matriz[1][2] = 11;
        matriz[2][0] = 13;
        matriz[2][1] = 15;
        matriz[2][2] = 17;
        System.out.println("Matriz matriz após atribuição: " + java.util.Arrays.deepToString(matriz));

        System.out.println("Elemento na posição matriz[1][2]: " + matriz[1][2]);
        System.out.println("Elemento na posição matriz[2][1]: " + matriz[2][1]);

        System.out.println("Imprimindo todos os elementos da matriz a partir de um for:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento na posição matriz[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
