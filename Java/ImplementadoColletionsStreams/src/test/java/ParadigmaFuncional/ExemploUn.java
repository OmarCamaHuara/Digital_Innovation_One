package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class ExemploUn {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVecesTrinta = valor -> valor *3;
        int valor = 10;
        System.out.println("O reulstado e: "+ calcularValorVecesTrinta );
    }
}
