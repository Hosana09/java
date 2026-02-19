
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class SobrescritaArquivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try (PrintStream arquivo = new PrintStream("arquivo_sobrescrito.txt")) {
            System.out.println("Digite uma mensagem legal:");
            String mensagem = teclado.nextLine();
            
            arquivo.println(mensagem);
            arquivo.close();
            System.out.println("Mensagem escrita no arquivo com sucesso!");
        }catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
