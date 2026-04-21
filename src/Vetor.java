import br.com.hosana.modelos.Aluno;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int posicaoNovoAluno = 0;

    public void adicionaAluno(Aluno aluno) {
        this.garantirEspaco();
        this.alunos[posicaoNovoAluno] = aluno;
        posicaoNovoAluno = posicaoNovoAluno + 1;
    }

    public void adicionaAluno(int posicao, Aluno aluno) {
        this.garantirEspaco();
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição " + posicao + " inválida!");
        }
        for (int i = posicaoNovoAluno - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i];
        }
        this.alunos[posicao] = aluno;
        posicaoNovoAluno++;
    }

    public Aluno encontraAluno(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição " + posicao + " inválida!");
        }
        return this.alunos[posicao];
    }

    public void removeAluno(int posicao) {
        for (int i = posicao; i < this.posicaoNovoAluno; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        posicaoNovoAluno--;
    }

    public boolean contemAluno(Aluno aluno) {
        for (int i = 0; i < posicaoNovoAluno; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
        }
        return false;
    }

    public int quantidadeAlunos() {
        return this.posicaoNovoAluno;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos);
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < posicaoNovoAluno;
    }

    private void garantirEspaco() {
        if (posicaoNovoAluno == alunos.length) {
            Aluno[] novoArrayAlunos = new Aluno[alunos.length * 2];
            System.arraycopy(alunos, 0, novoArrayAlunos, 0, alunos.length);
            this.alunos = novoArrayAlunos;
        }
    }
}
