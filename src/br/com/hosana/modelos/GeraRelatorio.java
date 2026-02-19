package br.com.hosana.modelos;

public class GeraRelatorio implements Runnable {
    @Override
    public void run() {
        geraRelatorio();
    }

    public void geraRelatorio() {
        for (int i = 0; i <= 10000; i++) {
            System.out.println("Gerando relatório: " + (i / 100) + "%" );
        }
    }
}
