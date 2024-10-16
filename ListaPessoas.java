import java.util.ArrayList;
import java.util.Collections;

public class ListaPessoas {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("Sara");
        pessoas.add("Hosana");
        pessoas.add("Gabriel");
        pessoas.add("Graziella");
        pessoas.add("Giovani");
        pessoas.add("Ramon");
        pessoas.add("William");
        pessoas.add("Eric");
        System.out.println(pessoas);
        System.out.println(pessoas.get(0));
        pessoas.set(0, "Aparecida");
        pessoas.remove(5);
        pessoas.remove("Eric");
        System.out.println(pessoas.get(0));
        System.out.println(pessoas.size());
        System.out.println(pessoas.contains("Hosana"));
        System.out.println(pessoas.isEmpty());

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }

        Collections.sort(pessoas);
        System.out.println(pessoas);

        pessoas.clear();
        System.out.println(pessoas);
    }
}
