
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("De quantos cantores você gosta? ");
            int qntCantores = teclado.nextInt();
            teclado.nextLine();
            for (int i = 1; i <= qntCantores; i++) {
                System.out.print("Digite o nome do cantor " + i + ": ");
                String nomeCantor = teclado.nextLine();
                System.out.println("Você gosta do cantor " + nomeCantor + ".");
                System.out.println(nomeCantor + " se soletra: ");
                for (char letra : nomeCantor.toCharArray()) {
                    System.out.println(letra);
                }
            }
        }
    }
}
