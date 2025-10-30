import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int idade;
        String nome;
        int ano;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Qual seu nome? ");
            nome = teclado.nextLine();
            System.out.print("Qual sua idade? ");
            idade = teclado.nextInt();
            if (idade <= 0) {
                System.out.println("Idade inválida.");
                return;
            } else {
                System.out.print("Qual o ano atual? ");
                ano = teclado.nextInt();
                System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
            }
        }
   
        if (idade < 18) {
            System.out.println("Você ainda é menor de idade.");
            // While verifica a condição antes de executar
            while (idade < 18) {
                idade++;
                ano++;
                System.out.println("No ano de " + ano + " você terá " + idade + " anos.");
            }
            /* Do while primeiro executa depois verifica a condição
            do {
                idade++;
                ano++;
                System.out.println("No ano de " + ano + " você terá " + idade + " anos.");
            } while (idade < 18);
            */
        } else {
            System.out.println("Você já é maior de idade.");
        }
        
    }
}
