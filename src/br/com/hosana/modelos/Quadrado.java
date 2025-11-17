package br.com.hosana.modelos;

public class Quadrado {
    private float lado;
    private float area;
    private float perimetro;

    public Quadrado(float lado) {
        this.lado = lado;
        this.calcularArea();
        this.calcularPerimetro();
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    void calcularArea() {
        this.area = this.lado * this.lado;
    }

    void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public void imprimirInformacoes() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
