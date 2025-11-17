package br.com.hosana.templatemethod;

/*
    O padrão de projeto Template Method define o esqueleto de um algoritmo em uma operação,
    deixando alguns passos para serem implementados pelas subclasses. Isso permite que as
    subclasses redefinam certos passos de um algoritmo sem alterar sua estrutura geral.
*/

/*
    Final é um modificador de acesso que faz com que o elemento não possa ser extendido ou
    sobrescrito. Quando aplicado a uma classe, impede que outras classes herdem dela. Quando
    aplicado a um método, impede que subclasses sobrescrevam esse método. Quando aplicado a
    uma variável, torna-a uma constante, ou seja, seu valor não pode ser alterado após a
    inicialização.
*/

public abstract class Treinamento {
    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico() {
        System.out.println("Treinamento tático realizado.");
    }
}
