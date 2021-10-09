package ParadigmaFuncional;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        Funcao colocarPrefixoNaString = new Funcao(){
            @Override
            public String gerar(String valor) { return "Dom. "+valor; }
        };
        System.out.println(colocarPrefixoNaString.gerar("Omar"));
    }
}
