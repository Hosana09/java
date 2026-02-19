import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ExerciciosArquivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try (PrintStream arquivo = new PrintStream(new FileOutputStream("arq.txt", true))) {
            System.out.println("Digite a mensagem:");
            String mensagem = teclado.nextLine();

            while (!"0".equals(mensagem)) {
                arquivo.println(mensagem);
                System.out.println("Digite a mensagem:");
                mensagem = teclado.nextLine();
            }

            arquivo.close();
            System.out.println("Mensagens escritas no arquivo com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }

        System.out.println("Digite o nome do arquivo a ser lido:");
        String nomeArquivo = teclado.nextLine();
        String[] vogais = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        String[] consoantes = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z",
                "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
        int contadorVogais = 0;
        int contadorConsoantes = 0;

        try (Scanner leitura = new Scanner(new FileInputStream(nomeArquivo))) {
            int contadorLinhas = 0;
            System.out.println("-------------------------------------------");
            System.out.println("Conteúdo do arquivo " + nomeArquivo + ":");
            while (leitura.hasNextLine()) {
                String linha = leitura.nextLine();
                System.out.println(linha);
                contadorLinhas++;
                for (char caractere : linha.toCharArray()) {
                    for (String vogal : vogais) {
                        if (String.valueOf(caractere).equals(vogal)) {
                            contadorVogais++;
                        }
                    }
                    for (String consoante : consoantes) {
                        if (String.valueOf(caractere).equals(consoante)) {
                            contadorConsoantes++;
                        }
                    }
                }
            }
            System.out.println("Número total de linhas: " + contadorLinhas);
            System.out.println("Número total de vogais: " + contadorVogais);
            System.out.println("Número total de consoantes: " + contadorConsoantes);
            System.out.println("-------------------------------------------");
            leitura.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
