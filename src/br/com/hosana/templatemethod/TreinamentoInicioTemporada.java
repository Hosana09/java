package br.com.hosana.templatemethod;

public class TreinamentoInicioTemporada extends Treinamento {

    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de início de temporada realizado.");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de início de temporada realizado.");
    }

}
