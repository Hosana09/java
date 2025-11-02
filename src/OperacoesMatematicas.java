public class OperacoesMatematicas {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisaoDouble = (double) num1 / num2;
        float divisaoFloat = (float) num1 / num2;
        int resto = num1 % num2;

        System.out.println("Soma de " + num1 + " e " + num2 + " é " + soma);
        System.out.println("Subtração de " + num1 + " e " + num2 + " é " + subtracao);
        System.out.println("Multiplicação de " + num1 + " e " + num2 + " é " + multiplicacao);
        System.out.println("Divisão (double) de " + num1 + " e " + num2 + " é " + divisaoDouble);
        System.out.println("Divisão (float) de " + num1 + " e " + num2 + " é " + divisaoFloat);
        System.out.println("Resto da divisão de " + num1 + " e " + num2 + " é " + resto);
    }
}
