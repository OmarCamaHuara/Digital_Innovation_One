package InterfaceFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Sara", "Mariana", "Verenise", "Paula", "Liz"};
        Integer[] numeros = {45, 46, 87, 66, 78, 6};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosNomes(nomes);
//        imprimirODobroDeCadaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Liz")){
                nomesParaImprimir+=" "+nomes[i];
            }
        }

        System.out.println("Nomes do FOR "+nomesParaImprimir);

        String nomesParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Mariana"))
                .collect(Collectors.joining());
        System.out.println("Nomes do Stream "+ nomesParaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes) {
        for (String nome : nomes){
            System.out.println("Imprimido pelo FOR: "+nome);
        }
        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimendo pelo FORECH "+nome ));
    }
    public static void imprimirODobroDeCadaLista(Integer... numeros){
        for (Integer numero: numeros) {
            System.out.println(numero * 2);
        }
        Stream.of(numeros).map(numero -> numero*2)
                        .forEach(System.out::println);
    }
}
