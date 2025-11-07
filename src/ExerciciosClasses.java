public class ExerciciosClasses {
    public static void main(String[] args) {
        Contato ana = new Contato("Ana", "ana@gmail.com", 123456789);
        ana.imprimeInformacoes();
        ana.setTelefone(987654321);
        System.out.println("Telefone atualizado: " + ana.getTelefone());

        Contato bruno = new Contato("Bruno", "bruno@gmail.com", 987654321);
        bruno.imprimeInformacoes();

        Contato hosana = new Contato("Hosana", "hosana@gmail.com", 123123123);
        hosana.imprimeInformacoes();

        Contato gabriel = new Contato("Gabriel", "gabriel@gmail.com", 456456456);
        gabriel.imprimeInformacoes();

        Agenda agenda = new Agenda();
        agenda.adicionaContato(ana);
        agenda.adicionaContato(bruno);
        agenda.adicionaContato(hosana);
        agenda.adicionaContato(gabriel);
        agenda.imprimeAgenda();

        agenda.imprimeContatoPorIndice(0);

        System.out.println(agenda.buscaContatoPorNome("Hosana"));

        agenda.removeContato(hosana);
        agenda.imprimeAgenda();

        System.out.println();

        Televisao tv = new Televisao();
        tv.ligaDesliga();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanalParaCima();
        tv.mudarCanalParaBaixo();
        tv.mudarCanal(45);
        tv.mudarCanal(1000); // Canal inválido
        tv.ligaDesliga();
    }
}
