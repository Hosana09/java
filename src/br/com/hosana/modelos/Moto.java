package br.com.hosana.modelos;

public class Moto {
    private final String marca;
    private final String modelo;
    private final String cor;
    private int marcha;

    public Moto(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getMarcha() {
        return switch (this.marcha) {
            case 0 -> "Neutro";
            case 1 -> "Primeira";
            case 2 -> "Segunda";
            case 3 -> "Terceira";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Marcha inválida";
        };
    }

    public void imprimirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marcha atual: " + this.getMarcha());
    }

    public void mudarMarcha(int novaMarcha) {
        if (novaMarcha >= 0 && novaMarcha <= 6) {
            this.marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + this.getMarcha());
        } else {
            System.out.println("Marcha inválida. A marcha deve estar entre 0 e 6.");
        }
    }

}
