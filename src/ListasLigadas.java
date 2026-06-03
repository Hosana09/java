/*
Listas Ligadas são uma estrutura de dados linear onde cada elemento é um objeto que contém um valor
e uma referência para o próximo elemento da lista. Elas são usadas para armazenar uma coleção de
elementos de forma dinâmica, permitindo a inserção e remoção de elementos em tempo constante.

Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista ligada, eles estão
em lugares diferentes, porém um aponta para o outro, indicando o próximo elemento.
*/

import br.com.hosana.modelos.ListaLigada;

import java.util.LinkedList;
import java.util.List;

public class ListasLigadas {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();
        System.out.println(listaLigada);
//        listaLigada.adicionaElementoNoComeco("Hosana");
//        listaLigada.adicionaElementoNoComeco("Gabriel");
        listaLigada.adicionaElemento("Hosana");
        System.out.println(listaLigada);
        listaLigada.adicionaElemento("Gabriel");
        System.out.println(listaLigada);
        listaLigada.adicionaElemento(1, "Aparecida");
        System.out.println(listaLigada);
        System.out.println("O tamanho da Lista Ligada é: " + listaLigada.tamanho());
        System.out.println("O elemento na posição 1 é: " + listaLigada.pegaElemento(1));

        List<String> outraListaLigada = new LinkedList<>();
        System.out.println(outraListaLigada.size());
        outraListaLigada.add("Hosana");
        outraListaLigada.add("Gabriel");
        outraListaLigada.addFirst("Aparecida");
        System.out.println(outraListaLigada);
    }

}
