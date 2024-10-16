public class Calculadora {

    private double primeironumero;
    private double segundonumero;

    public void defPrimeiroNumero(double primeironumero) {
        this.primeironumero = primeironumero;
    }

    public void defSegundoNumero(double segundonumero) {
        this.segundonumero = segundonumero;
    }

    public void mostrarNumeros() {
        System.out.println("Os números são: " + this.primeironumero + " e " + this.segundonumero + ".");
    }

    public double somar() {
        double soma = this.primeironumero + this.segundonumero;
        System.out.println("A soma dos números tem o resultado igual a " + soma + ".");
        return soma;
    }

    public double subtrair() {
        double subtracao = this.primeironumero - this.segundonumero;
        System.out.println("A subtração dos números tem o resultado igual a " + subtracao + ".");
        return subtracao;
    }

    public double multiplicar() {
        double multiplicacao = this.primeironumero * this.segundonumero;
        System.out.println("A multiplicação dos números tem o resultado igual a " + multiplicacao + ".");
        return multiplicacao;
    }

    public double dividir() {
        double divisao = this.primeironumero / this.segundonumero;
        System.out.println("A divisão dos números tem o resultado igual a " + divisao + ".");
        return divisao;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.defPrimeiroNumero(10);
        calculadora.defSegundoNumero(5);
        calculadora.mostrarNumeros();
        calculadora.somar();
        calculadora.subtrair();
        calculadora.multiplicar();
        calculadora.dividir();
    }
}
