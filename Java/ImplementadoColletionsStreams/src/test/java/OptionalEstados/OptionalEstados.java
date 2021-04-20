package OptionalEstados;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalEstados {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que no esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));

        Optional<String> emtyOptional = Optional.empty();

        System.out.println("Valor opcional que nao ta presente");
        emtyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor optional que lanca erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = nao esta presente"));
    }
}
