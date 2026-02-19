
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivos {
    public static void main(String[] args) {
        try(Scanner leitura = new Scanner(new FileInputStream("entrada.txt"))){
            while (leitura.hasNextLine()) {
                String linha = leitura.nextLine();
                System.out.println(linha);
            }
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }

    }
}
