
import br.com.hosana.modelos.Conta;

public class FazDeposito implements Runnable {
    private final Conta conta;
    private final double valor;

    public FazDeposito(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void run() {
        conta.depositar(valor);
    }
}
