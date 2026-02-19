
import br.com.hosana.modelos.BarraDeProgresso;
import br.com.hosana.modelos.GeraRelatorio;

public class Progresso {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();
        Thread threadBarra = new Thread(barra);
        threadBarra.start();

        GeraRelatorio relatorio = new GeraRelatorio();
        Thread threadRelatorio = new Thread(relatorio);
        threadRelatorio.start();
    }
}
