package br.com.hosana.modelos;

import br.com.hosana.interfaces.IEletronico;

public class Ventilador implements IEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ventilador ligado.");
        } else {
            System.out.println("Ventilador já está ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ventilador desligado.");
        } else {
            System.out.println("Ventilador já está desligado.");
        }
    }
}
