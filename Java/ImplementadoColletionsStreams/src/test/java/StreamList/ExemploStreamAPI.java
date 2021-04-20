package StreamList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args){
        // cria a colecao de estudantes
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Juana");
        estudantes.add("Mitsu");
        estudantes.add("Gabriel");
        estudantes.add("Lesly");
        estudantes.add("Anabel");
        estudantes.add("Dimitri");

        System.out.println("-- Retorna a contagem de elementos do stream --");
        System.out.println("Contagem: "+ estudantes.stream().count());

        System.out.println("-- Retorna o elemento com maior cantidade de letras --");
        System.out.println("Maior numero de letras: "+ estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("-- Retorna o elemento com menor cantidade de letras --");
        System.out.println("Menos numero de letras: "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("-- Retorna os elementos que tem a letra R no nome --");
        System.out.println("Com letra R no nome: "+ estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("-- Retorna uma nova colecao, com os nomes concatenados a quantidade de letras de cada nome --");
        System.out.println("Retorna uma nova colecao com a quantidade de letras: "+ estudantes.stream().map(estudante ->
                estudante.concat("-").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("-- Retorna somente os 3 primeiros elementos de cada colecao --");
        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("-- Exibe cada elemento no cosole, e depois retorna a mesma colecao --");
        System.out.println(estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("-- Exibe cada elemento no console sem retornar outra colecao --");
        estudantes.stream().forEach(System.out::println);

        System.out.println("-- Retorna true si todos os elementos possuem a letra W no nome --");
        System.out.println(estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        System.out.println("-- Tem algum elemento com a minuscula no nome --");
        System.out.println(estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("-- Nao tem ninhum elemento com a minuscula no nome --");
        System.out.println(estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("-- Retorna o primeir elemento da colecao --");
        estudantes.stream().findFirst().ifPresent(System.out::println);

    }
}
