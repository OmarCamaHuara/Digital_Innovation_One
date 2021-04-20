package ParadigmaFuncional;


import java.util.Arrays;

public class CompocicaoDeFuncoes {
    public static void main(String[] args) {
        int[] valores = {1,2,3,4,5};
        System.out.println("******* Paradigma Funcional ******");
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero *2)
                .forEach(numero -> System.out.println("resposta: "+numero));

        System.out.println("******* Paradigma Imperativo ******");
        for (int i = 0; i< valores.length; i++){
            int valor = 0;
            if (valores[i] % 2 == 0 ){
                valor = valores[i] *2;

                if (valor != 0){
                    System.out.println(valor);
                }
            }
        }
    }
}
