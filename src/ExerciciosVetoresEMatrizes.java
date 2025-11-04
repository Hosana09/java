public class ExerciciosVetoresEMatrizes {
    public static void main(String[] args) {
        int a[] = {1, 0, 5, -2, -5, 7};
        System.out.println("Vetor a: " + java.util.Arrays.toString(a));
        
        int soma_posicoes = a[0] + a[1] + a[5];
        System.out.println("Soma das posições 0, 1 e 5: " + soma_posicoes); 

        a[4] = 100;
        System.out.println("Valor na posição 4 após alteração: " + a[4]);
        System.out.println("Vetor a após alteração: " + java.util.Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + a[i]);
        }

        int matriz[][] = new int[4][4];
        System.out.println("Matriz inicial: " + java.util.Arrays.deepToString(matriz));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j * 4;
            }
        }
        System.out.println("Matriz após atribuição: " + java.util.Arrays.deepToString(matriz));

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 10) {
                    System.out.println("Elemento na posição matriz[" + i + "][" + j + "] maior ou igual a 10: " + matriz[i][j]);
                }
            }
        }

        int matriz_cinco_cinco[][] = {
            {5, 10, 15, 20, 25},
            {30, 35, 40, 45, 50},
            {55, 60, 65, 70, 75},
            {80, 85, 90, 95, 100},
            {105, 110, 115, 120, 125}
        };
        int numero = 49;
        int possui_numero = 0;
        for (int i = 0; i < matriz_cinco_cinco.length; i++) {
            for (int j = 0; j < matriz_cinco_cinco[i].length; j++) {
                if (matriz_cinco_cinco[i][j] == numero) {
                    System.out.println("Número " + numero + " encontrado na posição matriz_cinco_cinco[" + i + "][" + j + "]");
                    possui_numero = 1;
                }
            }
        }

        if (possui_numero == 0) {
            System.out.println("Número " + numero + " não encontrado na matriz.");
        }
    }
}
