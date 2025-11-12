package br.com.hosana.modelos;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionaContato(Contato contato) {
        contatos.add(contato);
    }

    public void removeContato(Contato contato) {
        contatos.remove(contato);
    }

    public int buscaContatoPorNome(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o contato não for encontrado
    }

    public void imprimeAgenda() {
        System.out.println("-------- Agenda de Contatos --------");
        for (Contato contato : contatos) {
            contato.imprimeInformacoes();
            if (contatos.indexOf(contato) < contatos.size() - 1) {
                System.out.println("-------------------");
            }
        }
        System.out.println("-------- Fim da Agenda --------");
    }

    public void imprimeContatoPorIndice(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.get(indice).imprimeInformacoes();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
