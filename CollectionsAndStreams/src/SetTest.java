import java.util.*;

public class SetTest {

    public static void main(String[] args) {


        TreeSet<Integer> notas = new TreeSet<>();

        notas.add(3);
        notas.add(88);
        notas.add(20);
        notas.add(44);
        notas.add(3);

        System.out.println(notas);

        notas.remove(3);

        System.out.println(notas);

        notas.add(23);
        System.out.println(notas);

        System.out.println(notas.size());

        notas.clear();

        System.out.println(notas.isEmpty());

    }

}
