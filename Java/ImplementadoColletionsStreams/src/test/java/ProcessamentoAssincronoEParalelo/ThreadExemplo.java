package ProcessamentoAssincronoEParalelo;

import java.util.Set;

public class ThreadExemplo {
    public static void main(String[] args) {
        GeradorPDF iniciarGerarPDF = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);

        iniciarGerarPDF.start();
        iniciarBarraDeCarregamento.start();

    }
}
class GeradorPDF extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Iniciar geracao de PDF");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGerarPDF;
    public BarraDeCarregamento(Thread iniciarGerarPDF) {
        this.iniciarGerarPDF = iniciarGerarPDF;
    }

    @Override
    public void run(){
        while(true) {
            try {
                Thread.sleep(500);
                if (!iniciarGerarPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}






//class BarraDeCarregamento2 extends Thread {
//    @Override
//    public void run(){
//        super.run();
//
//
//        try {
//            Thread.sleep(3000);
//            System.out.println("Rodei BarraDeCarregamento2 " + this.getName());
//        }catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class BarraDeCarregamento3 extends Thread {
//    @Override
//    public void run(){
//        super.run();
//
//
//        try {
//            Thread.sleep(1000);
//            System.out.println("Rodei BarraDeCarregamento3 " + this.getName());
//        }catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
