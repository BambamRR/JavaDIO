import java.util.function.Consumer;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo calculo = ( a, b ) -> a + b;
        System.out.println(executarOperacao(calculo, 1,3));

        Consumer<String> testeDeConsumer = System.out::println;
        testeDeConsumer.accept("Funcionou!");

    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return a + b;

    }


}

interface Calculo{
    public int calcular(int a, int b);
}