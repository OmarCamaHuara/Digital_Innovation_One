package one.digitalInnovation.Omar.Cama;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Delicia");
        filaBanco.add("Felicidad");
        filaBanco.add("Jose");

        System.out.println("### Mostrando List ###");
        System.out.println(filaBanco);

        System.out.println("### ADD e REMOVE ###");

        System.out.println("### POLL ###"); //
        String clienteASerAntendido = filaBanco.poll();
        System.out.println(clienteASerAntendido);
        System.out.println(filaBanco);
        System.out.println("### PEEK ###"); // solo para saver quien es el primeiro
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);
        System.out.println("### ELEMTO ###"); // No tenemo elementos
        //filaBanco.clear();
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);
        System.out.println("### Mostrando Vetor - for ###");
        for (String client: filaBanco){
            System.out.println(client);
        }
        System.out.println("### Mostrando Vetor - while ###");
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());

    }
}
