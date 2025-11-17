package br.com.hosana.modelos;

public class Professor extends Pessoa {
    private String matricula;

    public Professor(String nome, int anoNascimento, String matricula) {
        super(nome, anoNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + this.matricula;
    }

    @Override
    public void outraMensagem(String mensagem) {
        System.out.println("Mensagem do Professor: " + mensagem);
    }
}
