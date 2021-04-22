package digital.innovation.one.test.core;

import digital.innovation.one.test.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(8,1));
    }
}
