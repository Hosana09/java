import br.com.hosana.modelos.Aluno;
import br.com.hosana.modelos.Produto;
import br.com.hosana.modelos.Professor;

public class Classes {
    public static void main(String[] args) {
        //  Instanciando um objeto da classe Produto
        Produto notebook = new Produto("Notebook", 2500.0f, 0.1f);
        System.out.println("Local alocado em memoria para o objeto produto: " + notebook);
        notebook.imprimeInformacoes();

        // Antes da adição do construtor
        // notebook.nome = "Notebook";
        // notebook.preco = 2500.0f;
        // notebook.desconto = 0.1f;

        // Antes da adição do método imprimeInformacoes
        // System.out.println("Nome do Produto: " + notebook.nome);
        // System.out.println("Preço Inicial: " + notebook.preco);

        notebook.aumentarPreco(200.0f);
        System.out.println("Preço após aumento: " + notebook.preco);

        Produto caneta = new Produto("Caneta Bic", 3.5f, 0.05f);
        caneta.imprimeInformacoes();

        // Antes da adição do construtor
        // caneta.nome = "Caneta Bic";
        // caneta.preco = 3.5f;
        // caneta.desconto = 0.05f;

        // Antes da adição do método imprimeInformacoes
        // System.out.println("Nome do Produto: " + caneta.nome);
        // System.out.println("Preço Inicial: " + caneta.preco);

        caneta.aumentarPreco(1.0f);
        System.out.println("Preço após aumento: " + caneta.preco);

        Aluno hosana = new Aluno("Hosana", 2000, "123456", "Engenharia de Software");
        System.out.println("Nome do Aluno: " + hosana.getNome());
        System.out.println(hosana);
        System.out.println(hosana.mensagem("es"));

        Professor silvia = new Professor("Silvia", 1980, "654321");
        System.out.println("Nome do Professor: " + silvia.getNome());
        System.out.println(silvia);
        System.out.println(silvia.mensagem());
    }
}
