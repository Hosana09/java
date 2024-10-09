public class Livro {
    
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN :" + isbn);
        System.out.println("--");
        autor.mostrarDetalhes();
    }

    public void aplicaDesconto(double porcentagem) {
        this.valor -= this.valor * porcentagem; 
    }
}
