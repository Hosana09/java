package br.com.hosana.modelos;

public class Conta {
    private int numero;
    private String cliente;

    public static int contador =1;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        contador++;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public static void proximaconta() {
        System.out.println("Próxima conta será: " + contador);
    }
}
