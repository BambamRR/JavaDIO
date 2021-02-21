import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> testeDeRetorno = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(testeDeRetorno.apply("banana"));





    }
    public static int Somatorio( int a, int b){
        return a + b;
    }



}
