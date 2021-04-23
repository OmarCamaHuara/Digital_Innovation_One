package Java11Release;

public class StringRepeat {
    public static void main(String[] args) {
        String nome = "Omar";
        String aux = " ";
        for (int numero = 0; numero < 10; numero++){
            aux+=nome;
        }
        System.out.println(aux);

        nome = "Yhermaya";
        System.out.println(nome.repeat(1000));
    }
}
