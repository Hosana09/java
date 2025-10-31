public class ExerciciosFor {
    public static void main(String[] args) {
        System.out.println("Tabuada do 3:");
        int multiplicador;
        for (multiplicador = 1; multiplicador <= 5; multiplicador++) {
            System.out.println("3x" + multiplicador + " = " + (3 * multiplicador));
        }

        System.out.println("Contando até 100 com for:");
        int contador;
        for (contador = 1; contador <= 100; contador++) {
            System.out.println(contador);
        }

        System.out.println("Contando até 100 com while:");
        int numero = 1;
        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }

        System.out.println("Contando até 100 com do-while:");
        int outroNumero = 1;
        do {
            System.out.println(outroNumero);
            outroNumero++;
        } while (outroNumero <= 100);


        System.out.println("Acrescentando de 1000 em 1000 até 100000:");
        int incremento;
        for (incremento = 0; incremento <= 100000; incremento += 1000) {
            System.out.println(incremento);
        }
    }
}
