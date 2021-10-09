package ParadigmaFuncional;

public class TailCallFatorial {
    public static void main(String[] args) {
        System.out.println(factorialA(8));
    }

    private static double factorialA(double valor) {
        return fatorialComTailCall(valor, 1);
    }

    private static double fatorialComTailCall(double valor, double numero) {
        if (valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1, numero * valor);
    }
}
