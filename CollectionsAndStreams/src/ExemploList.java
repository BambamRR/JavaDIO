import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploList {
    public static void main(String[] args) {

     List<String> nomes = new ArrayList<>();
     nomes.add("Juliana");
     nomes.add("Pedro");
     nomes.add("Carlos");
     nomes.add("Larissa");
     nomes.add("João");
     nomes.add("Leonardo");
     nomes.add("Camila");

     nomes.stream()
             .filter(nome -> nome.startsWith("L"))
             .forEach(System.out::println);



        System.out.println(nomes);
        //Retorna a contagem de elementos do stream
        System.out.println("Contagem: " + nomes.stream().count());

        System.out.println("Com a letra R no nome: " + nomes.stream().filter((estudante) ->
           estudante.toLowerCase().contains("r")).collect(Collectors.toList())) ;


        for(String Listagem: nomes){
            System.out.println(Listagem);
        }

     boolean contem = nomes.contains("Juliano");
        System.out.println(contem);









    }



}
