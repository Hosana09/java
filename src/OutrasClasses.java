
import br.com.hosana.modelos.Conta;
import br.com.hosana.modelos.Ventilador;

public class OutrasClasses {
    public static void main(String[] args) {
        Ventilador ventilador = new Ventilador();
        ventilador.ligar();
        ventilador.ligar();
        ventilador.desligar();

        Conta contaDaHosana = new Conta("Hosana");
        System.out.println("Conta número: " + contaDaHosana.getNumero());
        System.out.println("Cliente: " + contaDaHosana.getCliente());

        Conta.proximaconta();

        Conta contaDoGabriel = new Conta("Gabriel");
        System.out.println("Conta número: " + contaDoGabriel.getNumero());
        System.out.println("Cliente: " + contaDoGabriel.getCliente());

        Conta.proximaconta();
    }
}
