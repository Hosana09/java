package br.com.hosana.modelos;

// Quando uma classe herda de outra, ela  ganha toodos os atributos e métodos da classe pai.
// A classe Aluno herda da classe Pessoa.
// Conhecida como classe filha, subclasse ou classe específica.
public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno(String nome, int anoNascimento, String ra, String curso) {
        super(nome, anoNascimento);
        // como se fosse Pessoa(nome, anoNascimento);
        this.ra = ra;
        this.curso = curso;
    }

    public String getRa() {
        return this.ra;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + ", RA: " + this.ra + ", Curso: " + this.curso;
    }
}
