public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.adicionaValor(59.9);

        System.out.println("Valor atual: " + livro.retornaValor());

        if (livro.aplicaDesconto(0.1)) {
            System.out.println("Valor com desconto: " + livro.retornaValor());
        } else {
            System.out.println("Desconto não pode ser maior do que 30%");
        }
    }
}
