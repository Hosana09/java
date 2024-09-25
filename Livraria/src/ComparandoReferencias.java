public class ComparandoReferencias {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789-10";

        Autor outroAutor = new Autor();
        outroAutor.nome = "Rodrigo Turini";
        outroAutor.email = "rodrigo.turini@caelum.com.br";
        outroAutor.cpf = "123.456.789-10";

        if (autor == outroAutor) {
            System.out.println("Iguais, mesmo autor!");
        } else {
            System.out.println("Diferentes!");
        }
    }
}
