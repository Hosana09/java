public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.adicionaValor(59.9);
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;

        livro.mostrarDetalhes();

        Livro novoLivro = new Livro();
        novoLivro.nome = "Java 8 Prático";
        novoLivro.descricao = "Novos recursos da linguagem";
        novoLivro.adicionaValor(59.9);
        novoLivro.isbn = "978-85-66250-46-6";

        novoLivro.mostrarDetalhes();
    }
}
