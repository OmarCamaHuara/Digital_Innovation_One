package one.digitalInnovation.Omar.Cama;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ximena");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Fidel");
        nomes.add("Edik");
        nomes.add("Gisele");
        nomes.add("Felipe");
        nomes.add("Vitoria");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(2, "Juan");
        System.out.println(nomes);
        nomes.remove(6);
        System.out.println(nomes);
        nomes.remove("Edik");
        System.out.println(nomes);
        String nome = nomes.get(2);
        System.out.println(nome);
        int tamanho = nomes.size();
        System.out.println(tamanho);
        boolean temFidel = nomes.contains("Felipe");
        System.out.println(temFidel);
        int posicao = nomes.indexOf("Gisele");
        System.out.println("index de Gisele "+posicao);

        System.out.println("----- For each -----");
        for (String nomeDoItem: nomes){
            System.out.println(nomeDoItem);
        }
        System.out.println("----- While -----");
        Iterator<String> interator = nomes.iterator();
        while(interator.hasNext()){
            System.out.println(interator.next());
        }

        nomes.clear();
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
        System.out.println(nomes);
    }
}
