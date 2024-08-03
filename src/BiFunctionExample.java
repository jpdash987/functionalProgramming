import java.util.function.BiFunction;

public class BiFunctionExample
{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(1, 2));
    }
}

// TAKES ARGUMENT TYPE <T,R> AND RETURNS RESULT U ...