package br.com.hosana.modelos;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    /**
     * Adiciona um contato à agenda.     * 
     * @param contato O contato a ser adicionado.
     */
    public void adicionaContato(Contato contato) {
        contatos.add(contato);
    }

    /**
     * Remove um contato da agenda.
     * 
     * @param contato O contato a ser removido.
     */
    public void removeContato(Contato contato) {
        contatos.remove(contato);
    }

    /**
     * Busca um contato pelo nome e retorna seu índice na lista.
     * 
     * @param nome O nome do contato a ser buscado.
     * @return O índice do contato na lista ou -1 se não encontrado.
     */
    public int buscaContatoPorNome(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1; // Retorna -1 se o contato não for encontrado
    }

    /**
     * Imprime todos os contatos da agenda.
     */
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

    /**
     * Imprime as informações do contato no índice especificado.
     * 
     * @param indice O índice do contato a ser impresso.
     */
    public void imprimeContatoPorIndice(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            contatos.get(indice).imprimeInformacoes();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
