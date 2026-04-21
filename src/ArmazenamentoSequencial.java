import br.com.hosana.modelos.Aluno;

public class ArmazenamentoSequencial {
    public static void main(String[] args) {
        /*
        int[] numeros = new int[5];

        numeros[4] = 9;

        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros[0]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição " + i + ": " + numeros[i]);
        }
        */

        Aluno aluno1 = new Aluno("Hosana", 2000, "123456789", "DSM");
        Aluno aluno2 = new Aluno("Gabriel", 1998, "123456780", "DSM");
        Aluno aluno3 = new Aluno("Aparecida", 1965, "123456779", "DSM");

        Vetor listaAlunos = new Vetor();
        System.out.println("Total de alunos: " + listaAlunos.quantidadeAlunos());
        listaAlunos.adicionaAluno(aluno1);
        System.out.println("Total de alunos: " + listaAlunos.quantidadeAlunos());
        listaAlunos.adicionaAluno(aluno2);
        System.out.println("Total de alunos: " + listaAlunos.quantidadeAlunos());
        System.out.println("Contém aluno " + aluno3 + "? Resposta: " + listaAlunos.contemAluno(aluno3) + ".");
        System.out.println("Contém aluno " + aluno1 + "? Resposta: " + listaAlunos.contemAluno(aluno1) + ".");

        System.out.println(listaAlunos);

        System.out.println("Aluno na posição 1 : {" + listaAlunos.encontraAluno(1) + "}.");
        try {
            System.out.println("Aluno na posição 99 : {" + listaAlunos.encontraAluno(99) + "}.");
        } catch (IllegalArgumentException e) {
            System.out.println("Aluno na posição 99 não existe.");
            System.out.println(e.getMessage());
        }

        listaAlunos.adicionaAluno(0, aluno3);
        System.out.println(listaAlunos);

        listaAlunos.removeAluno(0);
        System.out.println(listaAlunos);

    }
}
