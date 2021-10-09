package Java11Release;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionsEx {
    public static void main(String[] args) {
        Collection<String> nomes = List.of("Omar", "Huarahuara", "Yhermaya");
        Collection<String> nomes1 = Set.of("Omar", "Huarahuara", "Yhermaya");
        Collection<String> nomes2 = Arrays.asList("Omar", "Huarahuara", "Yhermaya");


        System.out.println(nomes);
        System.out.println(nomes1);
        System.out.println(nomes2);
    }
}
