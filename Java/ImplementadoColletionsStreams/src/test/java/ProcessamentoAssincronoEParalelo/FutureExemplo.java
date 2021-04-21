package ProcessamentoAssincronoEParalelo;

import org.apache.catalina.LifecycleState;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService pessoasParaExecutarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
//        casa.obterAfazeresDaCasa().forEach( atividade -> pessoasParaExecutarAtividades.execute(() -> atividade.realizar()));
        List<? extends Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividades.submit(() -> {
                    try {
                        return atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        while(true){
            int numeroDeAtividadesNaoFinalizadas = 0;
            for(Future<?> futuro : futuros){
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabens voce terminou de "+ futuro.get());
                        futuros.remove(futuro);
                    }catch (InterruptedException | ExecutionException e){
                        e.printStackTrace();
                    }
                }else{
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Numero de atividades noa finalizada:: "+numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }

        pessoasParaExecutarAtividades.shutdown();

    }
}
class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos){ this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeresDaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade{
    String realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}
class Quarto extends Comodo{
    @Override
    List<Atividade> obterAfazeresDoComodo() {
//        ArrayList<Atividade> objects = new ArrayList<>();
//        objects.add(this::getArrumaACama);
        return Arrays.asList(
//              () -> this.arrumaGuardaRoupa(),
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumaGuardaRoupa
        );
    }
    private String arrumaGuardaRoupa() throws InterruptedException{
        Thread.sleep(5000);
        String arrumarGuardaRoupa = "Arrumar Guarda roupa";
        System.out.println(arrumarGuardaRoupa);
        return arrumarGuardaRoupa;
    }
    private String varrerOQuarto() throws InterruptedException{
        Thread.sleep(3000);
        String varrerQuarto = "Varrer o Cuarto";
        System.out.println(varrerQuarto);
        return varrerQuarto;
    }
    private String arrumarACama() throws InterruptedException {
        Thread.sleep(8000);
        String arrumarACasa = "Arrumar a casa";
        System.out.println(arrumarACasa);
        return arrumarACasa;
    }
}
