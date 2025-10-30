
import java.util.Scanner;

public class ExerciciosComNumeros {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int numero = qualNumero(teclado);
            int soma = soma(teclado);
            float quadrado = quadrado(teclado);

            System.out.println("O número é: " + numero);
            System.out.println("A soma é: " + soma);
            System.out.println("O quadrado é: " + quadrado);
        }
    }

    public static int qualNumero(Scanner teclado) {
        System.out.print("Digite um número inteiro: ");
        int n = Integer.parseInt(teclado.nextLine());
        return n;
    }

    public static int soma(Scanner teclado) {
        System.out.print("Digite o primeiro número para a soma: ");
        int a = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o segundo número para a soma: ");
        int b = Integer.parseInt(teclado.nextLine());
        System.out.print("Digite o terceiro número para a soma: ");
        int c = Integer.parseInt(teclado.nextLine());
        return a + b + c;
    }

    public static float quadrado(Scanner teclado) {
        System.out.print("Digite um número para calcular o quadrado: ");
        float x = Float.parseFloat(teclado.nextLine());
        return x * x;
    }

}
