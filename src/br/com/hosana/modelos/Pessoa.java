package br.com.hosana.modelos;

// Conhecida como clase base, classe mãe, classe pai, superclasse e classe genérica.
public class Pessoa {
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String toString() {
        return "Nome: " + this.nome + ", Ano de Nascimento: " + this.anoNascimento;
    }
}
