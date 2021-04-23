package InferenciaExemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class InferenciaEx {

    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
        printarNomeCompleto("Omar", "Santos");
        printarSoma(8, 6,9);
    }

    public static void connectAndPrintURLJavaOracle() {

        try{
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replace(">", ">\n"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    // CONSEGUI
    //variaveis local inicializadas
    // variaveis suporte do enhaced for
    // variaveis suport do for interativo
    // variavel try with resource

    // NAO SONSEGUI
    // var noa pode ser utilizado em nivel de classe
    // var noa pode ser utilizado como parametro
    // nao pode ser utilizada en variaveis localeis nao inicializados

    public static void printarNomeCompleto(String nome, String sobrenome){
        System.out.println("Nome completo "+nome+ " "+sobrenome);
    }
    public static void printarSoma(int... numeros){
        int soma1;
        int soma2;
        if(numeros.length > 0){
            soma1 = 0;
            soma2 = 0;
            for (var numero : numeros){
                soma1 += numero;
            }
            for (var numero = 0; numero < numeros.length; numero++){
                soma2 += numeros[numero];
            }
            System.out.println("A Soma e: "+soma1);
            System.out.println("A Soma e: "+soma2);
        }
    }
}
