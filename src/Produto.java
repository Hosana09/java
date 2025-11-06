/*
- Nome de classes devem ser substantivos ou substantivos compostos, iniciando com letra maiúscula e utilizando a convenção CamelCase
- Nome de classes não devem conter caracteres especiais, espaços ou números no início
- Nas classes Java, não existe implementação da função main, que é reservada para a execução do programa
- Toda classe possui a forma básica de declaração com a palavra-chave "class" seguida do nome da classe
- O nome da classe deve corresponder ao nome do arquivo em que está definida
- Tudo o que estiver dentro das chaves { } pertence à definição da classe
- Atributos são as características ou propriedades de uma classe, enquanto métodos são as ações ou comportamentos que a classe pode realizar
- Atributos são nomeados em letras minúsculas, utilizando a convenção camelCase para nomes compostos, sem espaços, caracteres especiais ou acentuação
- Métodos é a ação que um objeto da classe pode realizar, e são definidos dentro da classe
- Métodos são comportamentos dos objetos da classe
- Métodos são nomeados em letras minúsculas, utilizando a convenção camelCase para nomes compostos, sem espaços, caracteres especiais ou acentuação
*/

public class Produto {
    String nome;
    float preco;
    float desconto;

    void aumentarPreco(float valor) {
        this.preco += valor;
    }


}
