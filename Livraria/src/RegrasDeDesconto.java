public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.valor = 59.9;

        System.out.println("Valor atual: " + livro.valor);

        if (livro.aplicaDesconto(0.4)) {
            System.out.println("Valor com desconto: " + livro.valor);
        } else {
            System.out.println("Desconto não pode ser maior do que 30%");
        }
    }
}
