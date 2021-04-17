package one.digitalInnovation.Omar.Cama;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSetHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        // Adicionando as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);


        System.out.println("**** Notas ****");
        System.out.println(notasAlunos);

        System.out.println("**** Removendo nota ****");
        notasAlunos.remove(10.0);
        System.out.println(notasAlunos);

        System.out.println("**** Navegar em todos os itens de interator ****");
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("**** Naveganfo em os items ****");
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }
        notasAlunos.clear();
        System.out.println("**** Lista vazia ****");
        System.out.println(notasAlunos.isEmpty());

    }
}
