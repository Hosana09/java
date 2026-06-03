package br.com.hosana.modelos;

public class ListaDuplamenteLigada {
    private CelulaDuplamenteLigada primeira = null;
    private CelulaDuplamenteLigada ultima;
    private int totalDeElementos;

    public void adicionaElementoNoComeco(Object elemento) {
        CelulaDuplamenteLigada nova = new CelulaDuplamenteLigada(elemento, this.primeira);
        if (this.totalDeElementos == 0) {
            this.primeira = nova;
            this.ultima = nova;
        } else {
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos = this.totalDeElementos + 1;
    }

    public void adicionaElemento(Object elemento) {


        if (this.totalDeElementos == 0) {
            this.adicionaElementoNoComeco(elemento);
        } else {
            CelulaDuplamenteLigada nova = new CelulaDuplamenteLigada(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
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
            CelulaDuplamenteLigada anterior = this.pegaCelula(posicao - 1);
            CelulaDuplamenteLigada proxima = anterior.getProxima();
            CelulaDuplamenteLigada nova = new CelulaDuplamenteLigada(elemento, proxima);
            anterior.setProxima(nova);
            nova.setAnterior(anterior);
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
        CelulaDuplamenteLigada atual = this.primeira;

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

    private CelulaDuplamenteLigada pegaCelula(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        CelulaDuplamenteLigada atual = this.primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }

        return atual;
    }
}
