
import java.util.Scanner;

public class ExerciciosFuncoes {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite um número para calcular o dobro: ");
            int resultado = dobro(teclado.nextInt());
            System.out.println("O dobro de " + resultado + " é: " + resultado);

            System.out.println("Agora vamos formatar uma data.");
            System.out.println("Estamos em qual dia? ");
            int dia = teclado.nextInt();
            System.out.println("Estamos em qual mês? ");
            int mes = teclado.nextInt();
            System.out.println("Estamos em qual ano? ");
            int ano = teclado.nextInt();
            String dataFormatada = formataData(dia, mes, ano);
            System.out.println("Hoje é dia " + dataFormatada);

            System.out.println("Vamos descobrir qual é o maior número entre dois números.");
            System.out.print("Digite o primeiro número: ");
            int num1 = teclado.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = teclado.nextInt();
            int maiorNumero = qualMaior(num1, num2);
            System.out.println("O maior número entre " + num1 + " e " + num2 + " é: " + maiorNumero);
        }    
    }

    static int dobro(int numero) {
        return numero * 2;
    }

    static String formataData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            return "Data inválida";
        }

        String mesEscito;
        switch (mes) {
            case 1 -> mesEscito = "janeiro";
            case 2 -> mesEscito = "fevereiro";
            case 3 -> mesEscito = "março";
            case 4 -> mesEscito = "abril";
            case 5 -> mesEscito = "maio";
            case 6 -> mesEscito = "junho";
            case 7 -> mesEscito = "julho";
            case 8 -> mesEscito = "agosto";
            case 9 -> mesEscito = "setembro";
            case 10 -> mesEscito = "outubro";
            case 11 -> mesEscito = "novembro";
            case 12 -> mesEscito = "dezembro";
            default -> mesEscito = "mês inválido";
        }
        return dia + " de " + mesEscito + " de " + ano + ".";
    }

    static int qualMaior(int a, int b) {
        return (a > b) ? a : b;
    }
}
