package br.com.hosana.interfaces;

/*
    Uma interface em Java é um contrato que define um conjunto de métodos que uma classe
    deve implementar. Ela especifica o que uma classe deve fazer, mas não como fazê-lo.
    As interfaces são usadas para definir comportamentos comuns entre classes diferentes,
    permitindo a implementação de múltiplas heranças e promovendo a flexibilidade e a
    reutilização de código.

    Uma interface pode conter:
    - Métodos abstratos: Declarações de métodos sem implementação.
    - Constantes: Variáveis estáticas e finais (constantes) que são compartilhadas
      entre todas as classes que implementam a interface.
*/

public interface IEletronico {
    // Todo produto eletrônico que implementar essa interface é da marca "Hosana Eletrônicos"
    public String marca = "Hosana Eletrônicos";

    public void ligar();
    public void desligar();
}
