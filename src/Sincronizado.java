
import br.com.hosana.modelos.Conta;

/*
Por padrão, as threads em Java não são sincronizadas, o que significa que podem acessar e modificar recursos compartilhados (como variáveis ou objetos) de forma concorrente,
o que pode levar a condições de corrida e resultados imprevisíveis. Para evitar isso, é necessário sincronizar o acesso a esses recursos compartilhados.
O sincronismo ocorre durante a execução do método quando uma thread adquire um bloqueio (lock) em um objeto específico. 
Enquanto uma thread possui o bloqueio, outras threads que tentarem acessar o mesmo recurso serão bloqueadas até que a thread atual libere o bloqueio.
A sincronização só ocorre quando o método é declarado com a palavra-chave synchronized, ou seja, quando o método é sincronizado.
*/

public class Sincronizado {
    public static void main(String[] args) {
        Conta conta = new Conta("Hosana");
        Thread t1 = new Thread(new FazDeposito(conta, 100.0));
        Thread t2 = new Thread(new FazDeposito(conta, 200.0));

        t1.start();
        t2.start();

        // Sincronização para garantir que as threads t1 e t2 terminem antes de acessar o saldo final da conta
        try {
            t1.join();
            t2.join();
            // A função join adiciona uma espera para que a thread t1 e t2 terminem sua execução antes de continuar com o restante do código.
        } catch (InterruptedException e) {
            System.out.println("Thread interrompida: " + e.getMessage());
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
