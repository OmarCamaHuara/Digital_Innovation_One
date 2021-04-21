package ProcessamentoAssincronoEParalelo;

import java.util.stream.IntStream;

public class PararelStreamExemplo {
    public static void main(String[] args) {
//        long inicio = System.currentTimeMillis();
//        IntStream.range(1, 1000).forEach(num -> fatorial(num)); //Serial
//        long  fim = System.currentTimeMillis();
//        System.out.println("Tempo de execucao serial:: "+(fim-inicio));

        long inicio = System.currentTimeMillis();
        IntStream.range(1, 1000000).parallel().forEach(num -> fatorial(num)); //Paralelo
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao parallel:: "+(fim-inicio));
    }
    public static long fatorial(long num){
        long fat = 1;
        for(long i = 2; i <= num; i++){
            fat *= i;
        }
        return fat;
    }
}
