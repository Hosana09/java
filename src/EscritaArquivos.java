
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try (PrintStream arquivo = new PrintStream(new FileOutputStream("saida.txt", true))) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite a mensagem " + (i + 1) + ":");
                String mensagem = teclado.nextLine();
                arquivo.println(mensagem);
            }
            arquivo.close();
            System.out.println("Mensagens escritas no arquivo com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
