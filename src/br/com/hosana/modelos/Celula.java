package br.com.hosana.modelos;

/**
* Classe que representa uma célula em uma lista ligada.
* Cada célula contém um elemento e uma referência para a próxima célula da lista.
*/
public class Celula {
    private Object elemento;
    private Celula proxima;

    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public Celula getProxima() {
        return this.proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    public Object getElemento() {
        return this.elemento;
    }
}
