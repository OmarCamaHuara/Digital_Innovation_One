package InterfaceFuncional;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessao = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessao.get());
        System.out.println(instanciaPessoa2.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;
    public Pessoa(){
        nome = "Omar";
        idade = 30;
    }
    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
