
import java.util.ArrayList;
import java.util.Collections;

/*
    Arrays (vetores/matrizes) possuem tamanho fixo, ou seja, uma vez criado, seu tamanho não pode ser alterado.
    Um array tem tipo de dado homogêneo, ou seja, só pode armazenar dados do mesmo tipo.
    É difícil encontrar um determinado elemento, é necessário percorrer o array para encontrar o elemento desejado.

    Mas em Java, existem diversas classes/interfaces que facilitam o tratamento de coleções de dados, como List, Set, Map, etc.
    Essas classes/interfaces são chamas de Collections (coleções) e estão presentes no pacote java.util.
    As Collections possuem tamanho dinâmico, ou seja, podem crescer ou diminuir conforme a necessidade.

    Listas (List) são coleções que armazenam elementos de forma ordenada e permitem elementos duplicados.
    Possuem tamanho infinito, ou seja, podem crescer conforme a necessidade (depende da memória disponível).
    Permitem adição de qualquer tipo de dado (objetos), ou seja, são heterogêneas quando usamos o tipo genérico Object.

*/

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Hosana");
        nomes.add("Gabriel");
        nomes.add("Aparecida");
        nomes.add("José");
        // nomes.add(true);
        // nomes.add(10.5);
        // nomes.add(9);

        System.out.println("Lista de nomes: " + nomes);
        System.out.println("Tamanho da lista: " + nomes.size());
        System.out.println("Elemento na posição 2: " + nomes.get(2));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome na posição " + i + ": " + nomes.get(i));
        }

        Collections.sort(nomes);
        System.out.println("Lista de nomes ordenada: " + nomes);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        System.out.println("Lista de números: " + numeros);
        Collections.sort(numeros);
        System.out.println("Lista de números ordenada: " + numeros);
    }
}
