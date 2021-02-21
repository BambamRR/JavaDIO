import java.util.*;

public class QueueTest<S> {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");

        System.out.println(filaBanco);

         String primeiroDaFila = filaBanco.peek();

        System.out.println(primeiroDaFila);

        String primeiroDaFilaRemovido = filaBanco.poll();

        System.out.println(filaBanco);

        filaBanco.add("Daniel");

        System.out.println(filaBanco);

        int tamanhoDaFila = filaBanco.size();

        System.out.println(tamanhoDaFila);

        System.out.println(filaBanco.contains("Carlos"));





    }


    }