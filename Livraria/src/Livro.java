public class Livro {
    
    String nome;
    String descricao;
    private double valor;
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

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
    }

    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor() {
        return this.autor != null;
    }
}
