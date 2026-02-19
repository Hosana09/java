
import java.util.HashSet;
import java.util.Set;

/* 
    Os conjusntos em Java podem ser representados utilizando a interface Set, que faz parte do framework de coleções do Java. 
    A implementação mais comum de Set é a classe HashSet, que armazena elementos de forma não ordenada e não permite elementos duplicados.
    A performance é melhor quando comparado com listas para operações de busca, inserção e remoção, pois essas operações são geralmente realizadas em tempo constante O(1).
    A ordem dos elementos em um HashSet não é garantida, ou seja, a ordem de iteração pode ser diferente da ordem de inserção.
    Não aceita ordenação e não possui indices, ou seja, não é possível acessar elementos por posição.
*/

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Hosana");
        nomes.add("Gabriel");
        nomes.add("Aparecida");
        nomes.add("José");
        nomes.add("Gabriel"); // Tentativa de adicionar um elemento duplicado
        System.out.println(nomes);

        System.out.println("Tamanho do conjunto: " + nomes.size());

        for (String nome: nomes) {
            System.out.println(nome);
        }
    }
}
