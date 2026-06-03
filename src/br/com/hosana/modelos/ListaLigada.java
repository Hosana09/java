package br.com.hosana.modelos;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima;
    private int totalDeElementos;

    public void adicionaElementoNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, this.primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0) {
            this.ultima = this.primeira;
        }

        this.totalDeElementos++;
    }

    public void adicionaElemento(Object elemento) {
        Celula nova = new Celula(elemento, null);

        if (this.totalDeElementos == 0) {
            this.primeira = nova;
        } else {
            this.ultima.setProxima(nova);
        }

        this.ultima = nova;
        this.totalDeElementos++;
    }

    public void adicionaElemento(int posicao, Object elemento) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        if (posicao == 0) {
            this.adicionaElementoNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            this.adicionaElemento(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProxima());
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }

    public Object pegaElemento(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        Celula atual = this.primeira;

        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        builder.append(atual.getElemento());
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        Celula atual = this.primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        return atual;
    }
}
