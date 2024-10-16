public class ContaBancaria {
    private String numeroDaConta;
    private double saldo = 0;

    public void defNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void defSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void verNumeroDaConta() {
        System.out.println("O número da conta é: " + numeroDaConta + ".");
    }

    public void verSaldo() {
        System.out.println("O saldo atual é de: " + saldo + ".");
    }

    public double depositar(double deposito) {
        this.saldo = this.saldo + deposito;
        System.out.println("O saldo atual, após o depósito, é de " + this.saldo + ".");
        return this.saldo;
    }

    public double sacar(double saque) {
        this.saldo = this.saldo - saque;
        System.out.println("O saldo atual, após o saque, é de " + this.saldo + ".");
        return this.saldo;
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.defNumeroDaConta("12345678-9");
        contaBancaria.depositar(50);
        contaBancaria.sacar(10);
        contaBancaria.depositar(50000.45);
        contaBancaria.sacar(412.4);
        contaBancaria.depositar(785.65);
        contaBancaria.verNumeroDaConta();
        contaBancaria.verSaldo();
    }
}
