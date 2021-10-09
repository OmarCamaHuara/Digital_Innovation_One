package one.digitalInnovation.Omar.Cama;

import java.util.List;
import java.util.Vector;

public class ExemploVetor {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // Adicionando 4  esportes no vetor
        esportes.add("Basket-ball");
        esportes.add("Futebol");
        esportes.add("Tenis");
        esportes.add("Handbol");
        System.out.println("### Mostrando Vetor ###");
        System.out.println(esportes);

        // Altera o valor da posicao 2 do vetor
        System.out.println("### Posicao 2 Ping-Pong ###");
        esportes.set(2, "Ping-Pong");
        System.out.println(esportes);

        // Remover o esporte da posicao 3
        System.out.println("### Removendo esporte do index 3 ###");
        esportes.remove(3);
        System.out.println(esportes);

        // Retornando o primeiro item do vetor
        System.out.println("### Primeiro Item ###");
        System.out.println(esportes.get(0));

        // Navegando por todos os esports
        System.out.println("### Vetor com for each ###");
        for (String esporte: esportes){
            System.out.println(esporte);
        }

    }
}
