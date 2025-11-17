package br.com.hosana.templatemethod;

public class TreinamentoFimTemporada extends Treinamento {

    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de fim de temporada realizado.");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de fim de temporada realizado.");
    }

}
