public class ControleRemoto {
    boolean ligaDesliga(boolean ligada) {
        return !ligada;
    }

    int aumentarVolume(int volume) {
        if (volume < 100) {
            return volume + 1;
        } else {
            return volume;
        }        
    }

    int diminuirVolume(int volume) {
        if (volume > 0) {
            return volume - 1;
        } else {
            return volume;
        }
    }

    int mudarCanalParaCima(int canal) {
        if (canal < 999) {
            return canal + 1;
        } else {
            return canal;
        }
    }

    int mudarCanalParaBaixo(int canal) {
        if (canal > 1) {
            return canal - 1;
        } else {
            return canal;
        }
    }

    int mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 999) {
            return novoCanal;
        } else {
            return -1; // Indica canal inválido
        }
    }
}
