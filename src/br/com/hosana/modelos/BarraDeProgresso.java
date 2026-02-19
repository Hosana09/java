package br.com.hosana.modelos;

public class BarraDeProgresso implements Runnable {
    @Override
    public void run() {
        barraDeProgresso();
    }

    public void barraDeProgresso() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Progresso: " + (i / 100) + "%" );
        }
    }
}
