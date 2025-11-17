package br.com.hosana.templatemethod;

public class Treinamentos {
    public static void main(String[] args) {
        TreinamentoInicioTemporada treinamentoInicio = new TreinamentoInicioTemporada();
        treinamentoInicio.treinoDiario();

        TreinamentoFimTemporada treinamentoFim = new TreinamentoFimTemporada();
        treinamentoFim.treinoDiario();
    }
}
