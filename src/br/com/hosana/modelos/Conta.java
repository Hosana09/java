package br.com.hosana.modelos;

public class Conta {
    private final int numero;
    private final String cliente;
    private double saldo;

    public static int contador =1;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        this.saldo = 0.0f;
        contador++;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void depositar(double valor) {
        this.saldo += valor;
    }

    public static void proximaConta() {
        System.out.println("Próxima conta será: " + contador);
    }
}
