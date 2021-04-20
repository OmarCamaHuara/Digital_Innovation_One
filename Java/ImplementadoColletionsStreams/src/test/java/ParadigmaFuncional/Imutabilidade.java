package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retorinarDobro = v -> v * 2;
        System.out.println(retorinarDobro.apply(valor)); // retorna o dobro do valor
        System.out.println(valor); // valor nao sera aterado
    }
}
