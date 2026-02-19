
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
    Os mapas em Java podem ser representados utilizando a interface Map, que faz parte do framework de coleções do Java.
    A classe HashMap em Java é uma implementação da interface Map que armazena pares de chave-valor.
    Ela permite o armazenamento eficiente e a recuperação de valores com base em suas chaves.
    A principal característica do HashMap é que ele utiliza uma tabela hash para organizar os dados.
    O que proporciona operações rápidas de inserção, busca e remoção, geralmente em tempo constante O(1).
    As chaves em um HashMap devem ser únicas, ou seja, não podem haver chaves duplicadas.
    Caso uma chave já exista no mapa, o valor associado a essa chave será atualizado com o novo valor fornecido.
    A ordem dos elementos em um HashMap não é garantida, ou seja, a ordem de iteração pode ser diferente da ordem de inserção.
*/

public class Mapas {
    public static void main(String[] args) {
        Map<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Hosana", 30);
        idadePorNome.put("Gabriel", 25);
        idadePorNome.put("Aparecida", 28);
        idadePorNome.put("José", 35);

        System.out.println(idadePorNome);

        System.out.println("Idade do Gabriel: " + idadePorNome.get("Gabriel"));

        for (Map.Entry<String, Integer> nome : idadePorNome.entrySet()) {
            System.out.println(nome.getKey() + " tem " + nome.getValue() + " anos.");
        }

        System.out.println("Total de pessoas cadastradas: " + idadePorNome.size());

        idadePorNome.keySet().forEach(nome -> {
            System.out.println(idadePorNome.get(nome));
        });

        // Coleção de chaves
        System.out.println("Chaves: " + idadePorNome.keySet());
        // Coleção de valores
        System.out.println("Valores: " + idadePorNome.values());
        // Coleção de associações
        System.out.println("Associações: " + idadePorNome.entrySet());

        Set<String> nomes = idadePorNome.keySet();
        System.out.println(nomes);
    }
}
