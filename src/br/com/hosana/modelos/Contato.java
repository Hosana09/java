package br.com.hosana.modelos;
public class Contato {
    String nome;
    String email;
    int telefone;

    /**
     * Construtor da classe Contato.
     * 
     * @param nome    O nome do contato.
     * @param email   O email do contato.
     * @param telefone O telefone do contato.
     */
    public Contato(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void imprimeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
