
import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int n1 = Integer.parseInt(teclado.nextLine());
            System.out.print("Digite outro número inteiro: ");
            int n2 = Integer.parseInt(teclado.nextLine());

            int maior = (n1 > n2) ? n1 : n2;
            System.out.println("O maior número entre " + n1 + " e " + n2 + " é: " + maior + "!");

            int raiz = (maior > 0) ? maior * maior : 0;
            if (raiz == 0) {
                System.out.println("O número " + maior + " é inválido.");
            } else {
                System.out.println("A raiz quadrada de " + maior + " é: " + raiz + "!");
            }

            if (maior % 2 == 0) {
                System.out.println("O número " + maior + " é par.");
            } else {
                System.out.println("O número " + maior + " é ímpar.");
            }
        }
    }
}
