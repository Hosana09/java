public class Funcoes {
    static void minhaFuncao() {
        System.out.println("Função chamada!");
    }

    static int[] quadrado(int numero) {
        int total = numero * numero;
        return new int[]{total, numero};
    }

    public static void main(String[] args) {
        minhaFuncao();

        int resultado[] = quadrado(3);
        System.out.println("O quadrado de " + resultado[1] + " é: " + resultado[0]);
    }
}
