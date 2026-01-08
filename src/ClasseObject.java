/*
    A classe Object é a superclasse raiz de todas as classes em Java. Isso significa que todas as classes em Java herdam, direta ou indiretamente, da classe Object.
    Ela fornece métodos básicos que são comuns a todos os objetos, como toString(), equals(), hashCode(), e clone().
    A classe Object é definida no pacote java.lang, que é automaticamente importado em todos os programas Java.
*/

public class ClasseObject {
    public static void main(String[] args) {
        // Criando dois objetos da classe Object
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Usando o método toString() para obter a representação em string dos objetos
        System.out.println("obj1: " + obj1.toString());
        System.out.println("obj2: " + obj2.toString());

        // Usando o método equals() para comparar os objetos
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));

        // Usando o método hashCode() para obter o código hash dos objetos
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
    }
}
