package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleLsit {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Juan", 35));
        estudantes.add(new Estudante("Jose", 30));
        estudantes.add(new Estudante("Maria", 28));
        estudantes.add(new Estudante("Gorge", 35));
        estudantes.add(new Estudante("MAriana", 25));

        System.out.println("--- Orden de insercao ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade()- second.getIdade());

        System.out.println("--- Orden Natural dos Numeros - Idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- Orden Reversa dos numeros - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- Orden natural dos numeros - idade (Methodo reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("--- Ordem Natural dos Numeros - idade (Interface Coparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudandeOrdemIdadeReversaComparator());
        System.out.println("--- Ordem reversa dos numeros - idade (interface Comparator) ---");
        System.out.println(estudantes);

    }
}
