public class Classes {
    public static void main(String[] args) {
        //  Instanciando um objeto da classe Produto
        Produto notebook = new Produto();
        System.out.println("Local alocado em memoria para o objeto produto: " + notebook);

        notebook.nome = "Notebook";
        notebook.preco = 2500.0f;
        notebook.desconto = 0.1f;

        System.out.println("Nome do Produto: " + notebook.nome);
        System.out.println("Preço Inicial: " + notebook.preco);

        notebook.aumentarPreco(200.0f);
        System.out.println("Preço após aumento: " + notebook.preco);

        Produto caneta = new Produto();
        caneta.nome = "Caneta Bic";
        caneta.preco = 3.5f;
        caneta.desconto = 0.05f;

        System.out.println("Nome do Produto: " + caneta.nome);
        System.out.println("Preço Inicial: " + caneta.preco);

        caneta.aumentarPreco(1.0f);
        System.out.println("Preço após aumento: " + caneta.preco);
    }
}
