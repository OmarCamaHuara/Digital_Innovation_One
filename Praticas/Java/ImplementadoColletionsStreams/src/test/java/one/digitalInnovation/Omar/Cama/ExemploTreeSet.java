package one.digitalInnovation.Omar.Cama;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapital = new TreeSet<>();
        // Montana a arvore com as capitais
        treeCapital.add("Porto Alegre");
        treeCapital.add("Florianopolis");
        treeCapital.add("Curitiva");
        treeCapital.add("Sao Paulo");
        treeCapital.add("Rio de Janeiro");
        treeCapital.add("Belo Horizonte");

        System.out.println("### Mostrar Arvore ###");
        System.out.println(treeCapital);

        System.out.println("### Retornar a primeira capital no topo da arvore ###");
        System.out.println(treeCapital.first());

        System.out.println("### Retornar a ultima capital no final da arvore ###");
        System.out.println(treeCapital.last());

        System.out.println("### Retorna a primeira capital abaixo na arvore da capital parametrizada ###");
        System.out.println(treeCapital.lower("Florianopolis"));

        System.out.println("### Retorna a primeira capital acima na arvore de capital parametrizada ###");
        System.out.println(treeCapital.higher("Florianopolis"));

        System.out.println("### Exibe todas as capitais no console ###");
        System.out.println(treeCapital);

        System.out.println("### Retorna a primeira capital no topo de arvore, removendo do set ###");
        System.out.println(treeCapital.pollFirst());

        System.out.println("### Retorna a primeira capital no final da arvore, removendo do set ###");
        System.out.println(treeCapital.pollLast());
    }
}
