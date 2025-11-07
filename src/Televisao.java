public class Televisao {
    boolean ligada;
    int volume;
    int canal;
    ControleRemoto controleRemoto;

    public Televisao() {
        this.ligada = false;
        this.volume = 10;
        this.canal = 1;
        this.controleRemoto = new ControleRemoto();
    }

    void ligaDesliga() {
        this.ligada = controleRemoto.ligaDesliga(this.ligada);

        if (this.ligada) {
            System.out.println("A TV está ligada.");
        } else {
            System.out.println("A TV está desligada.");
        }
    }

    void aumentarVolume() {
        this.volume = controleRemoto.aumentarVolume(this.volume);
        System.out.println("Volume aumentado. Volume atual: " + this.volume);
    }

    void diminuirVolume() {
        this.volume = controleRemoto.diminuirVolume(this.volume);
        System.out.println("Volume diminuído. Volume atual: " + this.volume);
    }

    void mudarCanalParaCima() {
        this.canal = controleRemoto.mudarCanalParaCima(this.canal);
        System.out.println("Canal mudado para cima. Canal atual: " + this.canal);
    }

    void mudarCanalParaBaixo() {
        this.canal = controleRemoto.mudarCanalParaBaixo(this.canal);
        System.out.println("Canal mudado para baixo. Canal atual: " + this.canal);
    }

    void mudarCanal(int novoCanal) {
        int canalAlterado = controleRemoto.mudarCanal(novoCanal);
        if (canalAlterado != -1) {
            this.canal = canalAlterado;
            System.out.println("Canal " + novoCanal + " solicitado. Canal alterado para: " + this.canal);
        } else {
            System.out.println("Canal inválido. Por favor, escolha um canal entre 1 e 999.");
        }
    }

}
