public class ThreadFunction {

    public static void main(String[] args) {
   BarradeCarregamento2 barradeCarregamento2 = new BarradeCarregamento2();
   BarradeCarregamento2 barradeCarregamento22 = new BarradeCarregamento2();
   barradeCarregamento2.start();
   barradeCarregamento22.start();


    }
}


class GerarPDF implements Runnable{

    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run() {
        System.out.println("Loading...");

    }
}

class BarradeCarregamento2 extends Thread{
    public void run(){
        super.run();
        System.out.println("rodei: " + this.getName());
    }
}