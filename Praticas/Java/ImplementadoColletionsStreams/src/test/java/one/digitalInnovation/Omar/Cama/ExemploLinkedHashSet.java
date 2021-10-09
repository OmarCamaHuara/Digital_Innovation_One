package one.digitalInnovation.Omar.Cama;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionando os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(13);
        sequenciaNumerica.add(10);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(9);
        System.out.println("**** Removendo nota ****");
        System.out.println(sequenciaNumerica);
        System.out.println("**** Removendo o numero ****");
        sequenciaNumerica.remove(2);
        System.out.println(sequenciaNumerica);
        System.out.println("**** Retornando a quantidade de itens ****");
        System.out.println(sequenciaNumerica.size());
        System.out.println("**** Navegando em todos os items WHILE ****");
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**** Navegando em todos os items FOR ****");
        for(Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
        System.out.println("**** Retorna se o set esta vazio ou nao ****");
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
