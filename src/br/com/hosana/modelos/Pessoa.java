package br.com.hosana.modelos;

// Conhecida como clase base, classe mãe, classe pai, superclasse e classe genérica.
public abstract class Pessoa {
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

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Ano de Nascimento: " + this.anoNascimento;
    }

    public String mensagem() {
        return "Olá, meu nome é " + this.nome + " e nasci em " + this.anoNascimento + ".";
    }

    public String mensagem(String idioma) {
        return switch (idioma) {
            case "en" -> "Hello, my name is " + this.nome + " and I was born in " + this.anoNascimento + ".";
            case "es" -> "Hola, me llamo " + this.nome + " y nací en " + this.anoNascimento + ".";
            default -> mensagem();
        };
    }

    public abstract void outraMensagem(String mensagem);
}
