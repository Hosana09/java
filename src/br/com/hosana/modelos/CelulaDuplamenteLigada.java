package br.com.hosana.modelos;

/**
* Classe que representa uma célula em uma lista duplamente ligada.
* Cada célula contém um elemento, uma referência para a próxima célula da lista e uma referência à célula anterior.
*/
public class CelulaDuplamenteLigada {
    private Object elemento;
    private CelulaDuplamenteLigada proxima;
    private CelulaDuplamenteLigada anterior;

    public CelulaDuplamenteLigada(Object elemento, CelulaDuplamenteLigada proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }

    public CelulaDuplamenteLigada(Object elemento) {
        this(elemento, null);
    }

    public CelulaDuplamenteLigada getProxima() {
        return this.proxima;
    }

    public CelulaDuplamenteLigada getAnterior() {
        return this.anterior;
    }

    public void setProxima(CelulaDuplamenteLigada proxima) {
        this.proxima = proxima;
    }

    public void setAnterior(CelulaDuplamenteLigada anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return this.elemento;
    }
}
